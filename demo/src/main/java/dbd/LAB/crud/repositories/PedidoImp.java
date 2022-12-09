package dbd.LAB.crud.repositories;
import dbd.LAB.crud.models.Pedido;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.sql.SQLOutput;
import java.util.List;

public class PedidoImp implements PedidoRepository{


    private Sql2o sql2o;

    @Override
    public Pedido crear(Pedido pedido) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO pedido(id_pedido,subtotal,tipo_entrega," +
                    "ubicacion,id_pago,id_cliente) VALUES(:id_pedido,:subtotal,:tipo_entrega,:Ubicacion" +
                    ",:id_pago,:id_cliente)";
            conn.createQuery(sql,true)
                    .addParameter("id_pedido", pedido.getId_pedido())
                    .addParameter("subtotal",pedido.getSubtotal())
                    .addParameter("tipo_entrega",pedido.getTipo_entrega())
                    .addParameter("ubicacion",pedido.getUbicacion())
                    .addParameter("id_pago",pedido.getId_pago())
                    .addParameter("id_cliente",pedido.getId_cliente())
                    .executeUpdate();
                    return pedido;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public String update(Pedido pedido, int id_pedido, String Tipo_entrega) {
        try(Connection conn = sql2o.open()){
            String updateSql = "update Pedido set tipo_entrega=:tipo_entrega WHERE id_pedido=:id_pedido";
            conn.createQuery(updateSql)
                    .addParameter("id_pedido", id_pedido)
                    .addParameter("tipo_entrega", pedido.getId_pedido())
                    .executeUpdate();
            return "Se actualizo el TIPO DE ENTREGA";

        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar Categoria";
        }
        return null;
    }

    @Override
    public List<Pedido> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from pedido order by id_pedido ASC")
                    .executeAndFetch(Pedido.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public List<Pedido> show(int id_pedido) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Pedido where id_pedido = :id_pedido")
                    .addParameter("id",id_pedido)
                    .executeAndFetch(Pedido.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public void delete(int id_pedido) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Pedido where id_pedido = :id_pedido")
                    .addParameter("id_pedido",id_pedido)
                    .executeUpdate();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
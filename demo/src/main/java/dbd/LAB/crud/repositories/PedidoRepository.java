package dbd.LAB.crud.repositories;
import dbd.LAB.crud.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public interface PedidoRepository {

    public Pedido crear(Pedido pedido);

    public String updateUbicacion(Pedido pedido, int id_pedido);
    public String updateEntrega(Pedido pedido, int id_pedido);

    public List<Pedido> getAll();

    public List<Pedido> show(int id_pedido);

    public void delete(int id_pedido);
}

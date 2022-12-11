package dbd.LAB.crud.repositories;
import dbd.LAB.crud.models.Tienda;

import java.util.List;


public interface TiendaRepository {
    public Tienda crear(Tienda tienda);

    public String updateNombre(Tienda tienda, int id_tienda);

    public List<Tienda> getAll();

    public List<Tienda> show(int id_tienda);

    public void delete(int id_tienda);
}

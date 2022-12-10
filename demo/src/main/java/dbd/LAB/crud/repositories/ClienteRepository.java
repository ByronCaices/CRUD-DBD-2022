package dbd.LAB.crud.repositories;

import dbd.LAB.crud.models.Cliente;
import java.util.List;

public interface ClienteRepository {
    public Cliente crear(Cliente cliente );
    public String update(Cliente cliente , int id_cliente);
    public List<Cliente> getAll();
    public List<Cliente> show(String id_cliente);
    public void delete(String id_cliente);
}
package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Cliente cliente);
    public Cliente guardarCliente(Cliente cliente);
    public Cliente eliminarCliente(Cliente cliente);
}

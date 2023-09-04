package EniNetwork.Inventario.Servicio;

import EniNetwork.Inventario.Modelo.Producto;

import java.util.List;


public interface IProductoServicio {
    public List<Producto> ListarProducto();

    public Producto buscarProductoPorId(Integer idProducto);

    public void GuardarProducto(Producto producto);

    public void EliminarProductoByID(Integer idProducto);
}

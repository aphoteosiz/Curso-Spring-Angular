package EniNetwork.Inventario.Servicio;

import EniNetwork.Inventario.Modelo.Producto;
import EniNetwork.Inventario.Repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Override
    public List<Producto> ListarProducto() {
        this.productoRepositorio.findAll();
        return ListarProducto();


    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto=this.productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public void GuardarProducto(Producto producto) {
        this.productoRepositorio.save(producto);

    }

    @Override
    public void EliminarProductoByID(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);

    }
}

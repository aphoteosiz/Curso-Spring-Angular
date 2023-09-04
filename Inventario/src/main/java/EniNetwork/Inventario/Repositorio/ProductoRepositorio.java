package EniNetwork.Inventario.Repositorio;

import EniNetwork.Inventario.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {

}

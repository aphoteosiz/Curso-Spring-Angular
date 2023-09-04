package EniNetwork.Inventario.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor

public class Producto {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      Integer idProducto;
String Descripcion;
double precio;
Integer Existencia;
}

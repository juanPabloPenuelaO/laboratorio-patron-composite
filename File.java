import java.util.ArrayList;
import java.util.List;

class Archivo implements FileComponent {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles(String indentacion) {
        System.out.println(indentacion + "Archivo: " + nombre);
    }
}
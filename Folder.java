import java.util.ArrayList;
import java.util.List;

class Folder implements FileComponent {
    private String nombre;
    private List<FileComponent> contenido = new ArrayList<>();

    public Folder(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(FileComponent componente) {
        contenido.add(componente);
    }

    public void eliminar(FileComponent componente) {
        contenido.remove(componente);
    }

    @Override
    public void mostrarDetalles(String indentacion) {
        System.out.println(indentacion + "Carpeta: " + nombre);
        for (FileComponent comp : contenido) {
            comp.mostrarDetalles(indentacion + "    ");
        }
    }
}
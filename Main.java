import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // crea archivo
        ComponenteArchivo archivo1 = new Archivo("Documento.txt");
        ComponenteArchivo archivo2 = new Archivo("Imagen1.png");
        ComponenteArchivo archivo3 = new Archivo("Imagen2.png");

        // crea carpetas y añade archivos
        Carpeta carpetaRaiz = new Carpeta("Raíz");
        Carpeta carpetaImagenes = new Carpeta("Imágenes");

        carpetaImagenes.agregar(archivo2);
        carpetaImagenes.agregar(archivo3);

        carpetaRaiz.agregar(archivo1);
        carpetaRaiz.agregar(carpetaImagenes);

        // muestra detalles del sistema de archivos
        carpetaRaiz.mostrarDetalles("");
    }
}
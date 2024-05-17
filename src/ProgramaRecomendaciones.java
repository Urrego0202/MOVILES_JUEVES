
import java.util.ArrayList;
import java.util.List;

class Item {
    private final String nombre;
    private final String autor;
    private final String sinopsis;
    private int likes;
    private final List<String> comentarios;

    public Item(String nombre, String autor, String sinopsis) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.likes = 0;
        this.comentarios = new ArrayList<>();
    }

    // Métodos para dar like y agregar comentarios
    public void darLike() {
        this.likes++;
    }

    public void agregarComentario(String comentario) {
        this.comentarios.add(comentario);
    }

    // Getters para acceder a los campos
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }
}

public class ProgramaRecomendaciones {
    public static void main(String[] args) {
        // Crear categorías con sus respectivos datos.
        Item libro1 = new Item("Cien años de soledad", "Gabriel García Márquez",
                "Una saga familiar en Macondo.");
        Item pelicula1 = new Item("El Padrino", "Francis Ford Coppola",
                "La historia de la familia Corleone.");
        Item cancion1 = new Item("Himno Nacional", "Rafael Núñez",
                "Himno que cantamos los colombianos.");
        Item articulo1 = new Item("Revista Semana", "Ni idea", "Datos periodisticos");


        // Agregar los elementos a la lista
        List<Item> recomendaciones = new ArrayList<>();
        recomendaciones.add(libro1);
        recomendaciones.add(pelicula1);
        recomendaciones.add(cancion1);
        recomendaciones.add((articulo1));

        // Simula la interacción de algún usuario
        // Por ejemplo, dar like y agregar un comentario
        //Nota: Dejar un espacio por cada categoría para no confundirse

        //Libro
        libro1.darLike();
        libro1.darLike();
        libro1.agregarComentario("Muy bonito, pero deja que desear.");
        libro1.agregarComentario("¡Me encantó!");
        //Pelicula
        pelicula1.darLike();
        pelicula1.darLike();
        pelicula1.darLike();
        pelicula1.agregarComentario("Muy buena pelicula");
        pelicula1.agregarComentario("Perfecta para compartir con amigos.");
        //Canción
        cancion1.darLike();
        cancion1.darLike();
        cancion1.darLike();
        cancion1.darLike();
        cancion1.darLike();
        cancion1.agregarComentario("Muy bonito himno el de Colombia.");
        cancion1.agregarComentario("Me enorgullezco de ser Colombiano");
        //Articulo
        articulo1.agregarComentario("Muy informativo");
        articulo1.darLike();
        articulo1.darLike();
        articulo1.darLike();
        // Mostrar información de los elementos
        for (Item item : recomendaciones) {
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Autor: " + item.getAutor());
            System.out.println("Sinopsis: " + item.getSinopsis());
            System.out.println("Likes: " + item.getLikes());
            System.out.println("Comentarios: " + item.getComentarios());
            System.out.println();
        }
    }
}

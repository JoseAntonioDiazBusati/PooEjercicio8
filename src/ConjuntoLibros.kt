class ConjuntoLibros(val conjunto: MutableList<Libro>) {

    fun anadirLibro(libro: Libro){
        conjunto.add(libro)
    }

    fun eliminarLibro(libro: Libro){
        conjunto.remove(libro)
    }

    fun mostrarMayorCalificacion(libro: Libro){
        return  conjunto.sortBy { libro.calificacion }
    }
}
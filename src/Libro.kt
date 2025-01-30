class Libro(val titulo: String, val autor: String, val numPaginas: Int, calificacion: Int) {

    var calificacion: Int = calificacion
        set(value) {
            require(value in 0..10) { "La calificación debe estar entre 0 y 10." }
            field = value
        }

    init {
        require(titulo.isNotBlank()) { "El título no puede estar vacío." }
        require(autor.isNotBlank()) { "El autor no puede estar vacío." }
        require(numPaginas > 0) { "El número de páginas debe ser mayor que 0." }
        require(calificacion in 0..10) { "La calificación debe estar entre 0 y 10." }
    }
}
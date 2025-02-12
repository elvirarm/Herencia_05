fun prestarLibro(libro: Libro, usuario: Usuario){

    when (usuario){
        is Estudiante -> println("${libro.titulo} prestado a ${usuario.nombre} con éxito. Devuélvelo en 2 semanas.")
        is Profesor -> println("${libro.titulo} prestado a ${usuario.nombre} con éxito. Devuélvelo en 1 mes.")
        is Visitante -> println("No puedes sacar libro")
        else -> println("No perteneces al sistema.")
    }
}

fun main(){

    val libro = Libro("Manual de Ingeniería Informática", "Diegool", 2020)
    val libro1 = Libro("Manual de Jardinería", "Lola", 2019)
    val libro2 = Libro("Libro por defecto", "Anónimo", 1990)

    val usuario1 = Profesor("123456", "María", "Física")
    val usuario2 = Visitante("98765", "Daniel")
    val usuario3 = Estudiante("555666", "Iván", "Desconocidos")

    prestarLibro(libro1, usuario1)

    prestarLibro(libro, usuario2)

    prestarLibro(libro2, usuario3)


}
sealed class Usuario (puedeSacarLibro: Boolean) {
    class Estudiante:Usuario (true)
    class Profesor:Usuario (true)
    class Visitante:Usuario (false)

}
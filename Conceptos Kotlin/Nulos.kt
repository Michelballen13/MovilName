//En Kotlin, la gestión de nulos se realiza de manera explícita a través del sistema de tipos del lenguaje para prevenir NullPointerExceptions. 

//Tipos no nulos por defecto:
//Los tipos de datos en Kotlin son no nulos por defecto.
val nombre: String = "Michel" // No puede ser null
val apellido: String? = null // Puede ser null

//Operador seguro (?.):
//Permite acceder a miembros de un objeto solo si la referencia no es nula.
val longitud: Int? = nombre?.length

//Operador elvis (?:):
//Proporciona un valor por defecto en caso de que una expresión sea null.
val longitudNombre: Int = nombre?.length ?: 0

//Llamadas seguras (let):
//Ejecuta un bloque de código solo si el objeto no es nulo.
apellido?.let {
    println("El apellido es $it")
}

//Lanzamiento explícito de excepciones (!!):
//Forza una excepción NullPointerException cuando se asume que una expresión no es nula.
val longitud: Int = nombre!!.length





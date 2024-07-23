// Constantes no nulas por defecto:
// En Kotlin, las constantes (declaradas con 'val') son no nulas por defecto.
// Para permitir valores nulos, se debe declarar explícitamente con el operador '?'.

val PI: Double = 3.14159 // No puede ser null
val nombre: String? = null // Puede ser null

// Operadores seguros (?.):
// El operador ?. se usa para acceder a miembros de un objeto solo si la referencia no es nula.

val longitud: Int? = nombre?.length

// Operador de elvis (?:):
// El operador ?: permite proporcionar un valor por defecto en caso de que la constante sea null.

val nombreLength: Int = nombre?.length ?: 0

// Llamadas seguras (let):
// La función let se usa para ejecutar un bloque de código solo si el objeto no es nulo.

nombre?.let {
    println("El nombre es $it")
}

// Lanzamiento explícito de excepciones (!!):
// El operador !! permite forzar una excepción NullPointerException
// si se asume incorrectamente que una constante no es nula.

val length: Int = nombre!!.length
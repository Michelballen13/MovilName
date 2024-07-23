//En Kotlin, la gestión de nulabilidad es una característica clave que mejora la robustez y seguridad del código, evitando errores comunes como NullPointerException.

//1. Declaración de variables que pueden ser nulas
//En Kotlin, puedes declarar variables que pueden contener valores nulos agregando ? al tipo de dato:

val nombre: String? = null

//2. Operador de llamada segura ?.
//El operador ?. te permite acceder a propiedades o llamar métodos en una variable nula sin provocar una excepción:

val longitudNombre = nombre?.length

//3. Operador Elvis ?:
//El operador Elvis ?: te permite proporcionar un valor predeterminado si una expresión es nula:

val longitudOpcion = nombre?.length ?: -1

//4. Conversión segura con as?
//Para convertir tipos que pueden ser nulos a tipos no nulos de manera segura, se usa as?, que devuelve null si la conversión falla:

val numero: Int? = edad as? Int

//5. Evitar el uso de !!
//Evita el uso del operador !! siempre que sea posible, ya que fuerza una excepción NullPointerException si la variable es null:

val longitud = nombre!!.length

//6. Tipos de datos que no admiten valores nulos
//Puedes definir variables que no puedan contener valores nulos agregando ! al tipo de dato:

val cantidad: Int = 10 // No puede ser nulo

//7. Funciones con parámetros nulos
//Al definir funciones con parámetros que pueden ser nulos, especifica explícitamente que el parámetro puede ser nulo usando ?:

fun longitudNombre(nombre: String?): Int {
    return nombre?.length ?: 0
}




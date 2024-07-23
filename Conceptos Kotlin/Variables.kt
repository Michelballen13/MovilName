//En Kotlin, la declaración de variables ofrece una serie de opciones que facilitan el manejo flexible y seguro de datos. 

//1. Variables inmutables con val:
   //Utiliza val para definir variables inmutables, ideales para valores que no cambiarán después de la inicialización.
   //Esto garantiza que una vez asignado el valor, no se podrá modificar.

   val pi = 3.14

//2. Variables mutables con var:
   //Emplea var para crear variables mutables, cuyos valores pueden cambiarse durante la ejecución del programa.
 
   var nombre = "Michel"
   nombre = "Maria"
   

//3. Especificación explícita de tipos:
   //Kotlin permite especificar explícitamente el tipo de una variable, aunque en la mayoría de los casos el compilador puede inferirlo automáticamente.

   val edad: Int = 30
   var salario: Double = 2500.50


//4. Manejo de inicialización tardía o nulabilidad:
   //Para variables que no se inicializan de inmediato o que pueden ser nulas, puedes utilizar lateinit o declarar el tipo como nulo (`Tipo?`) y asignar un valor posteriormente.
 
   lateinit var nombre: String
   var direccion: String? = null
 

//5. Constantes con const val:
   //Define constantes que no cambian durante la ejecución del programa utilizando const val. Esto asegura que su valor sea constante en tiempo de compilación.
  
   const val PI = 3.1416



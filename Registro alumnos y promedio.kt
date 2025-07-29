/*Pedir nombre y notas y calcular el promedio de cada alumno e imprimirlo en pantalla*/


fun main() {

    println("------Registro de alumnos, notas y promedio------")//nombre del programa
/*si inicia un ciclo do while, donde el usuario puede seleccionar si carga la nota de otro alumno*/
    do {
/*se solicita al usuario que ingrese el nombre y apellido del alumno y se almacena en la variable correspondiente*/
    println("Ingrese el nombre del alumno: ")
    val nombre = readln()
    println("Ingrese el Apellido del alumno: ")
    val apellido = readln()

/*se definen variables para las materias*/
    var programacion = 0.0
    var aso = 0.0
    var matematica = 0.0
    var oe = 0.0

/*se inicia un ciclo do while, donde el usuario puede seleccionar de un menu, a que materia desea cargarle una nota.
No es obligatorio que todas las materias tengan una nota cargada*/
    do {
        println(
            "Seleccione una Materia:\n" +
                    "1- Programacion I\n" +
                    "2- Arquitectura y sistemas operativos\n" +
                    "3- Matematica\n" +
                    "4- Orgeniazacion empresarial\n" +
                    "Elija una opción: "
    )
/*se almacena la materia seleccionada por el usuario y se guarda como int para ser utilizada en el bloque when*/
    val materia = readln().toInt()

/*El bloque when imprime en pantalla la leyenda para que el usuario ingrese la nota y luego la almacena en la variable
de la materia que corresponde como un double*/
    when (materia){
        1 -> {
            print("Ingrese la nota para Programacion I: ")
            programacion = readln().toDouble()

            }
        2 -> {
            print("Ingrese la nota para Arquitectura y sistemas operativos: ")
            aso = readln().toDouble()
            }
        3 -> {
            print("Ingrese la nota para Matematica: ")
            matematica = readln().toDouble()
            }
        4 -> {
            print("Ingrese la nota para Orgeniazacion empresarial: ")
            oe = readln().toDouble()
            }
/*si no selecciona una opcion valida imprime el mensaje de error en la pantalla y como esta dentro del do while
le permite al usuario la opcion de ingresar otra materia/nota*/
        else -> {
            print("opcion invalida: ")
            }
        }
/*imprime en pantalla el mensaje para que el usuario elija si desea seguir cargando notas o que calcule el promedio.
Se almacena en la variable opcion con un lowercase (de esta forma puede leer por mas que se ingresen mayusculas) */
        println("Si desea ingresar otra nota presione enter o ingrese 'No' para calcular el promedio")
        val opcion = readln().lowercase()
/*Si el usuario presiona enter se vuelve a ejecutar el loop, si elije que 'No' se procede a calcular el promedio*/
    } while (opcion != "no")
/*se crean dos variables nuevas, la primera suma las notas ingresadas y la segunda acumula la cantidad de materias
que se ingresaron notas, de esta manera el promedio se calcula en forma correcta*/
    var sumaNotas = 0.0
    var cantidadMaterias = 0
/*cada if pasa por una variable de materia y si la nota almacenada es distinta a -1 (se toma -1 porque 0 es una nota
valida), se suma a la variable sumaNotas y tambien suma 1 a la variable cantidadMaterias*/
    if (programacion != -1.0) {
        sumaNotas += programacion
        cantidadMaterias++
    }
    if (aso != -1.0) {
        sumaNotas += aso
        cantidadMaterias++
    }
    if (matematica != -1.0) {
        sumaNotas += matematica
        cantidadMaterias++
    }
    if (oe != -1.0) {
        sumaNotas += oe
        cantidadMaterias++
    }

/*Se imprime en pantalla el promedio del alumno*/
    println("El promedio del alumno " + nombre +" "+ apellido + " es de: " + sumaNotas / cantidadMaterias)

/*imprime en pantalla el mensaje para que el usuario elija si desea seguir cargando otro alumno o que salga del
programa. Se almacena en la variable continuarCargando con un lowercase (de esta forma puede leer por mas que se
ingresen mayusculas) */
    println("Si desea cargar la nota de otro alumno presione enter o ingrese 'No' para salir")
    val continuarCargando = readln().lowercase()
/*Si el usuario presiona enter se vuelve a ejecutar el loop para cargar otro alumno, si elije que 'No' sale del
programa*/
} while (continuarCargando != "no")
}
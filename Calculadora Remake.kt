import kotlin.contracts.Returns

/*4. Calculadora simple
Una función que dado 2 valores y una operación (“sumar”, “restar”, “multiplicar”, “dividir”) devuelva el resultado de la operación solicitada
fun calcular(nro1: Double, nro2: Double, operacion: String) : Double {
En lugar de pedir la operación por teclado, desarrollar un menú donde el usuario pueda elegir la operación que quiera realizar.
Operaciones posibles:
Sumar
Restar
Dividir
Multiplicar
	Elija una opción:

    ….
}
*/

fun main() {
    print("Operaciones posibles:\n" +
            "1- Sumar\n" +
            "2 -Restar\n" +
            "3- Dividir\n" +
            "4- Multiplicar\n" +
            "Elija una opción:"
    )
    val operacion = readln()
    print("Ingrese un numero: ")
    val numero1 = readln().toDouble()
    print("Ingrese otro numero: ")
    val numero2 = readln().toDouble()

    calcularRemake(numero1, numero2, operacion)

}

fun calcularRemake(numero1: Double, numero2: Double, operacion: String) : Double {
    val resultado = 0.0
    when (operacion) {
        "1" -> println(numero1 + numero2)
        "2" -> println(numero1 - numero2)
        "3" -> println(numero1 / numero2)
        "4" -> println(numero1 * numero2)
    }
    return resultado
}
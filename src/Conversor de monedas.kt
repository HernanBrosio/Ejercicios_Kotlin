

/*2.Conversor de monedas
Desarrollar una función que dado un monto en pesos lo convierta a un valor de moneda extranjera, USD, EURO o
Reales (R$) según pida el usuario, y devuelva ese valor.*/

val dolares = 1230
val euro = 1457.04
val reales = 228.20

fun main() {

    conversor()

}

fun conversor() {

    println("----Conversor de Monedas----")

    do {
        println(
            "Seleccione una operacion:\n" +
                    "1- Convertir Pesos a Dolares\n" +
                    "2- Convertir Dolares a Pesos\n" +
                    "3- Convertir Pesos a Reales\n" +
                    "4- Convertir Reales a Pesos\n" +
                    "5- Convertir Pesos a Euros\n" +
                    "6- Convertir Euros a Pesos\n" +
                    "Elija una opción: "
        )
        val operacion = readln().toInt()

        if (operacion >= 1 && operacion <7)
        {
            println("Ingrese el monto: ")
            val monto = readln().toDouble()

            when (operacion) {
                1 -> println("Son " + String.format("%.3f", monto / dolares) + " Dolares")
                2 -> println("Son " + String.format("%.3f", monto * dolares) + " Pesos")
                3 -> println("Son " + String.format("%.3f", monto / reales) + " Reales")
                4 -> println("Son " + String.format("%.3f", monto * reales) + " Pesos")
                5 -> println("Son " + String.format("%.3f", monto / euro) + " Euro")
                6 -> println("Son " + String.format("%.3f", monto * euro) + " Euro")
            }
        }else {
            println("operacion seleccionada incorrecta")
        }

        println("Presione enter para realizar una nueva conversion, o seleccione No si desea salir:")
        val eleccion = readln().lowercase()

    } while (eleccion != "no")
}

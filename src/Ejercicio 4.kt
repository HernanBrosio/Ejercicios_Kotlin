/*Estadistica, lista de Strings con texto tipo tweets y obtener las palabras mas usadas, o trendtopic*/

fun main() {
    val lista = listOf(
        "Hola mundo",
        "Hola que tal Mandriles?",
        "hola a todos Mandriles",
        "mandriles mandriles mandriles"
    )

    val contadorPalabras = mutableMapOf<String, Int>()

    for (tweet in lista) {
        val palabras = tweet
            .lowercase()
            .replace(Regex("[^a-záéíóúüñ\\s]"), "") // quitar signos
            .split(" ")

        for (palabra in palabras) {
            if (palabra.isNotBlank()) {
                contadorPalabras[palabra] = contadorPalabras.getOrDefault(palabra, 0) + 1
            }
        }
    }

    // Identificar la(s) palabra(s) trendtopic
    val maxFrecuencia = contadorPalabras.values.maxOrNull() ?: 0
    val trendTopics = contadorPalabras.filterValues { it == maxFrecuencia }.keys

    println("Palabra trendtopic: ${trendTopics.joinToString(", ")} (usada $maxFrecuencia veces)\n")

    // Mostrar estadísticas ordenadas
    println("Palabras más usadas (ordenadas de mayor a menor):")
    val ordenadas = contadorPalabras.entries.sortedByDescending { it.value }

    for ((palabra, cantidad) in ordenadas) {
        println("- $palabra: $cantidad")
    }
}

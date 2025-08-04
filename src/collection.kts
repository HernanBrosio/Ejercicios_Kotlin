#!/usr/bin/env kotlin


// Una colección es una estructura de datos, que nos permite agrupar elementos bajo una sola variable.

// LIST -> ordenar elemento, permite duplicados.
// SET -> es una lista NO ordenada, y no permite duplicado
// MAP -> Es un diccionario clave-valor, la clave es un nombre unívoco y tiene asociado algún valor a esa clave.

// Mutable VS Inmutable.
// Una colección inmutable no puede ser modifcada después de ser creada al contrario de mutable


// Lambda. Son funciones anónimas. Es decir, no tiene nombre. Se pueden usar como un valor, es decir podría
// pasarlas por parametro a otra función

// Funciones de orden superior. Funciones que reciben otra función, o devuelven una función como resultado

fun main() {

    val lista = listOf(1, 2, 3) // inmutable
    val mutableList = mutableListOf(1, 2, 3) // mutable

    val conjunto =  setOf(1, 2, 2, 3) // inmutable
    val mutableConjunto = mutableSetOf(1, 2, 3, 4) // mutable

    val mapa = mapOf("a" to 1, "c" to 3, "z" to 24) // inmutable
    val mutableMapa = mutableMapOf("a" to 1, "c" to 3, "z" to 24) // mutable

    println(mutableList)
    mutableList.add(4)

    println(mutableList)

    mutableList.remove(4)
    // mutableList.removeAt(3)
    println(mutableList)

// Una colección es una estructura de datos, que nos permite agrupar elementos bajo una sola variable.

// LIST -> ordenar elemento, permite duplicados.
// SET -> es una lista NO ordenada, y no permite duplicado
// MAP -> Es un diccionario clave-valor, la clave es un nombre unívoco y tiene asociado algún valor a esa clave.

// Mutable VS Inmutable.
// Una colección inmutable no puede ser modifcada después de tableList)ser creada al contrario de mutable


// Lambda. Son funciones anónimas. Es decir, no tiene nombre. Se pueden usar como un valor, es decir podría
// pasarlas por parametro a otra función

// Funciones de orden superior. Funciones que reciben otra función, o devuelven una función como resultado

fun main() {

    val lista = listOf(1, 2, 3) // inmutable
    val mutableList = mutableListOf(1, 2, 3) // mutable

    val conjunto =  setOf(1, 2, 2, 3) // inmutable
    val mutableConjunto = mutableSetOf(1, 2, 3, 4) // mutable

    val mapa = mapOf("a" to 1, "c" to 3, "z" to 24) // inmutable
    val mutableMapa = mutableMapOf("a" to 1, "c" to 3, "z" to 24) // mutable

    println(mutableList)
    mutableList.add(4)

    println(mutableList)

    mutableList.remove(4)
   // mutableList.removeAt(3)
    println(mutableList)

    mutableMapa.put("j", 10)
    println(mutableMapa)
    mutableMapa["k"] = 11
    println(mutableMapa)

    mutableMapa.remove("k")
    println(mutableMapa)

    // Lambdas
    val suma =  { a: Int, b: Int -> a + b}
    println("suma lambda " + suma(2, 3))

    val nombres = listOf("Ana", "Luis", "Juan")
    println("lista original: $nombres")
    nombres.forEach { nom ->  println("hola, $nom") }

    val numeros = listOf(1, 2, 3, 4, 5, 6 )

    val precios = numeros.map{ num -> num * 2 } // Tarea, investigar flatMap

    println(precios)

    val edades = listOf(12, 27, 17, 31, 40)
    val mayores = edades.filter { edad -> edad >= 18 }
    println(mayores)

    val palabras = listOf("casa", "carroceria", "perro", "gato", "pared", "patada", "pera", "guapos")

    val agrupadas = palabras.groupBy { pal -> pal.first() }

    println("palabras agrupadas $agrupadas") // Tarea ordenar por cantidad de palabras

    val numeros2 = listOf(1, 2, 3, 4, 5)

    val suma2 = numeros2.reduce{acc, elem -> acc + elem}
    println(suma2)

    val sumConValIncial = numeros2.fold(10){ acc, elem -> acc  + elem}
    println(sumConValIncial)


    val listas = listOf(listOf(1,2,3), listOf(5,6,7,8)) // imprimir esto con for
    val flattenList = listas.flatMap { sublist -> sublist }
    println(flattenList)
}

    mutableMapa.put("j", 10)
    println(mutableMapa)
    mutableMapa["k"] = 11
    println(mutableMapa)

    mutableMapa.remove("k")
    println(mutableMapa)

    // Lambdas
    val suma =  { a: Int, b: Int -> a + b}
    println("suma lambda " + suma(2, 3))

    val nombres = listOf("Ana", "Luis", "Juan")
    println("lista original: $nombres")
    nombres.forEach { nom ->  println("hola, $nom") }

    val numeros = listOf(1, 2, 3, 4, 5, 6 )

    val precios = numeros.map{ num -> num * 2 } // Tarea, investigar flatMap

    println(precios)

    val edades = listOf(12, 27, 17, 31, 40)
    val mayores = edades.filter { edad -> edad >= 18 }
    println(mayores)

    val palabras = listOf("casa", "carroceria", "perro", "gato", "pared", "patada", "pera", "guapos")

    val agrupadas = palabras.groupBy { pal -> pal.first() }

    println("palabras agrupadas $agrupadas") // Tarea ordenar por cantidad de palabras

    val numeros2 = listOf(1, 2, 3, 4, 5)

    val suma2 = numeros2.reduce{acc, elem -> acc + elem}
    println(suma2)

    val sumConValIncial = numeros2.fold(10){ acc, elem -> acc  + elem}
    println(sumConValIncial)


    val listas = listOf(listOf(1,2,3), listOf(5,6,7,8)) // imprimir esto con for
    val flattenList = listas.flatMap { sublist -> sublist }
    println(flattenList)
}
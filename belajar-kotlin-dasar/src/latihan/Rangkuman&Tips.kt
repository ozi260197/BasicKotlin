package latihan

import java.util.*

fun main() {

    fun printDoubleLine(message: String) {
        println()
        println("Ini Hasil $message")
    }

    printDoubleLine("anonymousFunction")
    anonymousFunction()

    printDoubleLine("Array")
    array()

    printDoubleLine("Break")
    codebreak()

    printDoubleLine("Continue")
    codecontinue()

    printDoubleLine("DoWhile Looping")
    doWhileLoop()

    printDoubleLine("Extensions Function")
    extensionFunction()

    printDoubleLine("For Loop")
    forLoop()

    printDoubleLine("Function Default Params")
    functionDefaultParam()

    printDoubleLine("functionInfixNotation")
    functionInfixNotation()

    printDoubleLine("function Named Argument")
    functionNamedArgument()

    printDoubleLine("function Parameter")
    functionParameter()

    printDoubleLine("function return type")
    functionReturnType()

    printDoubleLine("function Scope")
    functionScope()

    printDoubleLine("function varargs parameter")
    functionVarargsParameter()

    printDoubleLine("Hello World")
    helloWorld()

    printDoubleLine("Higher Order Function")
    higherOrderFunction()

    printDoubleLine("If Expression")
    ifExpression()

    printDoubleLine("Lambda Expression")
    lambdaExpression()

    printDoubleLine("factorial Recursive")
    factorialRecursive()

    printDoubleLine("Return If")
    returnIf()

    printDoubleLine("Return When")
    returnWhen()

    printDoubleLine("Single Expression Function")
    singleExpressionFunction()

    printDoubleLine("Tail Recursive function")
    tailRecursiveFunction()

    printDoubleLine("Unit Return Function")
    unitReturnFunction()

    printDoubleLine("When Expression")
    whenExpression()

    printDoubleLine("While Loop")
    whileLoop()
}

fun anonymousFunction() {
    fun sayHello(nama: String, lambda: (String) -> String): String {
        val lambdaNames = lambda(nama)
        return "Hello $lambdaNames"
    }

    val toUpperCase = fun(value: String): String {
        if (value == "") {
            return "Ups"
        }else {
            return value.uppercase()
        }
    }

    println(sayHello("Akhmad Fauzi", toUpperCase))

}

fun array() {
    val person: Array<String> = arrayOf(
        "Akhmad Fauzi",
        "Muhammad Zein",
        "Ade Septian",
        "Adinda Fatiharki",
        "Muhammad Adli Ilham",
        "Eko Rahmadeni"
    )

    val age: Array<Int> = arrayOf(
        24,
        26,
        27,
        22,
        23,
        25
    )

    val harga: Array<Int> = arrayOf(
        10_000,
        50_000,
        100_000
    )

    println("""
        Person1 = ${person[0]}
        Age = ${age[0]}
        Harga = ${harga[2]}
    """.trimIndent())
}

fun codebreak() {

    var i = 0
    while (true) {
        println("Perulangan ke $i")
        i++

        if (i > 10) {
            break
        }
    }
}

fun codecontinue() {

    for (i in 0..10) {
        if (i % 2 == 0 ) {
            continue
        }
        println(i)
    }

}

fun doWhileLoop() {
    var i = 0
    do {
        println("Perulangan ke $i")
        i++
    }while (i < 10)
}

fun extensionFunction() {
    fun String.sayHello(): String = "Hello $this"
    val name: String = "Akhmad Fauzi"
    println(name.sayHello())
}

fun forLoop() {
    val names: Array<String> = arrayOf(
        "Akhmad Fauzi",
        "Adinda Fatiharki",
        "Anathasia",
        "Muhammad Zein",
        "Ade Septian"
    )

    val jumlahArray = names.size -1
    for (i in 0..jumlahArray) {
        println("Index ke $i -> ${names[i]}")
    }
}

fun functionDefaultParam() {
    fun sayHello(firstName: String, middleName: String = "", lastName: String) {
        when (middleName) {
            "" -> println("Hello $firstName $lastName")
            else -> println("Hello $firstName $middleName $lastName")
        }
    }

    sayHello("Akhmad", "", "Fauzi")
    sayHello("Muhammad", "Adli", "Ilham")
}

fun functionInfixNotation() {
    infix fun String.to(type: String): String {
        if (type == "UP") {
            return this.uppercase(Locale.getDefault())
        }else {
            return this.lowercase(Locale.getDefault())
        }
    }

    val result = "Akhmad Fauzi" to "UP"
    println(result)
}

fun functionNamedArgument() {
    fun fullName(firstName: String, middleName: String, lastName: String) {
        println("Hello $firstName $middleName $lastName")
    }

    fullName(firstName = "Muhammad", middleName = "Adli", lastName = "Ilham")
}

fun functionParameter() {
    fun sayHello(fisrtName: String, middleName: String = "", lastName: String): String {
        if (middleName == "") {
            return "Hello $fisrtName $lastName"
        } else {
            return "Hello $fisrtName $middleName $lastName"
        }
    }
    println(sayHello("Akhmad", "", "Fauzi"))
    println(sayHello("Muhammad", "Adli", "Ilham"))
}

fun functionReturnType() {
    fun sum(a: Int, b:Int): Int {
        val total = a + b
        return total
    }

    println(sum(50,50))
}

fun functionScope() {
    fun thisScopeFunction() {
        println("Hello World")
    }
    thisScopeFunction()
}

fun functionVarargsParameter() {
    fun hitungTotal(name: String, vararg values: Int): Any {
        var total = 0
        for (value in values) {
            total += value
        }
        return "$name $total"
    }
    println(hitungTotal("Fauzi", 10))

}

fun helloWorld() {
    println("Hello World")
}

fun higherOrderFunction() {
    fun hello(nama: String, transformer: (String) -> String): String {
        val nameTranform = transformer(nama)
        return "Hello $nameTranform"
    }

    val result = hello("Akhmad Fauzi") {
        value: String ->
        value.uppercase(Locale.getDefault())
    }
    println(result)

}

fun ifExpression() {
    val nilaiSiswa = 75
    if (nilaiSiswa > 80) {
        println("Good Job")
    } else if (nilaiSiswa > 60) {
        println("Cukup")
    } else {
        println("Coba Lagi")
    }
}

fun lambdaExpression() {
    val lambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val name = lambda("Akhmad", "Fauzi")
    println(name)
}

fun factorialRecursive() {
    fun factorialrecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialrecursive(value - 1)
        }
    }
    println(factorialrecursive(10))
}

fun returnIf() {
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }
    println(sayHello())
}

fun returnWhen() {
    fun sayHello(name: String): String {
        return when(name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }
    println(sayHello("Akhmad Fauzi"))
}

fun singleExpressionFunction() {
    fun double(a: Int, b: Int): Int = a * b
    val result = double(5, 5)
    println(result)
}

fun tailRecursiveFunction() {
    tailrec fun display(value: Long) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    display(250000)
}

fun unitReturnFunction() {
    fun sayHello(): Unit {
        println("Hello World")
    }
    sayHello()
}

fun whenExpression() {
    val grade = 'A'
    when(grade) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}

fun whileLoop() {
    var i = 0
    while (i < 10) {
        println("Perulangan ke $i")
        i++
    }
    println("Selesai")
}
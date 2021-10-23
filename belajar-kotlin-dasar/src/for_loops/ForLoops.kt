import kotlin.math.sign

fun main() {


    val names = arrayOf(
        "Fauzi",
        "Zein",
        "Godel",
        "Emon",
        "Eko"
    )
    var nilai = 0
    // kode for loops
    for (i in names) {
        println(i)
        nilai ++
    }
    println(nilai)


    // Kode For Untuk Range
    for (value in 0..100) {
        println(value)
    }
    for (value in 100 downTo 0) {
        println(value)
    }
    for (value in 0..100 step 5) {
        println(value)
    }

    // Kombinasi Array dan Range
    val jumlahArray = names.size -1
    for (i in 0..jumlahArray) {
        println("index $i = ${names[i]}")
    }
}

// Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
// salah satu perulangan di kotlin adalah for
// For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, Dll)

// Sebelum nya untuk mengambil data array secara manual satu persatu harus menggunakan index[]
// dalam for bisa mengambil seluruh nilai tanpa harus mengambil satu persatu menggunakan index[]

// Variabel i pada for untuk mengambil datan iterator nya dalam suatu nilai didalam nya (Array)
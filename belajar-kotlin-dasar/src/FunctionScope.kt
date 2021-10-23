fun satu() {
    // Tidak bisa di akses karena function tersebut ada di function main / function tertentu
//    contohHelloWorld()
}

fun dua() {
//    contohHelloWorld()
}

fun main() {

    // function ini hanya bisa di akses di function main
    fun contohHelloWorld() {
        println("Hello World")
    }

    contohHelloWorld()
}

// Function Scope adalah ruang lingkup dimana sebuah function bisa diakses
// Saat kita membuat function didalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
// Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu, maka kita bisa membuat function didalam function

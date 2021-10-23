fun main() {

    val name: String = "Akhmad Fauzi"
    println(name.hello())

    // fun type unit
    name.printHello()

    "Adinda Fatiharki".printHello()

}

/**
 *
 * Contoh kode extension function dengan single expression
 *
 */
fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

// Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
// Extension function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakan nya
// Karena jika terlalu banyak digunakan, akan membuat perogram sulit di mengerti, karena terlihat seperti magic

// Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda .(titik)
// Untuk mengakses datanya di extension function, kita bisa menggunakan kata kunci this
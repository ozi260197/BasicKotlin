fun main() {

    val result = double(5, 5)
    println(result)

    hi("Akhmad Fauzi")

}

// Kode Single Expression Function
fun double(a: Int, b: Int): Int = a * b
fun hi(name: String): Unit = println("Hi $name")

// Misal function hanya berisikan kode blok sederhana, misal hanya 1 baris
// JIka mengalami hal seperti ini, kita bisa mengubah nya menjadi single expression function
// Single expression function adalah deklarasi function hanya dengan 1 baris kode
// Untuk membuat single expression function, kita hanya butuh tanda = (samadengan)
// Setelah deklarasi nama function dan tipe data pengembalian function
import java.util.*

fun main() {

    val result = "Akhmad Fauzi" to "UP"
    println(result)

}

// Kode Function Infix Notation
infix fun String.to(type: String): String {

    if (type == "UP") {
        return this.uppercase(Locale.getDefault())
    } else {
        return this.lowercase(Locale.getDefault())
    }
}

// Infix notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
// Hampir semua operasi matematika adalah infix notation
// Di Kotlin, kita bisa membuat function infix notation, tidak wajib menggunakan tanda .(titik)

// Todo: Syarat infix notation
// Harus sebagai function member atau function extension
// Harus memiliki 1 parameter
// Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 import java.util.*

// Method Reference
fun toUpper (value: String): String = value.uppercase(Locale.getDefault())

fun main() {

    // Kode membuat lambda
    val lambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    // Kode lambda menggunakan it (hanya bisa satu parameter)
    val lambda1: (String) -> String = {
        "Hello $it"
    }

    // Kode Lambda Method reference
    val upperCase: (String) -> String = ::toUpper

//    ------------------------------------------------------------------------------------------------------------//

    // mengeksekusi lambda
    val name = lambda("Akhmad", "Fauzi")
    println(name)

    // Eksekusi lambda it
    println(lambda1("Akhmad Fauzi"))

    // Eksekusi Lambda method reference
    println(upperCase("Ozi"))
}

// Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya
// Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
// Lambda expression secara sederhana adalah function yang tidak memiliki nama
// Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
// Dengan Lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya
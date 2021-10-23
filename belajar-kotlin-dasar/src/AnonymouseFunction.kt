import java.util.*

fun main() {

    /**
     * Parameter pertama nya adalah value
     *
     * params kedua adalah lambda
     */
    fun hello(nama: String, transformer: (String) -> String): String {
        val nameTransform = transformer(nama)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase(Locale.getDefault())
        }
    }

    println(hello("Fauzi", upper))
    println(hello("", upper))

    // Bisa langsung memasukan di parameter tanpa harus buat variable
    println(hello("Adinda", fun(value: String): String{
        return value.lowercase(Locale.getDefault())
    }))

}

// Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
// Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
// Untuk hal ini, kita bisa menggunakan anonymouse function
// Anonymouse function sebenarnya mirip dengan lambda, hanya cara membuat nya saja yang sedikit beda, masih menggunakan kata kunci fun
// Berguna untuk membuat perogram yang complex
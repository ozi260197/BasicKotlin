import java.util.*

fun main() {

    // Params pertama adalah value
    // params kedua adalah lambda
    fun hello(nama: String, transformer: (String) -> String): String {
        val nameTransform = transformer(nama)
        return "Hello $nameTransform"
    }

    // Cara memanggil nya

    // Cara memasukan lambda ke variabel
    val lambdaUpper = { value: String -> value.uppercase(Locale.getDefault()) }
    println(hello("Fauzi", lambdaUpper))

    // Cara Langsung memasukan lambda kedalam params
    println(hello("Fauzi", { value: String -> value.lowercase(Locale.getDefault()) }))

    // Trailing Lambda
    val result1 = hello("Adinda", { value: String -> value.uppercase(Locale.getDefault()) })
    val result2 = hello("Adinda") { value: String -> value.lowercase(Locale.getDefault()) }

    println(result1)
    println(result2)

}

// Higher-order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
// Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan input yang flexibel berupa lambda,
// yang bisa di deklarasikan oleh si user ketika memanggil function tersebut
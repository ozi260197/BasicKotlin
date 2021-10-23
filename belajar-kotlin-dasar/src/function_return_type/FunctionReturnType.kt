fun main() {

    val result = sum(10, 10)
    println(result)

    println(sum(20, 20))

    println(bagi(100, 10))
    println(bagi(100, 0))

}

// Kode function return type
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Any {


    if (b == 0) {
        return "Tidak bisa dibagi nol"
    } else {
        val total = a / b
        return total
    }
}


// Function bisa mengembalikan data
// Untuk memberi tahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
// Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib didalam function nya kita harus mengembalikan data
// Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya
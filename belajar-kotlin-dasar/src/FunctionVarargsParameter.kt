fun main() {

    // Mengambil data function dengan varargs
    val result = hitungTotal("Ozi", 10, 10, 10)
    println(result)

    // Mengambil data function biasa dengan Array
    val values = arrayOf(10,10,10,10,10)
    val result1 = hitungTotal1(values)
    println(result1)
}

// Kode fun tidak menggunakan varargs
fun hitungTotal1(values: Array<Int>): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

// Kode fun menggunakan Varargs
fun hitungTotal(name: String, vararg values: Int): Any {

    var total = 0

    for (value in values) {
        total += value
    }
    return "$name $total"

}

// Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan varargs
// Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja seperti array
// Apa bedanya dengan parameter biasa dengan tipe data Array
//  - Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
//  - Jika parameter menggunakan Varargs, Kita bisa menggunakan langsung datanya, Jika lebih dari satu, Cukup gunakan tanda koma,
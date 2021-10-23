fun main() {

    sayHello()

}
// Cara default function sudah mengembalikan type unit, tidak perlu mengembalikan nilai
fun sayHello(): Unit {
    println("Hello world")
}

// Function ada 2 jenis,
// Pertama tidak mengembalikan nilai
// Yang kedua mengembalikan nilai

// Function function yang sebelum nya dibuat adalah function yang tidak mengembalikan nilai
// Sebenernya, function function yang sudah kita buat sebelumnya,
// dia mengembalikan tipe data unit, dimana unit adalah tanda bahwa function tersebut tidak mengembalikan apa apa
// Penulisan unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function, maka secara otomatis dia adalah unit

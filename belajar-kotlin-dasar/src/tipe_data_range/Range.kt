fun main() {

    // Kode Range Naik
    val rangeUp = 1..100

    println(rangeUp.count()) // Menghitung Jumlah
    println(rangeUp.contains(20)) // Cek Apakah ada 20 diantara range tersebut = true
    println(rangeUp.contains(200)) // Cek apakah ada 200 di antara range tersebut = false
    println(rangeUp.first) // Mendapatkan nilai pertama dari range tersebut
    println(rangeUp.last) // Mendapatkan Nilai Terakhir dari range tersebut
    println(rangeUp.step) // cek kenaikan berapa tingkat


    // kode range turun
    val rangeDown = 100 downTo 1

    println(rangeDown.count()) // Menghitung Jumlah
    println(rangeDown.contains(20)) // Cek Apakah ada 20 diantara range tersebut
    println(rangeDown.contains(200)) // Cek apakah ada 200 diantara range tersebut
    println(rangeDown.first) // Mendapatkan nilai pertama dari range tersebut
    println(rangeDown.last) // mendapatkan nilai terakhir dari range tersebut
    println(rangeDown.step) // Penurunan berapa tingkatan


    // Kode Range dengan Step
    val rangeStep1 = 0..1000 step 5
    val rangeStep2 = 1000 downTo 0 step 5

    println(rangeStep1.step)
    println(rangeStep2.step)


}

// Todo: Tipe data range
// Kadang kita ingin membuat array yang berisi data yang angka berurutan
// Membuat Array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutanya sangat banyak, misal dari 1 sampai 1000
// KOtlin Mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
// Cara membuat range dikotlin sangat mudah cukup menggunakan tanda ..(titik 2 kali)
// 0..10: Range 0 Sampai 10
// 1..100: Range dari 1 sampai 100

// Todo: Operasi Range
// count() -> Mendapatkan total data range
// contains(value) -> Mengecek apakah terdapat value tersebut
// first -> Mendapatkan nilai pertama
// last -> mendapatkan nilai terakhir
// step -> Mendapatkan Nilai Tiap Kenaikan
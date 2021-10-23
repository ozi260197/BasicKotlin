fun main() {


    // Contoh mengatasi stack overflow menggunakan tailrec
//    tailrec fun display1(value: Long) {
//        println("Recursive $value")
//        if (value > 0) {
//            display1(value - 1)
//        }
//    }
//    display1(25000000)


   // Contoh Recursive terlalu dalam akan terjadi stack overflow
//    fun display(value: Int) {
//        println("Recursive $value")
//        if (value > 0) {
//            display(value - 1)
//        }
//    }
//    display(100000)


    // Menggunakan factorial function
    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value){
            1 -> total
            else -> factorialRecursive(value - 1,  total * value)
        }
    }
    println(factorialRecursive(10))

}

// Recursive function adalah salah satu kemampuan bagus di kotlin, Namun sayang nya ada keterbatasan dalam penggunaan recursive
// Jika recursive function yang kita buat, Saat dijalankan memanggil function dirinya sendiri terlalu dalam,
// Maka bisa dimungkinkan akan terjadi error stack overflow

// Todo: Syarat Tail Recursive function
// Tambahkan tailrec di function nya
// Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel embel operasi dengan data lain
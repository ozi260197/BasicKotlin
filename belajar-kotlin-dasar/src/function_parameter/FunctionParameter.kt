fun main() {

    sayHello("Akhmad", "Fauzi")
    sayHello("Adinda", "Fatiharki")
    sayHello("Muhammad", "Zein")

    println()

    sayHelloNull("Muhammad", null, null)
    sayHelloNull("Muhammad", "Adli", "Ilham")

}

// Kode function parameter
fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

// Kode function parameter boleh null
fun sayHelloNull(firstName: String, middleName: String?, lastName: String?) {
    if (middleName == null && lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $middleName $lastName")
    }
}

// Saat membuat function, kadang kadang kita membutuhkan data dari luar, atau kita sebut parameter
// Di Kotlin, kita bisa menambahkan parameter di function, Bisa lebih dari satu
// Parameter tidak lah wajib, jadi kita bisa membuat function tanpa parameter seperti sebelumnya
// Namun jika kita menambahkan parameter di function, maka ketika memanggil function tersebut, kita wajib memasukan data ke parameternya

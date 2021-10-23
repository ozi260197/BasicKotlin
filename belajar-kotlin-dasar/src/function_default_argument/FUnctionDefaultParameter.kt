fun main() {

    sayHello("Akhmad", "Fauzi")
    sayHello("Akhmad")

    println()

    helloNull("Akhmad")
    helloNull("Akhmad", "Fauzi")
    helloNull("Muhammad", "Adli", "Ilham")

}

// Kode function Default Parameter

fun sayHello(firstName: String, middleName: String = "", lastName: String = "") {
    println("Hello $firstName $middleName $lastName")
}

fun helloNull(firstName: String, middleName: String? = null, lastName: String? = null) {
    if (middleName == null && lastName == null) {
        println("Hello $firstName")
    } else if (lastName == null) {
        println("Hello $firstName $middleName")
    } else {
        println("Hello $firstName $middleName $lastName")
    }
}

// Di Kotlin, function parameter wajib diisi ketika memanggil function
// Namun kita juga bisa memasukan nilai default pada parameter,
// dengan demikian saat memanggil function tersebut, kita tidak wajib memasukan nilai pada parameternya
// Default parameter ini cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi
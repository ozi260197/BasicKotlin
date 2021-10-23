fun main() {

    // Kode Named Argument

    // posisi yang sesuai yang ada di function nya
    fullName( firstName = "Muhammad", middleName = "Adli", lastName = "Ilham")

    // Bebas meletakan argumen yang penting harus di sebutkan nama parameter nya
    // Namun yang akan di cetak posisi berdasarkan function yang kita buat
    // posisi acak
    fullName(middleName = "Adli", firstName = "Muhammad", lastName = "Ilham")

}

fun fullName(firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

// Kotlin memiliki fitur yang nama nya Named Argument
// Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function
// dengan demikian kita tidak wajib tahu posisi tiap parameter
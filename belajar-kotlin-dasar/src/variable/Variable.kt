fun main() {

    // Variable Mutable (Bisa Diubah)
    var firstName: String = "Akhmad"
    var lastName: String = "Fauzi"

    // Mengubah variable Mutable
    firstName = "Changed Akhmad"
    firstName = "Akhmad"
    println("$firstName $lastName")

//    ----------------------------------------------Variable--------------------------------------------------//

    // Variable Immmutable (Tidak bisa diubah)
    val firstname: String = "Akhmad"
    val lastname: String = "Fauzi"

    // Mengubah Variable Immutable
//    firstname = "Changed Name" // error

//    -------------------------------------------Nullable-----------------------------------------------------//
    // Nullable
    var firstNameNull: String? = "Ozi"
    firstNameNull = null

    println(firstNameNull)

    // Error Karena String dalam keadaan Null
//    println(firstNameNull.length)

    // Cara Mengakses null nya
    println(firstNameNull?.length)

    firstNameNull = "Fauzi"
    println(firstNameNull.length)


//  ------------------------------------------------Variable Constant------------------------------------------------

    // Constant Variable

    println("Welcome To $APPLICATION Version $VERSION")

}
// Variable Untuk keperluan Global
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

// Todo : Variable adalah tempat untuk menyimpan data
// kotlin mendukung 2 jenis variable : Mutable(Bisa Diubah), Immutable(Tidak Bisa Diubah)
// Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var (Bisa diubah)
// Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val (Tidak bisa diubah)

// Todo : Nullable
// Secara standard, Variable di kotlin harus di deklarasikan / Diinisialisasi Nilai nya / Diisi Nilai nya
// Jika saat membuat variable, tidak diberi nilai maka akan error
// Kotlin mendukung variable yang boleh null (Tidak Memiliki Data)
// Untuk membuat variable bisa bernilai null, di kotlin bisa menggunakan ?(tanda tanya) setelah type datanya
// Penggunaan ini tidak di rekomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode java


// Todo: Variable Constant
// Constant adalah Immutable data (Tidak Bisa Dirubah / Nilai Constant), Yang Biasa nya di akses untuk keperluan Global
// Global (Bisa Diakses Dimanapun)
// Untuk menandai bahwa variabel tersbut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variabel constant nya




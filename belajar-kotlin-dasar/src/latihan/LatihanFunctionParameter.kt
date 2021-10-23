package latihan

import java.util.*

fun main() {

    cekTahunLahir("Zein", 26)
    cekTahunLahir("Fauzi", 24)
    println()
    cekNilaiLulus("Akhmad Fauzi", 90)
    cekNilaiLulus("Dodo", 40)

}

fun cekTahunLahir(name: String, age: Int) {
    println("""
        Hi $name
        Umur kamu $age Tahun
        Kamu Lahir Tahun ${2021 - age}
    """.trimIndent())

    if (age >= 25) println("Wahh Kamu Sudah Siap Nikah Nih")
    else println("Yahhh Kamu Belum Siap Nikah")

}

fun cekNilaiLulus(name: String, nilai: Int) {

    var keterangan = ""

    println("""
        Hi, $name
        Nilai kamu: $nilai
    """.trimIndent())

    if (nilai > 60) {
        keterangan = "Lulus"
        println("Selamat kamu $keterangan")
    } else {
        keterangan = "Tidak Lulus"
        println("Maaf kamu $keterangan")
    }

}
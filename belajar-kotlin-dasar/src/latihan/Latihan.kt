package latihan

import java.util.*

const val NAME_APP = "Latihan Kotlin Dasar"
const val TANGGAL_WRITE = "14 july 2021"
fun main() {

    val name: Array<String> = arrayOf(
        "Akhmad Fauzi",
        "Muhammad Zein",
        "Muhammad Adli Ilham",
        "Eko Rahmadeni",
        "Ade Septian"
    )
    val age: Array<Int> = arrayOf(
        24,
        26,
        23,
        25,
        27
    )

    println("""
        Name application            : $NAME_APP
        Tanggal dibuat              : $TANGGAL_WRITE
        Pembuat                     : ${name[0]}
        Age                         : ${age[0]}
        Jumlah karakter pada nama   : ${name[0].length}
        Jumlah Anggota              : ${name.size}
        nama nama anggota           : ${name[0]} ${age[0]} | ${name[1]} ${age[1]} | ${name[2]} ${age[2]} | ${name[3]} ${age[3]} | ${name[4]} ${age[4]}
    
        Pada Tahun depan usia para anggota: 
        ${name[0]} = ${age[0] + 1}
        ${name[1]} = ${age[1] + 1}
        ${name[2]} = ${age[2] + 1}
        ${name[3]} = ${age[3] + 1}
        ${name[4]} = ${age[4] + 1}
    """.trimIndent())


    val usiaNikah = 25

        println("""
            Siapa yang sudah siap nikah?
    
            Akhmad Fauzi   : ${age[0] >= usiaNikah}
            Muhammad Zein  : ${age[1] >= usiaNikah}
            Muhammad Adli  : ${age[2] >= usiaNikah}
            Eko Rahmadeni  : ${age[3] >= usiaNikah}
            Ade Septian    : ${age[4] >= usiaNikah}
            
        """.trimIndent())


    val syarat1 = "KAYA".lowercase(Locale.getDefault())
    val syarat2 = 25

    val syarat1Zein = "Kaya".lowercase(Locale.getDefault())
     val syarat2Zein = age[1]
    val resultZein = syarat1Zein == syarat1 && syarat2Zein >= syarat2
    println("Apakah ${name[1]} Menikah? $resultZein")
    if (resultZein) {
        println("${name[1]} Selamat menikah")
    }else {
        println("${name[1]} Nabung Lagi ya")
    }


    val syarat1Eko = "Biasa".lowercase(Locale.getDefault())
    val syarat2Eko = age[3]
    val resultEko = syarat1Eko == syarat1 && syarat2Eko >= syarat2
    println("Apakah ${name[3]} Menikah? $resultEko")
    if (resultEko) {
        println("${name[3]} Selamat menikah")
    }else {
        println("${name[3]} Nabung Lagi ya")
    }


    val syarat1Godel = "Biasa".lowercase(Locale.getDefault())
    val syarat2Godel = age[4]
    val resultGodel = syarat1Godel == syarat1 && syarat2Godel >= syarat2
    println("Apakah ${name[4]} Menikah? $resultGodel")
    if (resultGodel) {
        println("${name[4]} Selamat menikah")
    }else {
        println("${name[4]} Nabung Lagi ya")
    }

}
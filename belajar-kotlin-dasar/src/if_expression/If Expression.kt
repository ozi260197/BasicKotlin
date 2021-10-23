fun main() {

    // Kode If expression Bernilai True
    val nilai = 90
    if ( nilai > 80) {
        println("Good Job")
    }

    // Kode Untuk menangani Else
    val nilai1 = 50
    if (nilai1 > 75) {
        println("Good Job")
    } else {
        println("Coba Lagi ya")
    }


    // Kode Untuk Menangani Else If
    val nilaiSiswa = 75
    if (nilaiSiswa > 80) {
        println("Good Joob")
    } else if (nilaiSiswa > 60) {
        println("Cukup")
    } else {
        println("Coba Lagi")
    }



}



// Todo: If Expression
// Dalam kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
// Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

/*
    if( kondisi Boolean ) {
        // Jika kondisi bernilai True
        // Maka isi blok if akan di eksekusi
    }
 */

// Todo: Else Expression
// Blok if akan di eksekusi ketika kondisi if bernilai true
// Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
// Hal ini bisa dilakukan menggunakan else expression

/*
    if( kondisi Boolean ) {
        // Jika kondisi bernilai True
        // Maka isi blok if akan di eksekusi
    } else {
        // Jika kondisi bernilai false
        // Maka isi blok else akan di eksekusi
    }
 */

// Todo: Else If Expression
// Kadang dalam if, kita butuh membuat beberapa kondisi
// Kasus seperti ini, di kotlin kita bisa menggunakan Else If Expression

/*
    if( kondisi Boolean1 ) {
        // Jika kondisi1 bernilai True
    } else if ( Kondisi Boolean2 ) {
        // Jika Kondisi2 Bernilai True
    } else {
        // Jika Kondisi Bernilai False
    }
 */
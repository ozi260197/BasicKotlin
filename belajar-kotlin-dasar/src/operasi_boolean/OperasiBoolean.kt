fun main() {

    // Kode Operasi Boolean
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusKehadiran = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusKehadiran && apakahLulusExtra
    // Pengecekan operasi lebih dari 2 kondisi
    // dari kiri ke kanan terlebih dahulu

//    val apakahLulus = (apakahLulusUjian && apakahLulusKehadiran) && apakahLulusExtra
//    val apakahLulus = ((apakahLulusUjian && apakahLulusKehadiran) && apakahLulusExtra)
    println(apakahLulus)


}

// Todo: Operasi Boolean
// &&      ->   Dan / And
// ||      ->   Atau / Or
// !      ->   Kebalikan

// Todo: Operasi && And
// Operasi Logika && Untuk mencari kondisi Semua Bernilai True
// True && True = True
// True && False =  False
// False && True = False
// False && False = False

// Todo: Operasi || Or
// Operasi Logika || Untuk mencari kondisi salah satu bernilai True
// True || True = True
// True || False = True
// False || True = True
// False || False  = False

// Todo: Operasi ! Kebalikan
// Operasi Logika ! Untuk Mencari Nilai Kebalikan Dari Kondisi Boolean
// True = False
// False = True
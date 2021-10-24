package latihan

const val PROJECT_NAME = "Data Nilai Siswa"
const val TANGGAL_PEMBUATAN = "14 july 2021"
const val PEMBUAT = "Akhmad Fauzi"
fun main() {

    println("""
        Nama Project    : $PROJECT_NAME
        Tanggal Dibuat  : $TANGGAL_PEMBUATAN
        Create by       : $PEMBUAT
    """.trimIndent())

    val nilai = 60
    var grade = 'A'
    when {
        nilai >= 90 -> grade = 'A'
        nilai >= 70 -> grade = 'B'
        nilai >= 60 -> grade = 'C'
        else -> grade = 'D'
    }
    when (grade) {
        'A', 'B', 'C' -> println("""
            Nilai Anda : $nilai
            Grade Anda : $grade
            Keterangan : Selamat Anda Lulus!
        """.trimIndent())
        else -> println("""
            Nilai Anda : $nilai
            Grade Anda : $grade
            Keterangan : Maaf Anda Belum Lulus!
        """.trimIndent())
    }
}

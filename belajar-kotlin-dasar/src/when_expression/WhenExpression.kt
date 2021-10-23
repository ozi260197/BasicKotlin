fun main() {

    // KOde When
    val nilai = 'A'
    when (nilai) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    // When Expression Multiple OPtion
    val nilai1 = 'A'
    when (nilai1) {
        'A', 'B', 'C' -> println("Pass")
        else -> {
            println("Not Pass")
        }
    }

    // When Expression In
    val nilai2 = 'D'
    val passValue = arrayOf('A', 'B', 'C')
    when (nilai2) {
        in passValue -> println("Pass") // Jika nilai2 Ada didalam passValue yaitu didalam arrayOf maka akan di cetak
        !in passValue -> println("Try Again ") // Jika tidak ada maka ini akan di cetak
    }

    // When Expression Is
    val nilai3 = "Ozi"
    when (nilai3) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }

    // When Tanda Variable Pengganti If Else
    val nilai4 = 90
    when {
        nilai4 > 80 -> println("Good Job")
        nilai4 > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}

// Selain if expression, Untuk melakukan percabangan di kotlin, kita juga bisa menggunakan When Expression
// When Expression sangat sederhana dibandingkan if
// Biasanya When Expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable

// Todo: When Expression in
// Adalah when untuk mengecek nilai didalam array, Apakah ada nilai tersebut di dalam array

// Todo: When Expression is
// Adalah when untuk mengecek tipe data nya, apakah nilai tersebut tipe data nya sama

// Todo: When sebagai pengganti if else
// Selain pengecekan terhadap variable
// When juga dapat digunakan sebagai pengganti if else
// untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when
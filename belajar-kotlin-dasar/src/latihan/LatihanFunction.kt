package latihan

import java.util.*
import kotlin.math.log

fun main() {
    register()
}

fun register() {

    println("Masukan Name : ")
    val inputName = readLine()

    println("Masukan Email : ")
    val inputEmail = readLine()

    println("Masukan Password : ")
    val inputPassword = readLine()?.lowercase(Locale.getDefault())

    println("Confirmasi Password : ")
    val inputPassConfrm = readLine()?.lowercase(Locale.getDefault())

    // Cek Password
    when {
        inputPassword != inputPassConfrm -> {
            println("Password don't match")
            return register()
        }
        inputPassword?.length!! < 8 && inputPassConfrm?.length!! < 8 -> {
            println("Password harus berisi minimal 8 karakter")
            return register()
        }
        else -> {
            println("""
                Nama Kamu  : $inputName
                Email Kamu : $inputEmail
            """.trimIndent())
            return login()
        }


    }

}

fun login() {

    val name = "Akhmad Fauzi"
    val email = "akhmadfauzi189@gmail.com"
    val password = "anakomega1046"

    println()
    println("Ayo Masuk Dulu!")
    println()

    println("Masukin Email lu!")
    val inputEmail = readLine()

    println("password lu juga")
    val inputPassword = readLine()

    when {
        inputEmail != email -> {
            println("-----------------------")
            println("|  Email lu kaga ada  |")
            println("-----------------------")
            return login()
        }

        inputPassword != password -> {
            println("---------------------------------------")
            println("|  Eits, Ini Bukan Password lu bedul  |")
            println("---------------------------------------")

            return login()
        }

        else -> {
            println("----------------------------------")
            println("|  Sip $name boleh masuk  |")
            println("----------------------------------")
        }
    }

}
package latihan

fun main() {
    println(masuk("hcsvgsvxgsvx", "hvhsxhbxs"))
    println(masuk("akhmadfauzi@gmail.com", "anakomega1046"))
}

fun masuk(inputEmail: String, inputPassword: String): String {
    val email = "akhmadfauzi@gmail.com"
    val password = "anakomega1046"

    if (inputEmail != email && inputPassword != password) {
        return "Salah"
    } else{
        return "Masuk"
    }
}
fun main() {
    var firstName: String = "Akhmad"
    var lastName: String = "Fauzi"
    var address: String = """
        Street Not Yet Done,
        City Bekasi,
        Country Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

//    ---------------------------------------------String-----------------------------------------------------
    // Penggabungan String
    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "Total Length Character pada $fullName -> ${fullName.length}"
    println(desc)
}
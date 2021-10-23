package latihan


fun main() {

    val names: Array<String> = arrayOf(
        "Akhmad Fauzi",
        "Muhammad Zein",
        "Ade Septian",
        "Muhammad Adli Ilham",
        "Eko Rahmadeni"
    )
    val nilai: IntArray = intArrayOf(
        80,
        90,
        70,
        60,
        50
    )

    val person  = arrayOf(
        "${names[0]} = ${nilai[0]}",
        "${names[1]} = ${nilai[1]}",
        "${names[2]} = ${nilai[2]}",
        "${names[3]} = ${nilai[3]}",
        "${names[4]} = ${nilai[4]}"
    )

    val getIndexNames = names.size -1
    for (i in 0..getIndexNames) {
        println("Nama dengan index ke-$i = ${names[i]}")
    }

    val getIndexNilai = nilai.size -1
    for (i in 0..getIndexNilai) {
        println("Nilai dengan index ke-$i = ${nilai[i]}")
    }

    val getIndexPerson = person.size -1
    for (i in 0..getIndexPerson) {
        println("Index ke-$i = ${person[i]}")
    }

}
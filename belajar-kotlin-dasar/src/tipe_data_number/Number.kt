fun main() {
    var age: Byte = 30
    println("Age : $age -> ${age.javaClass}")

    var height: Int = 170
    println("height : $height -> ${height.javaClass}")

    var distance: Short = 2000
    println("distance : $distance -> ${distance.javaClass}")

    var balance: Long = 1000000000L
    println("balance : $balance -> ${balance.javaClass}")
// ----------------------------------------------------Number----------------------------------------------//
    // Floating Point
    var value: Float = 98.98F
    println("value : $value -> ${value.javaClass}")

    var radius: Double = 234234234.567567
    println("radius : $radius -> ${radius.javaClass}")
//    ----------------------------------------------------Number-------------------------------------------//
    // Literals
    var decimalLiteral: Int = 100
    println(decimalLiteral)

    var hexaDecimalLiteral: Int = 0xFF
    println(hexaDecimalLiteral)

    var binaryLiteral: Int = 0b0001
    println(binaryLiteral)

//  --------------------------------------------------Number------------------------------------------------//
    // fitur underscore in number
    // Sebuah Separator untuk memudahkan pembacaan Angka
    var age1: Byte = 3_0
    var height1: Int = 1_7_0
    var distance1: Short = 2_000
    var balance1: Long = 100_000_000L

//  -------------------------------------------------Number--------------------------------------------------//
    // Conversi number
    var number: Int = 100
    println(number)

    var byte: Byte = number.toByte()
    println("conversi $number to byte -> $byte")

    var short: Short = number.toShort()
    println("conversi $number to short -> $short")

    var int: Int = number.toInt()
    println("conversi $number to int -> $int")

    var long: Long = number.toLong()
    println("conversi $number to long -> $long")

    var float: Float = number.toFloat()
    println("conversi $number to float -> $float")

    var double: Double = number.toDouble()
    println("conversi $number to double -> $double")
}
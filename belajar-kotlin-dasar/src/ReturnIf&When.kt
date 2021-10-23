fun main() {

    fun sayHello(name: String = ""): String {
        // Return if
//        return if (name == "") {
//            "Hello Bro"
//        } else {
//            "Hello $name"
//        }


        // Return when
        return when (name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }

    }

    println(sayHello())
    println(sayHello("Akhmad Fauzi"))
}

// Kadang dalam sebuah function, kita sering menggunakan if expression atau when expression
// lalu didalam blok nya kita mengembalikan nilai untuk sebuah function

// Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
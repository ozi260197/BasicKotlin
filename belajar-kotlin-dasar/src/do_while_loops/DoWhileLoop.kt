fun main() {

    var i = 0
    do {
        println("Perulangan ke $i")
        i++
    }while (i < 10)

    /**
     *  Contoh kode do while dengan kondisi false
     *
     *  Blok Hanya akan dijalankan sekali dan tidak looping
     *
     */

    var a = 100
    do {
        println("Perulangan $a")
        a++
    }while (a < 10)

}

// Do While Loop adalah perulangan yang hampir sama dengan While Loop
// Yang membedakan adalah, Pada Do While Loop, Kode Blok akan dijalankan terlebih dahulu, baru di akhir
// dilakukan pengecekan kondisi
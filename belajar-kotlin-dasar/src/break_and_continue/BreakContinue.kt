fun main() {


    var i = 0

    /**
     * Ini adalah kode break
     *
     * yang berjalan tanpa henti
     */
    while(true) {
        println("Perulangan ke $i")
        i++

        /**
         * Jika looping melebihi 1000, Break
         */
        if (i > 1000) {
            break
        }
    }

    /**
     *  Kode Continue
     *  perulangan range 0..1000
     */
    for (i in 0..1000) {

        /**
         *   cek kondisi nya, Jika bilangan genap menggunakan operator modulo maka continue
         *   nilai yang akan di continue / dilewatkan adalah nilai genap
         */
        if (i % 2 == 0) {
            continue
        }
        /**
         * Maka yang akan di cetak adalah hanya nilai ganjil
         */
        println(i)
    }


}

// Break & Continue adalah kata kunci yang bisa digunakan dalam semua perulangan di kotlin
// Break digunkan untuk menghentikan seluruh perulangan
// Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya
fun main() {

    /**
     *
     * Nilai didalam arrayOf() hanya tersimpan dalam variabel dan belum bisa di akses
     *
     */
    val members: Array<String> = arrayOf("Fauzi", "Zein", "Eko")
    val value: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    /**
     * Belum dapat diakses
     */
    println(members)
    println(value)
    println(balances)

    /**
     * Cara mengakses nilai pada arrayOf()
     *
     * mendapatkan nilai
     */
    println("Nilai pada array pertama pada index 0 adalah : ${members[0]}")
    println("Nilai pada array kedua pada index 1 adalah : ${members.get(1)}")
    println("Nilai pada array ketiga pada index 2 adalah : ${members.get(2)}")

    /**
     * Mengubah nilai
     */
    members[0] = "Ozi"
    members.set(0, "zi")
    print("Hasil mengubah nilai array pada index pertama [0] menjadi : ${members[0]}")

    println()

    /**
     * Mendapatkan Panjang Array / Jumlah Nilai Didalam Array
     */
    println("Panjang atau jumlah nilai di dalam array member adalah : ${members.size}")

// -----------------------------------------------Array Nullable----------------------------------------------------------

    var name: Array<String?> = arrayOfNulls(5)
    name[0] = "Fauzi"
    name[1] = "Eko"
    name[2] = "Zein"
    name[3] = null
    name[4] = "Ade"
    println(name.size)
    println(name[3])

}




// Todo: Tipe Data Array
// Array Adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
// tipe data array di kotlin dipresentasikan dengan kata kunci Array
// di array ada istilah Index , data didalam array dapat di akses menggunakan index
// index dihitung dari 0 untuk nilai pertama yang ada didalam array
// untuk mengakses array menggunakan index harus menggunakan [] setelah call variabelnya[0] dengan menyebutkan posisi keberapa dari 0 sampe seterusnya

// Todo: Operasi Array
// Operasi yang dapat digunakan untuk mengakses array
// size -> Untuk mendapatkan panjang array / jumlah pada nilai dalam array
// get(index) -> mendapat data posisi index
// [index] -> Mendapat data posisi index
// set(index, value) -> mengubah data posisi index
// [index] = value -> mengubah data posisi index

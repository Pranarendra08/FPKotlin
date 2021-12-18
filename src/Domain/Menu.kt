package Domain

import java.lang.NumberFormatException
import java.util.Scanner

class Menu {
    private lateinit var Pilihan: String
    private lateinit var Jumlah: String
    fun pilihFilm() {
        val scan = Scanner(System.`in`)
        println("============DAFTAR FILM============")
        println("1. Spider-Man: No way Home")
        println("2. Ghostbusters: Afterlife")
        println("3. The Boss Baby: Family Bussiness")
        println("4. Encanto")
        println("===================================")
        print("\nPilih Film yang ingin anda tonton : ")
        Pilihan = scan.nextLine()
        print("\nBerapa jumlah tiket yang ingin anda beli : ")
        Jumlah = scan.nextLine()
        try {
            val f1 = Film1("Spider-Man: No way Home", "148 Menit", "A", "13.00", 50000, Jumlah?.toInt())
            val f2 = Film2("Ghostbusters: Afterlife", "124 Menit", "B", "16.00", 45000, Jumlah?.toInt())
            val f3 = Film3("The Boss Baby: Family Bussiness", "107 Menit", "C", "19.00", 40000, Jumlah?.toInt())
            val f4 = Film4("Encanto", "109 Menit", "D", "13.00", 40000, Jumlah?.toInt())

            when(Pilihan.toInt()) {
                1 -> {
                    println("-----------TIKET-----------")
                    f1.displayFilm()
                    println("---------------------------")
                    println("Terima kasih!")
                }
                2 -> {
                    println("-----------TIKET-----------")
                    f2.displayFilm()
                    println("---------------------------")
                    println("Terima kasih!")
                }
                3 -> {
                    println("-----------TIKET-----------")
                    f3.displayFilm()
                    println("---------------------------")
                    println("Terima kasih!")
                }
                4 -> {
                    println("-----------TIKET-----------")
                    f4.displayFilm()
                    println("---------------------------")
                    println("Terima kasih!")
                }
                else -> {
                    println("Opps pilihan tidak tersedia")
                }
            }
        } catch (e : NumberFormatException) {
            println(e)
            println("Mohon pilih film dan masukkan jumlah tiket")
            pilihFilm()
        }



    }
}
package Presenter

import Domain.Film1
import Domain.Film2
import Domain.Film3
import Domain.Film4
import Domain.Login
import java.util.Scanner

import javax.swing.DefaultCellEditor


fun main() {
    var ulang = "Y"
    val scan = Scanner(System.`in`)

    println("Selamat datang di program pembelian tiket Bioskop")
    println("Silahkan Login terlebih dahulu")

    Login().verifikasi()
    //kasih looping booss
    do {
        println("============DAFTAR FILM============")
        println("1. Spider-Man: No way Home")
        println("2. Ghostbusters: Afterlife")
        println("3. The Boss Baby: Family Bussiness")
        println("4. Encanto")
        println("===================================")
        print("\nPilih Film yang ingin anda tonton : ")
        var Pilihan = scan.nextLine()
        print("\nBerapa jumlah tiket yang ingin anda beli : ")
        var Jumlah = scan.nextLine()

        val f1 = Film1("Spider-Man: No way Home", "148 Menit", "A", "13.00", 40000, Jumlah.toInt())
        val f2 = Film2("Ghostbusters: Afterlife", "124 Menit", "B", "16.00", 40000, Jumlah.toInt())
        val f3 = Film3("The Boss Baby: Family Bussiness", "107 Menit", "C", "19.00", 40000, Jumlah.toInt())
        val f4 = Film4("Encanto", "109 Menit", "D", "13.00", 40000, Jumlah.toInt())

        when(Pilihan.toInt()) {
            1 ->{
                println("-----------TIKET-----------")
                f1.displayFilm()
                println("---------------------------")
                println("Terima kasih!")
            }
            2 ->{
                println("-----------TIKET-----------")
                f2.displayFilm()
                println("---------------------------")
                println("Terima kasih!")
            }
            3 ->{
                println("-----------TIKET-----------")
                f3.displayFilm()
                println("---------------------------")
                println("Terima kasih!")
            }
            4 ->{
                println("-----------TIKET-----------")
                f4.displayFilm()
                println("---------------------------")
                println("Terima kasih!")
            }
            else ->{
                println("Opps pilihan tidak tersedia")
            }
        }

        println("Apakah anda ingin membeli Tiket lagi? (Y/N)")
        var ulang = readLine().toString()
        if (ulang == "Y" || ulang == "y"){
            continue
        } else if (ulang == "N" || ulang == "n") {
            break
        } else {
            println("Opps anda salah memasukkan input")
            println("Program Berhenti")
            break
        }
    } while (ulang == "Y" || ulang == "y")

    println("Terima kasih")

}
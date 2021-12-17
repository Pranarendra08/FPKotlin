package Presenter

import Domain.Film1
import Domain.Film2
import Domain.Film3
import Domain.Film4
import Domain.Menu
import java.util.Scanner

import Domain.Login


fun main() {
    var ulang = "Y"
    val scan = Scanner(System.`in`)

    println("Selamat datang di program pembelian tiket Bioskop")
    println("Silahkan Login terlebih dahulu")

    Login().verifikasi()

    do {
        Menu().pilihFilm()

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
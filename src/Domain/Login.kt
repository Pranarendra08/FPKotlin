package Domain

import Data.Account

class Login : inter{
    //kasih nullpointer exception
    override fun verifikasi() {
        var Username: String? = null
        var Password: String? = null

        print("masukkan User name : ")
        Username = readLine().toString()

        print("Masukkan Password : ")
        Password = readLine().toString()

        var akun = Account(Username, Password)
        if (Password != akun.DaftarAkun[Username]) {
            println("Maaf Username atau Password salah")
            verifikasi()
        } else {
            println("Hai $Username, Mau nonton film apa?")
            println(Username?.length)
        }
    }

}
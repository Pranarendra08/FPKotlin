package Domain

open class Film(var Judul: String?, var Durasi: String?) {
    fun Film(Judul: String, Durasi: String) {
        this.Judul = Judul
        this.Durasi = Durasi
    }

    open fun displayFilm() {
        println("Judul\t: $Judul")
        println("Durasi\t: $Durasi")
    }
}
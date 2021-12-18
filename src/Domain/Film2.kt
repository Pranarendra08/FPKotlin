package Domain

class Film2 : Film{
    private var Studio: String
    private var Jam: String
    private var Harga: Int
    private var Jumlah: Int
    constructor(Judul: String, Durasi: String, Studio: String, Jam: String, Harga: Int, Jumlah: Int) : super(Judul, Durasi){
        this.Judul = Judul
        this.Durasi = Durasi
        this.Studio = Studio
        this.Jam = Jam
        this.Harga = Harga
        this.Jumlah = Jumlah
    }

    fun Film2(Judul: String, Durasi: String, Studio: String, Jam: String, Harga: Int, Jumlah: Int){
        this.Judul = Judul
        this.Durasi = Durasi
        this.Studio = Studio
        this.Jam = Jam
        this.Harga = Harga
        this.Jumlah = Jumlah
    }

    fun Film2(Studio: String, Jam: String, Harga: Int, Jumlah: Int){
        this.Studio = Studio
        this.Jam = Jam
        this.Harga = Harga
        this.Jumlah = Jumlah
    }


    override fun displayFilm() {
        super.displayFilm()
        println("Studio\t: $Studio")
        println("Jam\t\t: $Jam")
        println("Jumlah\t: $Jumlah")
        println("Harga\t: ${Harga*Jumlah}")
    }
}
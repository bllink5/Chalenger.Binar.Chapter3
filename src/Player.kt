class Player (var pemain1 : Janken ) {
    var Pemain1 = ""
    fun cetakPlayer() {
        val Janken = arrayOf("batu","gunting","kertas")
        println("Pemain 1 masukkan batu,gunting,kertas : ")
        Pemain1 = readLine()!!.trim().toLowerCase()
        if(!Janken.contains(Pemain1)){
            do {
                println("input salah")
                Pemain1 = readLine()!!.trim().toLowerCase()
            }while (!Janken.contains(Pemain1))
        }
    }
}

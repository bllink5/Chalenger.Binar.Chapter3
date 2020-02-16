class Player2(var pemain2 : Janken) {
    var Pemain2 = ""
    fun cetakPlayer2(){
        val Janken = arrayOf("batu","gunting","kertas")
        println("Pemain 2 masukkan batu,gunting,kertas : ")
        Pemain2 = readLine()?.trim()!!.toLowerCase()
        if (!Janken.contains(Pemain2) ) {
            do {
                println("INPUT SALAH")
                Pemain2 = readLine()?.trim()!!.toLowerCase()
            }while (!Janken.contains(Pemain2))
        }
    }
}
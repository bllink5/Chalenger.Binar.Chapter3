class System(var p1 : Player, var p2 : Player2){
    fun cetakSystem() {
        val result: String
        p1.cetakPlayer()
        p2.cetakPlayer2()
        if (p1.Pemain1.equals(p2.Pemain2)) {
            result = "seri"
        } else if ((p1.Pemain1.equals("batu") && p2.Pemain2.equals("gunting")) ||
            (p1.Pemain1.equals("gunting") && p2.Pemain2 == "kertas") ||
            (p1.Pemain1.equals("kertas") && p2.Pemain2.equals("batu"))
        ) {
            result = "Pemain 1 menang"
        } else result = "Pemain 2 menang"
        println("Masukkan Pemain 1 : ${p1.Pemain1}")
        println("Masukkan Pemain 2 : ${p2.Pemain2}")
        println(result)
        println("Lagi ? : Y/N")

        val input = readLine()
        if (input.equals("y",ignoreCase = true)) {
            return cetakSystem()
        } else (input.equals("n",ignoreCase = true))
        println("GAME OVER")
    }
}
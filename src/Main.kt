fun main (){
 var pilihan = Janken(tiga = arrayOf("batu","gunting","kertas"))

 var player = Player(pemain1 = pilihan)

 var player2 = Player2(pemain2 = pilihan)

 var sistem = System(p1 = player,p2 = player2)

 var input = 0

 do {
  println("======================================")
  println("               GAME SUIT              ")
  println("======================================")
  println(" 1. PLAY ")
  println(" 2. EXIT ")
  input = readLine()!!.toInt()
  when(input){
   1-> sistem.cetakSystem()
   2-> println("TERIMA KASIH TELAH BERMAIN")
  }
 }while (input!=2)
}
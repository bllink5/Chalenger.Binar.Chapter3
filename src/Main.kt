fun main (){

 val player = Player()

 val player2 = Player2()

 val sistem = System(p1 = player,p2 = player2)

 var input: Int

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
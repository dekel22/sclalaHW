package quote

import heroes.Utils


object RandomQuoter extends Quote{
  val text = ""


  override def printMessage(): Unit= {
    val num= Utils.df.getNumberBetween(4,12)
    var randomText = ""
    for(_ <- 1 to num){
      randomText = randomText +" " + Utils.df.getRandomWord(2,12)
    }
    println(randomText)
  }


}

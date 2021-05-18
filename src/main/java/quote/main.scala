package quote


object main {


  def main(args: Array[String]): Unit = {

    val quote=MessageQuoter("die or not")
    quote.printMessage()
    RandomQuoter.printMessage()
    val df=new ShakespearQuoter()
    df.printMessage()
  }

}

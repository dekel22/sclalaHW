package quote

trait Quote {
  val text:String
  def printMessage(): Unit= println(text)

}

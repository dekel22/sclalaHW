package quote

class ShakespearQuoter(override val text: String = "to be or not to be") extends Quote {
  override def printMessage(): Unit=println(text)

}

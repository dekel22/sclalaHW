package quote

class QuoterAggregator {
  var quoterList: List[Quote] = Nil

  def addQuoter(quote: Quote): Unit = {
    quoterList = quoterList.appended(quote)
  }

  def printAllQuotes(): Unit = {
    quoterList.foreach(_.printMessage())
  }

}

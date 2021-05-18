package heroes

object Fight {
  def main(args: Array[String]): Unit = {
    val heroA=HeroFactory.getRandomHero
    val heroB=HeroFactory.getRandomHero
    if (heroA.name==heroB.name) heroB.name=heroB.name   +"2"

    println(heroA.name+" is fighting " + heroB.name)
    while (true) {
      heroA.Kick(heroB)
      if (!heroB.isAliveLoud){
        return
      }
      heroB.Kick(heroA)
      if (!heroA.isAliveLoud){
        return
      }
    }
  }
}

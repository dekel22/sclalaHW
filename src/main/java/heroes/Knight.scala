package heroes

class Knight extends Hero {
  power= Utils.df.getNumberBetween(2,12)
  hp =  Utils.df.getNumberBetween(2,12)
  name= "knight"
  override def Kick(enemy:Hero): Unit={
    super.Kick(enemy)
    enemy.removeHp(Utils.df.getNumberBetween(0,hp))

  }
}

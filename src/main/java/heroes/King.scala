package heroes

class King extends Hero {
   power= Utils.df.getNumberBetween(5,15)
   hp =  Utils.df.getNumberBetween(5,15)
  name = "king"
  override def Kick(enemy:Hero): Unit= {
    super.Kick(enemy)
    enemy.removeHp(Utils.df.getNumberBetween(0,hp))
  }
}

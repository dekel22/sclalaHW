package heroes

trait Hero {
  var power:Int=0
  var hp:Int=0
  var name:String=""
  def Kick(enemy:Hero): Unit={
    println(name + " kick " +enemy.name)
  }

  def removeHp(by:Int): Unit={
    println(name + " hp decrease by " + by)
    hp-=by
  }
  def removePower(by:Int): Unit={
    println(name + " power decrease by " + by)
    hp-=by
  }
  def die():Unit=hp=0

  def isAliveLoud:Boolean={
    if (hp>0)  return true
    println(name + " is dead")
    false
  }

}

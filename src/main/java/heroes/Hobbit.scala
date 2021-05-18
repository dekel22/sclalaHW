package heroes

class Hobbit extends Hero {
  power= 0
  hp= 3
  name="hobbit"
  override def Kick(enemy:Hero): Unit=println(name  +" cry")
}

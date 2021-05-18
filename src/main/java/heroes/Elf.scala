package heroes

class Elf extends Hero {
  power=10
  hp = 10
  name="elf"
  override def Kick(enemy:Hero): Unit={
    super.Kick(enemy)
    if (enemy.hp<hp) enemy.die()
    else enemy.removeHp(1)
  }
}

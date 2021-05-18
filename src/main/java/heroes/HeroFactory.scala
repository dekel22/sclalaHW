package heroes

import org.reflections.Reflections

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HeroFactory {
  private val scanner = new Reflections("heroes")
  private val heroesClasses = scanner.getSubTypesOf(classOf[Hero]).asScala.toList

  def getRandomHero: Hero = {
    val randomClass = Utils.rand.nextInt(heroesClasses.size)
    heroesClasses(randomClass).getDeclaredConstructor().newInstance()
  }

}

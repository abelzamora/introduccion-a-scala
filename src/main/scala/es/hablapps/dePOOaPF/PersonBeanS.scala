package es.hablapps.dePOOaPF

case class PersonBeanS(name: String, secondName: String, deceased:Boolean)

object PersonBeanS {
  val defaultWorld: String = "La Tierra"
  def apply(name: String, secondName: String): PersonBeanS = new PersonBeanS(name, secondName, deceased = true)
}

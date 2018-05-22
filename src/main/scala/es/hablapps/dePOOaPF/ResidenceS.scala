package es.hablapps.dePOOaPF

trait Residence {
  val city: String
  val country: String = "Spain"
}

class PersonBeanSResidence(name:String,
                           secondName:String,
                           deceased:Boolean,
                           override val city: String) extends PersonBeanS(name, secondName, deceased) with Residence
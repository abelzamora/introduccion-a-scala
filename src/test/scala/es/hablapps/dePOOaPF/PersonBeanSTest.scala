package es.hablapps.dePOOaPF

import org.scalatest.{FlatSpec, Matchers}

class PersonBeanSTest extends FlatSpec with Matchers {

  "PersonBeanS" should "be created and return a value" in {
    val person: PersonBeanS = new PersonBeanS(name = "Bob",secondName =  "Esponja", deceased =  false)

    person.name shouldBe "Bob"
    person.secondName shouldBe "Esponja"
    person.deceased shouldBe false
  }

  it should "be created using the companion object" in{
    val person: PersonBeanS = PersonBeanS(name = "Bob",secondName =  "Esponja")

    person.name shouldBe "Bob"
    person.secondName shouldBe "Esponja"
    person.deceased shouldBe true
  }

  it should "return the defaultWorld from companion object" in {
    PersonBeanS.defaultWorld shouldBe "La Tierra"
  }

  "Residence" should "create a new instance of PersonBeanSResidence" in {
    val personBeanSResidence = new PersonBeanSResidence(name = "Patrick", secondName = "Star", deceased = false, city = "underwater")

    personBeanSResidence.country shouldBe "Spain"
    personBeanSResidence.name shouldBe "Patrick"
    personBeanSResidence.secondName shouldBe "Star"
  }

}

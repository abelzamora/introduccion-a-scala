package es.hablapps.dePOOaPF;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class <code>PersonBeanJTest</code>.
 */
public class PersonBeanJTest {
    @Test
    public void testPerson() {
        final PersonBeanJ person = new PersonBeanJ("Bob", "Esponja", false);

        assertThat(person.getName(), is("Bob"));
        assertThat(person.getSecondName(), is("Esponja"));
        assertThat(person.isDeceased(), is(false));
    }

    @Test
    public void testPersonSinglenton(){
        final PersonBeanNSnJ person = PersonBeanNSnJ.getInstance();

        person.setName("Bob");
        person.setSecondName("Esponja");

        assertThat(person.getName(), is("Bob"));
        assertThat(person.getSecondName(), is("Esponja"));
        assertThat(person.isDeceased(), is(false));
    }

    @Test
    public void testPersonSinglentonDefaultValue(){
        assertThat(PersonBeanNSnJ.getInstance().getDefaultWorld(), is("La Tierra"));

    }

    @Test
    public void testPersonBeanInterface(){
        final PersonBeanJResidence person = new PersonBeanJResidence("Patrick", "Star", false, "underwater");

        assertThat(person.getCountry(), is("Spain"));
        assertThat(person.getName(), is("Patrick"));
        assertThat(person.getSecondName(), is("Star"));
    }
}

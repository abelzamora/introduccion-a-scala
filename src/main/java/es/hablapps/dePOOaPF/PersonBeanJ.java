package es.hablapps.dePOOaPF;

class PersonBeanJ {

    /** Properties **/
    private boolean deceased = false;

    /** Property <code>name</code> (note capitalization) readable/writable. */
    private String name = null;
    /** Property <code>secondName</code> (note capitalization) readable/writable. */
    private String secondName = null;
    /** No-arg constructor (takes no arguments). */
    public PersonBeanJ() {
    }

    public PersonBeanJ(String name, String secondName, boolean deceased) {
        this.name = name;
        this.secondName = secondName;
        this.deceased = deceased;
    }

    /**
     * Getter for property <code>setSecondName</code>
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Setter for property <code>setSecondName</code>.
     *
     * @param value
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Getter for property <code>name</code>
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property <code>name</code>.
     *
     * @param value
     */
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Getter for property "deceased"
     * Different syntax for a boolean field (is v.s. get)
     */
    public boolean isDeceased() {
        return deceased;
    }

    /**
     * Setter for property <code>deceased</code>.
     * @param value
     */
    public void setDeceased(boolean value) {
        deceased = value;
    }
}

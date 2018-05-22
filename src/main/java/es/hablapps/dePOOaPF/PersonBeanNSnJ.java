package es.hablapps.dePOOaPF;

public class PersonBeanNSnJ extends PersonBeanJ {
    private String defaultWorld;

    public String getDefaultWorld() {
        return defaultWorld;
    }

    public void setDefaultWorld(String defaultWorld) {
        this.defaultWorld = defaultWorld;
    }

    private static PersonBeanNSnJ instance = null;

    public static PersonBeanNSnJ getInstance() {
        if(instance == null) {
            instance = new PersonBeanNSnJ();
        }
        instance.setDefaultWorld("La Tierra");
        instance.setDeceased(false);
        return instance;
    }
}

public class Case {
    private String ModelName;
    private String manufacturer;
    private Dimension theDimension;

    public Case(String modelName, String manufacturer, Dimension theDimension) {
        ModelName = modelName;
        this.manufacturer = manufacturer;
        this.theDimension = theDimension;
    }

    public void PressPowerButton(){
        System.out.println("Power button is pressed");
    }

    public String getModelName() {
        return ModelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getTheDimension() {
        return theDimension;
    }
}

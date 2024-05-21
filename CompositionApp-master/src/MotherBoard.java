public class MotherBoard {
    private String ModelName;
    private String Manufacturer;
    private int ramSlots;
    private int cardSlots;

    public MotherBoard(String modelName, String manufacturer, int ramSlots, int cardSlots) {
        ModelName = modelName;
        Manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String ProgramName) {
        System.out.println(ProgramName+" is loading...");
    }

    public String getModelName() {
        return ModelName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}

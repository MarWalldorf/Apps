public class Monitor {
    private String ModelName;
    private String Manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String modelName, String manufacturer, int size, Resolution nativeResolution) {
        ModelName = modelName;
        Manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at "+x+" , "+y+" with color "+color);

    }

    public String getModelName() {
        return ModelName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

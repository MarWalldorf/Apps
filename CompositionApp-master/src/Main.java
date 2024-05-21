public class Main {

    public static void main(String[] args) {
        Case thecase = new Case("220B","Acer",new Dimension(24,20,15));
        Monitor theMonitor = new Monitor("LG Ultra Wide","LG",39,new Resolution(2450,1080));
        MotherBoard theMotherBoard = new MotherBoard("V2","Asus",4,2);

        PC myPC = new PC(thecase,theMonitor,theMotherBoard);
        myPC.getTheMonitor().drawPixelAt(25,10,"red");
        myPC.getTheMotherBoard().loadProgram("Booting");
        myPC.getTheCase().PressPowerButton();
    }
}

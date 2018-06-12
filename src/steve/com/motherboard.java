package steve.com;

/**
 * Created by steve on 10/04/2018.
 */
public class motherboard {
    private String model;
    private String manufacturer;
    private int bios;
    private int ramslot;
    private int cardslot;

    public motherboard(String model, String manufacturer, int bios, int ramslot, int cardslot) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramslot = ramslot;
        this.cardslot = cardslot;
    }

    public void LoadProgram(String ProgramName){
        System.out.println("Program" +ProgramName+ " is now loading.....");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getBios() {
        return bios;
    }

    public int getRamslot() {
        return ramslot;
    }

    public int getCardslot() {
        return cardslot;
    }
}

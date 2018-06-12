/*
 * This file was edited by Tom
 * thanks
 * You're welcome
 */


package steve.com;

public class Main {

    public static void main(String[] args) {
	Dimension dimension = new Dimension(20,20,5);
	Case theCase = new Case("B220","Lenovo","240",dimension);

    Monitor theMonitor = new Monitor("27inches Beast","Acer",27,new Resolution(2540,1449));

    motherboard theMotherBoard = new motherboard("BJ-200","Asus", 4,6,4);

    PC thePC = new PC(theCase,theMotherBoard,theMonitor);
     thePC.powerUp();
    }
}

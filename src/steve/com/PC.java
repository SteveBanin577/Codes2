package steve.com;

/**
 * Created by steve on 10/04/2018.
 */
public class PC {
    private Case theCase;
    private motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, steve.com.motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public  void drawLogo(){
     monitor.DrawPixelAt(1200,200,"yellow");
    }

    public void powerUp(){
        theCase.PressPowerButton();
        drawLogo();

    }

    private Case getTheCase() {
        return theCase;
    }

    private steve.com.motherboard getMotherboard() {

        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }
}

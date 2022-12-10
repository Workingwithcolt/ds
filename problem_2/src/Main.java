import javax.management.monitor.Monitor;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Case thecase = new Case("2208","Dell","245", new Dimension(20,204,43));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,43));

        Pc thepc = new pc(thecase,theMonitor,theMonitor);

        thepc.getMonitor().dra
    }
}

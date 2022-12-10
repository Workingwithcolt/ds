import java.awt.*;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacture, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
    private void pressPowerButton(){
        System.out.println("Power pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}

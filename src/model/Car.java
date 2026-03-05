package model;

public class Car {
    private long id;
    private String licensePlate;
    private Model model;



    public Car(long id, String licensePlate, Model model) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.model = model;
        this.model.addCar(this);
    }

    public Car(String licensePlate, Model model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.model.addCar(this);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

}



public class Driver {
    public String name;
    public int driverId;
    public double driversEarnings;

    public Driver(String name, int driverId) {
        this.name = name;
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public double getDriversEarnings() {
        return driversEarnings;
    }

    public void setDriversEarnings(double driversEarnings) {
        this.driversEarnings = driversEarnings;
    }

}

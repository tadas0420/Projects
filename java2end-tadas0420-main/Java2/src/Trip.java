public class Trip {
    public double distance;
    public Car car;
    public Customer customer;
    public double price;

    public Trip(double distance, Car car, Customer customer) {
        this.distance = Math.abs(distance);
        this.car = car;
        this.customer = customer;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = Math.abs(distance);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPriceOfTheTrip() {
        double enviromentPrice = 0;

        if (distance / 10 >= 1) {
            enviromentPrice = distance / 10 * 3;
        }

        price = distance * car.getPRICEPERKM() + enviromentPrice;
        car.getDriver().setDriversEarnings(getCar().getDriver().getDriversEarnings() + price);
        return price;
    }
}

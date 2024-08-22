public class Car {
    public CarBrand brand;
    public double PRICEPERKM = 0.5;
    public double enviromentSurcharge = 3;
    public Driver driver;
    public String licensesPlate;

    public Car(CarBrand brand, Driver driver, String licensesPlate) {
        this.brand = brand;
        this.driver = driver;
        this.licensesPlate = isValidLicensePlate(licensesPlate) ? licensesPlate : null;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getLicensesPlate() {
        return licensesPlate;
    }

    public void setLicensesPlate(String licensesPlate) {
        if(isValidLicensePlate(licensesPlate)) {
            this.licensesPlate = licensesPlate;
        }
    }

    private boolean isValidLicensePlate(String licensesPlate){
        /*
         * The license plate has the format "NL99XX"
         * ^ - start of the string
         * [A-Z]{2} - two uppercase letters
         * [0-9]{2} - two numbers
         * [A-Z]{2} - two uppercase letters
         * $ - end of the string
         */
        return licensesPlate.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}$}");
    }

    public double getPRICEPERKM() {
        return PRICEPERKM;
    }

    public double getEnviromentSurcharge() {
        return enviromentSurcharge;
    }
}
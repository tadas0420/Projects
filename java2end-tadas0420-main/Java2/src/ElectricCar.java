public class ElectricCar extends Car {
    public double PRICEPERKM = 0.25;

    public ElectricCar(CarBrand brand, Driver driver, String licensesPlate) {
        super(brand, driver, licensesPlate);
    }

    @Override
    public double getPRICEPERKM() {
        return PRICEPERKM;
    }
}

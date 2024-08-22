public class DieselCar extends Car {
    public double PRICEPERKM = 0.63;

    public DieselCar(CarBrand brand, Driver driver, String licensesPlate) {
        super(brand, driver, licensesPlate);
    }

    @Override
    public double getPRICEPERKM() {
        return PRICEPERKM;
    }

}

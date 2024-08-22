import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    Driver d1 = new Driver("John", 1);
    Driver d2 = new Driver("Jim", 2);
    Driver d3 = new Driver("Tom", 3);
    Driver d4 = new Driver("Tim", 4);
    Driver d5 = new Driver("Felix", 5);
    Driver d6 = new Driver("Grey", 6);

    Car car1 = new Car(CarBrand.Brand1, d1, "NL01AB");
    Car car2 = new Car(CarBrand.Brand2, d2, "NL02AB");
    DieselCar dieselcar1 = new DieselCar(CarBrand.Brand1, d3, "NL03AB");
    DieselCar dieselcar2 = new DieselCar(CarBrand.Brand2, d4, "NL04AB");
    ElectricCar electriccar1 = new ElectricCar(CarBrand.Brand1, d5, "NL05AB");
    ElectricCar electriccar2 = new ElectricCar(CarBrand.Brand2, d6, "NL06AB");

    Customer tadas = new Customer("Tadas");
    Customer ryan = new Customer("Ryan");
    Customer alex = new Customer("Alex");
    Customer steve = new Customer("Steve");

    Trip trip1 = new Trip(20, car1, ryan);
    Trip trip2 = new Trip(5, car2, alex);
    Trip trip3 = new Trip(20, dieselcar1, ryan);
    Trip trip4 = new Trip(100, dieselcar2, steve);
    Trip trip5 = new Trip(100, electriccar1, steve);
    Trip trip6 = new Trip(200, electriccar2, tadas);

    Company co1 = new Company();

    @BeforeEach
    void setUp() {
        co1.addTrip(trip1);
        co1.addTrip(trip2);
        co1.addTrip(trip3);
        co1.addTrip(trip4);
        co1.addTrip(trip5);
        co1.addTrip(trip6);

        trip1.getPriceOfTheTrip();
        trip2.getPriceOfTheTrip();
        trip3.getPriceOfTheTrip();
        trip4.getPriceOfTheTrip();
        trip5.getPriceOfTheTrip();
        trip6.getPriceOfTheTrip();

    }

    @org.junit.jupiter.api.Test
    void getTotalTurnover() {
        assertEquals(295.1, co1.getTotalTurnover());
        System.out.println(co1.getTotalTurnover());
    }

    @org.junit.jupiter.api.Test
    void getAverageDistance() {
        assertEquals(74.16666666666667, co1.getAverageDistance());
        System.out.println(co1.getAverageDistance());
    }

    @org.junit.jupiter.api.Test
    void getLongestTripDistance() {
        assertEquals(200, co1.getLongestTripDistance());
        System.out.println(co1.getLongestTripDistance());
    }

    @org.junit.jupiter.api.Test
    void getMostEarningDriver() {
        assertEquals(6, co1.getMostEarningDriver());
        System.out.println(co1.getMostEarningDriver());
    }
}
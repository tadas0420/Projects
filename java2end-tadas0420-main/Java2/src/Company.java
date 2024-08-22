import java.util.HashSet;

public class Company {
    public HashSet<Trip> trips;

    public Company() {
        this.trips = new HashSet<>();
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public double getTotalTurnover() {
        double totalTurnover = 0;
        for (Trip trip : trips) {
            totalTurnover += trip.getPriceOfTheTrip();
        }

        return totalTurnover;
    }

    public double getAverageDistance() {
        double totalDistance = 0;
        double average = 0;
        for (Trip trip : trips) {
            totalDistance += trip.getDistance();
        }

        average = totalDistance / trips.size();

        return average;
    }

    public double getLongestTripDistance() {
        double longestDistance = 0;
        for (Trip trip : trips) {
            if (longestDistance < trip.getDistance()) longestDistance = trip.getDistance();
        }
        return longestDistance;
    }

    public int getMostEarningDriver() {
        int mostEarningDriverID = 0;
        double tempEarnings = 0;
        for (Trip trip : trips) {
            if (trip.getCar().getDriver().getDriversEarnings() > tempEarnings) {
                mostEarningDriverID = trip.getCar().getDriver().getDriverId();
                tempEarnings = trip.getCar().getDriver().getDriversEarnings();
            }
        }
        return mostEarningDriverID;
    }

}

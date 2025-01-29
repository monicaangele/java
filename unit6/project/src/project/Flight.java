package project;

public class Flight {

    // Instance variables
    private String shuttleName;
    private int missionNumber;
    private String originCity;
    private String originState;
    private int numberOfPassengers;
    private String cargoType;

    // Constructor to initialize all attributes
    public Flight(String shuttleName, int missionNumber, String originCity, String originState, int numberOfPassengers, String cargoType) {
        this.shuttleName = shuttleName;
        this.missionNumber = missionNumber;
        this.originCity = originCity;
        this.originState = originState;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoType = cargoType;
    }

    // Getter and Setter methods for all attributes

    public String getShuttleName() {
        return shuttleName;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public int getMissionNumber() {
        return missionNumber;
    }

    public void setMissionNumber(int missionNumber) {
        this.missionNumber = missionNumber;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    // Method to return a one-line description of the flight
    public String getFlightDescription() {
        return "Shuttle Name: " + shuttleName + "\nMission: " + missionNumber + "\nOrigin: " + originCity + ", " + originState + "\nCargo: " + cargoType + "\nPassengers: " + numberOfPassengers;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Instantiate a Flight object
        Flight flight1 = new Flight("The Bottle Rocket", 547, "Akron", "Ohio", 74, "Candy");

        // Change one attribute using the setter
        flight1.setNumberOfPassengers(80);

        // Print one attribute using the getter
        System.out.println("Number of passengers on Flight 1: " + flight1.getNumberOfPassengers());

        // Print one-line description of the flight
        System.out.println("\nFlight Description:\n" + flight1.getFlightDescription());
    }
}

package Lab8;

class SinglyLinkedListAirportMain {
    public static void main(String[] args) {
        PassengerLinkedList passengerList = new PassengerLinkedList();

        // Test by adding passengers
        passengerList.addPassenger(new Passenger("Alice", 1));
        passengerList.addPassenger(new Passenger("Bob", 2));
        passengerList.addPassenger(new Passenger("Charlie", 3));

        // Display passenger list
        passengerList.displayPassengerList();

        // Adding a passenger at the beginning
        passengerList.addPassengerAtBeginning(new Passenger("David", 4));
        passengerList.displayPassengerList();

        // Removing the last passenger
        passengerList.removeLastPassenger();
        passengerList.displayPassengerList();

        // Search for a passenger by name
        int seatNumber = passengerList.searchPassengerByName("Bob");
        System.out.println("Seat number of Bob: " + seatNumber);
    }
}

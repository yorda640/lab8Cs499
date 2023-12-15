package Lab8;
class Passenger {
    private String name;
    private int seatNumber;

    public Passenger(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String toString() {
        return "Passenger{" + "name='" + name + '\'' + ", seatNumber=" + seatNumber + '}';
    }
}

class Node {
    Passenger passenger;
    Node next;

    public Node(Passenger passenger) {
        this.passenger = passenger;
        this.next = null;
    }
}

class PassengerLinkedList {
    private Node head;

    public void addPassenger(Passenger passenger) {
        Node newNode = new Node(passenger);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addPassengerAtBeginning(Passenger passenger) {
        Node newNode = new Node(passenger);
        newNode.next = head;
        head = newNode;
    }

    public void removeLastPassenger() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public int searchPassengerByName(String passengerName) {
        Node current = head;
        int seatNumber = -1;
        while (current != null) {
            if (current.passenger.getName().equals(passengerName)) {
                seatNumber = current.passenger.getSeatNumber();
                break;
            }
            current = current.next;
        }
        return seatNumber;
    }

    public void displayPassengerList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.passenger);
            current = current.next;
        }
        System.out.println();
    }
}


package Exercise5;

public class DoublyLinkedList {
        private Node head;
        private Node tail;

        private static class Node {
            private Location location;
            private Node next;
            private Node prev;

            public Node(Location location) {
                this.location = location;
                this.next = null;
                this.prev = null;
            }
        }

        public void addLocation(Location location) {
            Node newNode = new Node(location);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void addLocationAtBeginning(Location location) {
            Node newNode = new Node(location);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public Location removeLastLocation() {
            if (tail == null) {
                return null;
            }

            Location removedLocation = tail.location;
            if (tail == head) {
                tail = null;
                head = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return removedLocation;
        }

        public Location searchLocationByName(String locationName) {
            Node current = head;
            while (current != null) {
                if (current.location.getName().equals(locationName)) {
                    return current.location;
                }
                current = current.next;
            }
            return null;
        }

        public void displayLocationListForward() {
            Node current = head;
            while (current != null) {
                System.out.println("Name: " + current.location.getName() + ", Latitude: " + current.location.getLatitude() + ", Longitude: " + current.location.getLongitude());
                current = current.next;
            }
        }

        public void displayLocationListBackward() {
            Node current = tail;
            while (current != null) {
                System.out.println("Name: " + current.location.getName() + ", Latitude: " + current.location.getLatitude() + ", Longitude: " + current.location.getLongitude());
                current = current.prev;
            }
        }
    }


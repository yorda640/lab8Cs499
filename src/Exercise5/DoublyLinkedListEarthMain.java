package Exercise5;

public class DoublyLinkedListEarthMain {

        public static void main(String[] args) {
            DoublyLinkedList locationList = new DoublyLinkedList();
            locationList.addLocation(new Location("Statue of Liberty", 40.6892, -74.0445));
            locationList.addLocation(new Location("Eiffel Tower", 48.8588, 2.2944));
            locationList.addLocation(new Location("Great Wall of China", 40.4319, 116.5704));

            System.out.println("Location list Forward:");
            locationList.displayLocationListForward();

            System.out.println("\nLocation List Backward:");
            locationList.displayLocationListBackward();

            locationList.addLocationAtBeginning(new Location("Sydney Opera House", -33.8568, 151.2153));
            locationList.removeLastLocation();

            System.out.println("\nUpdated Location list forward:");
            locationList.displayLocationListForward();

            System.out.println("\nUpdated Location List Backward:");
            locationList.displayLocationListBackward();

            Location foundLocation = locationList.searchLocationByName("Eiffel Tower");
            System.out.println("\nDetails of Eiffel Tower: " + (foundLocation != null ? foundLocation.getName() + ", Latitude: " + foundLocation.getLatitude() + ", Longitude: " + foundLocation.getLongitude() : "Not found"));

        }
    }

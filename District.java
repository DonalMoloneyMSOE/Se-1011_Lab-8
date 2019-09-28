/*
 * SE1011 - 011
 * Winter 2015
 * Lab 8 - Parking Lot
 * Name: Donal Moloney
 * Created: 2/7/2017
 */
package Moloneyda.lab8.parking;

/*
   This public class tracks data from the parking lot for the district
 */

public class District {
    private ParkingLot lot1;
    private ParkingLot lot2;
    private ParkingLot lot3;
    private int sumTimeClosed;


    /**
     * Set up a district with three parking lots.
     *
     * @param color1    Lot 1 identification color
     * @param capacity1 Maximum number of vehicles for lot 1
     * @param color2    Lot 2 identification color
     * @param capacity2 Maximum number of vehicles for lot 2
     * @param color3    Lot 3 identification color
     * @param capacity3 Maximum number of vehicles for lot 3
     */
    public District(String color1, int capacity1,
                    String color2, int capacity2,
                    String color3, int capacity3) {
        lot1 = new ParkingLot(color1, capacity1);
        lot2 = new ParkingLot(color2, capacity2);
        lot3 = new ParkingLot(color3, capacity3);
    }

    /**
     * Display status information for all three lots.
     * See ParkingLot.displayStatus for the format for each.
     */
    public void displayStatus() {
        lot1.displayStatus();
        lot2.displayStatus();
        lot3.displayStatus();
    }

    /**
     * Record a vehicle entering a given lot at a given time.
     *
     * @param lotNumber Number of lot, 1-3
     * @param time      Entry time in minutes since all lots were opened.
     *                  This calls ParkingLot.markVehicleEntry for the lot corresponding
     *                  to lotNumber (1 -> lot1, 2 -> lot2, 3 -> lot3).
     *                  If lotNumber is out of range, the behavior is unspecified.
     */
    public void markVehicleEntry(int lotNumber, int time) {
        if(lotNumber == 1){
            lot1.markVehicleEntry(time);
        }else if(lotNumber == 2){
            lot2.markVehicleEntry(time);
        }else if(lotNumber == 3){
            lot3.markVehicleEntry(time);
        }else{
            System.out.println(" The range is unspecified");
        }
    }

    /**
     * Record a vehicle exiting a given lot at a given time.
     *
     * @param lotNumber Number of lot, 1-3
     * @param time      Entry time in minutes since all lots were opened.
     *                  This calls ParkingLot.markVehicleExit for the lot corresponding
     *                  to lotNumber (1 -> lot1, 2 -> lot2, 3 -> lot3).
     *                  If lotNumber is out of range, the behavior is unspecified.
     */
    public void markVehicleExit(int lotNumber, int time) {
        if(lotNumber == 1){
            lot1.markVehicleExit(time);
        }else if(lotNumber == 2){
            lot2.markVehicleExit(time);
        }else if(lotNumber == 3){
            lot3.markVehicleExit(time);
        }else{
            System.out.print("The behavior is unspecified");
        }

    }

    /**
     * Checks the status of all three lots in the district and
     * returns true if they are all closed and false otherwise.
     *
     * @return whether all lots are closed in the district
     */
    public boolean isClosed() {
        if(lot1.isClosed() && lot2.isClosed() && lot3.isClosed()) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Computes the time all lots were reported as closed.
     *
     * @return number of minutes all three lots were closed
     */
    public int closedMinutes() {
        sumTimeClosed = lot1.closedMinutes() + lot2.closedMinutes() + lot3.closedMinutes();
        return sumTimeClosed;
    }
}

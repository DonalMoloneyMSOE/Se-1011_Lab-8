# Se-1011_Lab-8 from Winter 2015


Overview

This lab will give you a taste of what it is like to work on a larger project involving other people. You will use a couple of UML diagrams and other documentation to guide implementing two classes.
Assignment

You have been hired to implement an API for a number of parking lots in a district. Someone else is developing hardware to detect when vehicles enter or leave each lot, and you are writing classes that will be used by the hardware to measure lot usage. In particular, you are writing two classes: ParkingLot to track the number of vehicles in an individual lot, and District to track the lots in the parking district.

A design team has specified the API. This API is partially documented in the following class diagram. You will implement a class ParkingLot consistent with this diagram. You can add attributes and private methods, but you must implement the methods (with the specified parameters) as shown. The key operations are markVehicleEntry and markVehicleExit which are called when vehicles enter or exit a lot. These take a time parameter which is the number of minutes since the lot opened. The design team has also written part of District.java with stubs for the portions that you need to write. Again, you may add private attributes and methods as required, but you must stay consistent with the diagram.

Additional Notes on ParkingLot

    It is expected that time never goes backwards. If markVehicleEntry or markVehicleExit is called with a time that is before some other call, assume the sensor glitched and ignore the event.
    The method vehiclesInLot returns the number of vehicles in the lot at any one time.
    The method isFull returns whether or not a lot is "full" in the sense that the number of vehicles in it is 80% of the capacity. At this point drivers might prefer to find a different parking lot than to circle the lot looking for an empty space, and the attendent would put out a sign saying the lot is full. Create a class constant FULL_THRESHOLD for this threshold and use it in your code so that if the organization were to raise it to a higher value it would be easy to change the system to use the new value.
    The method fullMinutes returns the number of minutes during which the lot is "full" (as defined above). You can assume this method will never be called while the lot is full; that is, enough vehicles will have exited that the attendant has reopened the lot to new drivers.
    The method displayStatus gives the name of the lot and the percentage of the lot that is occupied. If the percentage is at or above the threshold, display "FULL". When displaying a number, display just one digit after the decimal place, rounding appropriately. See the sample output below for details.

Additional Notes on District
An initial version of District.java is being given to you. At a minimum, you will need to write code at all of the locations marked by "DO:".

    The method displayStatus has been written for you to call displayStatus on each parking lot.
    The methods markVehicleEntry and markVehicleExit take an additional parameter in District, the parking lot which the vehicle is entering or exiting.
    The method isFull for District returns true if and only if all of the parking lots are full.
    The method fullMinutes returns the number of minutes that all of the parking lots are full. This information would be used to help decide increase the parking lots.

Testing

Following best practices, another software developer has written a ParkingDriver class to test your code. One of the tests has been documented by a sequence diagram below. Note the general pattern: a message is sent to ourTown, and this generates messages to one or all of the parking lots.

Creating the Project

Do the following to set up your IntelliJ project:

    Download the file lab8.zip and save it in a convenient location on your computer. (Depending on your browser, you may need to do a right click to save the file.)
    Extract all files from lab8.zip into a lab8 folder.
    Start IntelliJ and select File > Open... Browse to the folder that contains lab8.iml (which should be a folder with the IntelliJ icon on it) and click on OK.

You can now browse the source files. Both District and ParkingDriver will contain a number of error messages because you have not yet written the methods for ParkingLot. The starting point for the lab is to add the appropriate stubs to ParkingLot so that the code does compile.

If you are the sort of person that likes to drive down the road while texting and smoking a cigarette, you will now try to write all of the code in one big batch. A reasonable alternative is to edit ParkingDriver.main() and comment out everything but the call to testSmallLot(). Get this part working before attempting to test the rest of the system.
Sample Output

The output from running the final version will be as follows. Note that obtaining this output does not automatically mean your solution is working - you need to satisfy all requirements above - but it certainly is a great step in the right direction. Also note that having small differences in the results for the "heavier usage" test may also be acceptable; there can be slight differences in computations that can give you different final numbers. In the end, whether or not your solution is correct is something you must decide for yourself; tests alone cannot tell you when you are done.

blacktop parking lot status: FULL
Tiny district:
red parking lot status: FULL
green parking lot status: 0%
blue parking lot status: FULL
Lots were full for 3 min. in tiny district.

Testing ParkingLot
test parking lot status: 75%
test parking lot status: FULL
test parking lot status: 50%
test parking lot status: 0%

Airport at time 7:
brown parking lot status: 70%
green parking lot status: FULL
black parking lot status: 58.3%

Airport at time 8:
brown parking lot status: FULL
green parking lot status: FULL
black parking lot status: 58.3%

Airport at time 10:
brown parking lot status: FULL
green parking lot status: FULL
black parking lot status: FULL

Testing heavier usage.
At end of day, all lots full 42 min.
pink parking lot status: 68%
blue parking lot status: FULL
gray parking lot status: 20%

All tests finished.

Lab Deliverables
See your professor's instructions for details on submission guidelines and due dates.
Dr. Hasker's submission instructions
Dr. Taylor's class: See below
See Dr. Thomas for instructions
See Prof. Ung for instructions
Dr. Yoder's submission instructions
If you have any questions, consult your instructor.
Acknowledgement

This laboratory assignment was developed by Dr. Rob Hasker.

Monday, 08-Dec-2014 11:59:20 CST 

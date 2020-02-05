public class Vehicle {


    int costPerDay;
    double milesPerGallon;
    String locationID;
    boolean rented;
    //String customer;

    /*****************************************************************************************************
     * This constructor set all customer information to null
     ****************************************************************************************************/

    public Vehicle(){
        String name = null;
        String address = null;
        String phonenum = null;
    }

    /*****************************************************************************************************
     * This method returns the Customer information
     * @return String name, String address, String phonenumber
     ****************************************************************************************************/

    public String Customer(String name, String address, String phonenumber){

        return ("Name: " + name + "\n"+"Address: " + address + "\n"+"Phone Number: "+ phonenumber);
    }

    interface Move
    {
        //final int id = 10;
        String drive();

    }

    public void move(){

    }

    /*****************************************************************************************************
     * Getter method for double milesPerGallon
     * @return double milesPerGallon
     ****************************************************************************************************/

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    /*****************************************************************************************************
     * Setter method for double milesPerGallon
     ****************************************************************************************************/

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    /*****************************************************************************************************
     * Getter method String locationID
     * @return String locationID
     ****************************************************************************************************/

    public String getLocationID() {
        return locationID;
    }

    /*****************************************************************************************************
     * Setter method String locationID
     ****************************************************************************************************/

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    /*****************************************************************************************************
     * Getter method boolean rented
     * @return boolean rented
     ****************************************************************************************************/

    public boolean isRented() {
        return rented;
    }

    /*****************************************************************************************************
     * Setter method boolean rented
     ****************************************************************************************************/

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    /*****************************************************************************************************
     * Getter method int costPerDay
     * @return int costPerDay
     ****************************************************************************************************/

    public int getCostPerDay() {
        return costPerDay;
    }

    /*****************************************************************************************************
     * Setter method int costPerDay
     ****************************************************************************************************/

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }


}

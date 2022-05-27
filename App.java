class App {
  public static void main(String args[]){
    int vehicleIdentificationNumber = 1234567;
    String vehicleColor = "Pink";
    String vehicleMake = "Cadillac";
    String vehicleModel = "Escalade";
    boolean towingPackage = true;
    int odometerReading = 10_124;
    double price = 45_009.99;
    String qualityRating  = "C";
    String newLine = System.getProperty("line.separator");

    System.out.println(" VIN: " + vehicleIdentificationNumber + newLine +
    " Color: " + vehicleColor + newLine +
    " Make: " + vehicleMake + newLine +
    " Model: " + vehicleModel + newLine +
    " Towing Package Included? " + towingPackage + newLine +
    " Current Odometer Reading: " + odometerReading + newLine +
    " Unit Price: " + price + newLine +
    " Unit Quality Rating: " + qualityRating);
  }
}

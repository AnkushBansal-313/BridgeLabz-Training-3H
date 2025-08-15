public class chennaiToBangaloreTravel {
    public static void main(String[] args) {   
        double distanceChennaiToVellore = 156.6;
        double distanceVelloreToBangalore = 211.8;   
        int hoursChennaiToVellore = 4;
        int minutesChennaiToVellore = 4;      
        int hoursVelloreToBangalore = 4;
        int minutesVelloreToBangalore = 25;        
        double totalDistance = distanceChennaiToVellore + distanceVelloreToBangalore;        
        int totalMinutes = (hoursChennaiToVellore * 60 + minutesChennaiToVellore) +
                           (hoursVelloreToBangalore * 60 + minutesVelloreToBangalore);      
        int totalHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;      
        System.out.println("Travel from Chennai to Bangalore via Vellore");
        System.out.println("Total Distance : " + totalDistance + " km");
        System.out.println("Total Time     : " + totalHours + " Hours " + remainingMinutes + " Minutes");
    }
}
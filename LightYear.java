public class LightYear {
    public static void main(String [] args) {
        double lightSpeed = 3e5;
        int year = 365 * 24 * 60 * 60;
        var lightYear = lightSpeed * year;
        // int lightYear1 = lightSpeed * year;
        double lightYear2 = lightSpeed * year;

        System.out.println(lightYear);
        System.out.println(lightYear2);
    }
    
}

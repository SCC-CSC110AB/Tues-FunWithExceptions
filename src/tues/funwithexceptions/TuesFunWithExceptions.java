package tues.funwithexceptions;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class TuesFunWithExceptions {
    
    public static final double MIN_CELSIUS_VALUE = -30;
    public static final double MAX_CELSIUS_VALUE = 50;
    public static final double MIN_FAHRENHEIT_VALUE = -30;
    public static final double MAX_FAHRENHEIT_VALUE = 120;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperatureValue;
        String temperatureUnit;
        boolean isUserInputValid = false;
        Scanner stdin = new Scanner(System.in);
        
        do {
            System.out.println(
                "Please enter in a temperature (e.x.: 80 F, 21 c)"
            );
            
            try {
                temperatureValue = stdin.nextDouble();
                temperatureUnit = stdin.nextLine();
                temperatureUnit = temperatureUnit.trim();
                
                if (temperatureUnit.equalsIgnoreCase("c")) {
                    if (temperatureValue >= MIN_CELSIUS_VALUE 
                        && temperatureValue <= MAX_CELSIUS_VALUE){
                        isUserInputValid = true;
                    } else {
                        System.out.println(
                            "Temperature is outside of valid range."
                        );
                    }
                } else if (temperatureUnit.equalsIgnoreCase("f")) {
                    if (temperatureValue >= MIN_FAHRENHEIT_VALUE
                        && temperatureValue <= MAX_FAHRENHEIT_VALUE){
                        isUserInputValid = true;
                    } else {
                        System.out.println(
                            "Temperature is outside of valid range."
                        );
                    }
                } else {
                    System.out.println("Invalid temperature unit.");
                }
            } catch (Exception error) {
                System.out.println(
                    "Everything is just wrong with whatever the hell you "
                    + "just said"
                );
                stdin.nextLine();
            }
        } while(!isUserInputValid);
    }
    
}

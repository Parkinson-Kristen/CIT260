package temperature;

import java.util.Scanner;

/**
 *Prompt user to enter in a temperature in degrees Celsius.  Convert this
 * temperature to degrees Fahrenheit and output the result.
 * @author Kristen Parkinson
 */
public class Temperature {

    public static void main(String[] args) {
        // create an input file for the console
        Scanner input = new Scanner(System.in);
        
	// prompt to enter temperature in Celsius
	System.out.println("\nEnter the degree in Celsius: ");
        
        //get the value entered for the Celsius
        double celsiusTemp = input.nextDouble();
        
       // convert the temperature to Fahrenheit
	double fahrenheitTemp = (9.0/5.0) * celsiusTemp + 32;
        
        //output result
        System.out.println(celsiusTemp + " C is " + fahrenheitTemp + " F");
    }
}
  

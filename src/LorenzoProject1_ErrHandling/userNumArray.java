/**
******************************************************
***  Class Name: userNumArray.
***  Class Author:  Chris Lorenzo
******************************************************
*** This class allows the user to enter ten numbers
*** to find the Mean and Standard Deviation of the set.
*** It controls the methods to call exceptions and other
*** class methods to process the calculations.
* 
*   Class Inputs:
*   — One int[] array parameter.
*   Return Value:
*   — Number Set Mean and Std Deviation via methods 
*     CalcMean(), CalcStdDeviation()
* 
******************************************************
*** Date: 4 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package LorenzoProject1_ErrHandling;

/**
 *
 * @author Chris
 */
public class userNumArray{
    private final int arrayBound = 10;              //Sets bounds for Array.  Must be changed if app input limit changes
    public int[] array = new int[arrayBound];       //Create array to copy values from inputArray
    private double sqTotal = 0.0;                   //Var to hold accumulated square total to get Std D.
    private double mean = 0.0;                      //Var to hold mean of all inputed numbers
    private double variance = 0.0;                  //Var to calculated variance value of numbers
    private double deviation = 0.0;                 //var to hold calculated standard deviation
    
        //Class constructor method. Copys values from param
        //value array to class array.
        public userNumArray(int[] inArray)
                {
                    for(int i=0; i < arrayBound;i++)
                        {
                            array[i] = inArray[i];
                        }
                }
        
        //Cycles through the array values, accumulates total of
        //all values and returns the average
        
        public double CalcMean()
        {
            double total = 0;

            for(int i=0; i < arrayBound;i++) 
            {
                total += this.array[i];    
            }
                mean = (total / arrayBound);
                return mean;
        }

        //Subtracts the mean from each of the original values, 
        //squares the results, and accumulates the results in the sqTotal var.
        //sqTotal var is divided by N-1 to get the variance and the
        //square root of the variance is the standard deviation with the method
        //returns to the calling function.
        
        public String CalcStdDeviation()
        {
            for(int i=0; i < arrayBound;i++) 
            {
                sqTotal += Math.pow((this.array[i] - this.mean),2);    
            }
            variance = (sqTotal / (arrayBound-1));
            deviation = Math.sqrt(this.variance);
            return String.format("%,.2f", this.deviation);  
        }

}

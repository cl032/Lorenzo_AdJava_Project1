/**
******************************************************
***  Class Name: NaNorNullException.
***  Class Author:  Chris Lorenzo
******************************************************
*** This custom exception class extends the NumberFormatException
*** subclass and is used in the btnEnterActionPerformed and 
*** txtInputBxKeyPressed methods to catch exceptions involving
*** null and Non-Integer input values.
* 
*   Class Inputs:
*   — None, or One String Parameter for store in message
*     property.
*   Return Value:
*   — Inherited values via methods i.e. getMessage(), getStackTrace()
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
public class NaNorNullException extends NumberFormatException {
    
    //Constructor with one param value do hold custom error msg.
    public NaNorNullException(String msg)
    {
        super(msg); 
    }

    //Generic constructor
    public NaNorNullException()
    {
        
    }
    
}

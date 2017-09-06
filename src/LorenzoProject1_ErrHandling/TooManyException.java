/**
******************************************************
***  Class Name: TooManyException.
***  Class Author:  Chris Lorenzo
******************************************************
*** This custom exception class extends the ArrayIndexOutOfBoundsException
*** subclass and is used in the btnEnterActionPerformed and 
*** txtInputBxKeyPressed methods to catch exceptions involving
*** inputs that exceed the array bounds.
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
public class TooManyException extends ArrayIndexOutOfBoundsException {
    
    //Constructor with one param value do hold custom error msg.
    public TooManyException(String message)
    {
        super(message);
    }
    
    //Generic constructor
    public TooManyException()
    {
        
    }
    
    
    
}

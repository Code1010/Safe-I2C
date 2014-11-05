/* 

    This class interacts with the Gyroscope component of the GY-85
        It is safe to assume that this class will not get called when there
        is already a transation taking place.
    
    This class returns raw vaules for Yaw, pitch and roll. An interpreter
        class will be created later to turn the garbage that this class returns 
        into nice numbers

What nice comments! If only the compiler could read them, it could see how
wonderful they are!
*/
package cody.deviltech.safei2c.wholeshabang;

import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;


/**
 *
 * @author Cody
 */
public class Gyroscope {
    
    private I2C gWrite, gRead;
    
    public Gyroscope(){
        
        gWrite = new I2C(DigitalModule.getInstance(1), 0xD1);
        gRead = new I2C(DigitalModule.getInstance(1), 0xD0);
        
    }
    
    public void setupGyro(){
        
        gWrite.write(21, 9);
        gWrite.write(22, 0x1b);
        gWrite.write(62, 0x33);
        
    }
    
    public void readGyro(){
        
        
        
    }
    
}

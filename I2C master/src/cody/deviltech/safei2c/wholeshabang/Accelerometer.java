/*

    This class is used to interact with the Accelerometer component of
        the GY-85 sensor.
    
    This class will return some gobbleygook that can be turned into
        Acceleration in meters per second squared later by a handy dandy 
        translator class later. 


*/
package cody.deviltech.safei2c.wholeshabang;

import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;

/**
 *
 * @author Cody
 */
public class Accelerometer {
    
    private I2C aRead, aWrite;
    
    public Accelerometer(){
        
        aRead = new I2C(DigitalModule.getInstance(1), 0xA6);
        aWrite = new I2C(DigitalModule.getInstance(1), 0xA6);
        
    }
    
    public void setupAccelerometer(){
        
        aWrite.write(0x2C, 0x0A); //100 Hz
        aWrite.write(0x2D, 0x08); //Measure mode
        aWrite.write(0x31, 0x00); //10bit, sign EXT, 2G
        
        //add more stuff that translates accelerometer gobbleygook into actual values
    }
    
}

/*

    This class is made to interact with the compass component of the GY-85

    It will return some crap about direction that is almost useless in its raw
    form, until it is converted by the fantastic conversion class that I have
    yet to make.

*/
package cody.deviltech.safei2c.wholeshabang;

import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;

/**
 *
 * @author Cody
 */
public class Compass {
    
    private I2C cRead, cWrite;
    
    public Compass(){
    
        cRead = new I2C(DigitalModule.getInstance(1), 0x3D);
        cWrite = new I2C(DigitalModule.getInstance(1), 0x3C);
        
    }
    
    public void setupCompass(){ //NEVER CALL ANYTHING IN THIS CLASS UNLESS YOU WANT
                                    //TO DIE!
        cWrite.write(0, 0x74); //75 Hz
        cWrite.write(1, 0x40); //1.9 Ga
        cWrite.write(2, 0); //continuous mode
        
    }

    public void readCompass(){
        
        //read things
        
    }
    
}

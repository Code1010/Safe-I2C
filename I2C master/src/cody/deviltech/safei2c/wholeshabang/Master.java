/*

    This class controls the whole transaction operation. The idea is to
        prevent the robot from hanging up during transactions

    This class depends on the other classes in this package, so make sure
        you get the whole package
    
    The purpose is to interface with the sensor only if there are no transactions
        taking place

*/
package cody.deviltech.safei2c.wholeshabang;

/**
 *
 * @author Cody
 * 
 */
public class Master {
    
    //getting the other classes 
    Accelerometer accel;
    Gyroscope gyro;
    Compass comp;
    public boolean clear = true;

    
    public Master(){
        
        accel = new Accelerometer();
        gyro = new Gyroscope();
        comp = new Compass();
        clear = true;
        
    }
    
    public boolean checkClear(){
        
        if(clear){
            return true;
        } else {
            return false;
        }
        
    }
    
    //start a new thread?
    
    public void readGyro(){
        if(checkClear()){
           clear = false; 
            //proceed with reading
            clear = true;
        }
        
    }
    
    public void setupGyro(){
        if(checkClear()){
           clear = false; 
            //proceed with reading
            clear = true;
        }
        
    }
    
    public void readCompass(){
        if(checkClear()){
           clear = false; 
            comp.readCompass();
            clear = true;
        }
        
    }
    
    public void setupCompass(){
        if(checkClear()){
           clear = false; 
            comp.setupCompass();
            clear = true;
        }
        
    }
    
    public void readAccelerometer(){
        if(checkClear()){
           clear = false; 
            accel.readAccel();
            clear = true;
        }
        
    }
    
    public void setupAccelerometer(){
        if(checkClear()){
           clear = false; 
            accel.setupAccelerometer();
            clear = true;
        }
        
    }    
}
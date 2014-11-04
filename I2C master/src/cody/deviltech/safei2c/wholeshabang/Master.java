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
    Communications comm; //communicationizing
    
    //devices
    public final String ACCEL = "a";
    public final String GYRO = "g";
    public final String COMP = "c";
    
    public Master(){
        
        accel = new Accelerometer();
        gyro = new Gyroscope();
        comp = new Compass();
        comm = new Communications();
        
    }
    
    
    
    //start a new thread?
    
    
    
    public boolean transaction(){
        
        //if there is an active transaction, return true
        return true;
        
    }
    
    public void start(String device){
        
        //start a new transaction only if the bus is clear!
        if(device.equals("a")){ //accelerometer
            
            
        } else if(device.equals("c")){ //compass
            
            
        } else if(device.equals("g")){ //gyroscope
            
            
        }
        
    }
    
    public void end(){
        
        
                
    } 
    
}

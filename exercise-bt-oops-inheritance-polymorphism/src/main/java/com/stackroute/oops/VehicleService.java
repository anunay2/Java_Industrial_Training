package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {

        Car c1=new Car(name,modelName,type);
        return c1;

    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {

        Bike b1=new Bike(name,modelName,type);
        return b1;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second){

        if(first.getType()=="sports" && second.getType()=="sports"){
            int max1= first.maxSpeed("sports");
            int max2=second.maxSpeed("sports");
            if(max1==max2){
                return 0;
            }
            else if(max1>max2){
                return max1;
            }
            else{
                return max2;
            }
        }
        return -1;
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
    }
}

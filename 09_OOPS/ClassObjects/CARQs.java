/*
WAP: Car Rental
Date: 10-Mar-2026
*/

package ClassObjects;

public class CARQs {
    public static void main(String[] args){
        CarRental car = new CarRental();
        car.getCar(88, "Suv");
        car.showCar();
    }
}

class CarRental{
    int carId;
    String carName;
    double carRent;

    void getCar(int cid, String n){
        carId = cid;
        carName = n;
        carRent = getRent();
    }

    int getRent(){
        if(carName == "Small"){
            return 1000;
        }else if(carName == "Van"){
            return 800;
        }else if(carName == "Suv"){
            return 250;
        }else{
            return 0;
        }
    }

    void showCar(){
        System.out.println("Car Id: "+carId);
        System.out.println("Car Type: "+carName);
        System.out.println("Car Rent: "+carRent);
    }
}

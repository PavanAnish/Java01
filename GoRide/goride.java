
import java.util.Scanner;

abstract class Ride {

	int distance;
	
	Ride(int distance){
		this.distance=distance;
	}
	//System.out.println("Kilometer:"+distance);
	
	abstract void calculateFare(int distance);
	
}
	
	
class Bike extends Ride {
    Bike(int distance){
		super(distance);
	}	
	void calculateFare(int distance){
        System.out.println("Fare:"+distance*5);
    }
}

class Car extends Ride {
    Car(int distance){
		super(distance);
	}	
	void calculateFare(int distance) {
        System.out.println("Fare:"+ distance*10);
    }

}
class LuxuryVan extends Ride {
    
	LuxuryVan(int distance){
		super(distance);
	}
	
	void calculateFare(int distance) {
        System.out.println("Fare:"+distance*20);
    }
}

public class GoRide {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the total kilometer:");
		int distance=sc.nextInt();
		System.out.println("Enter The Type Of Vehicle(1.Bike,2.Car,3.Van)");
		int choice=sc.nextInt();
		
	switch (choice) {
    case 1: {
        Bike obj = new Bike(distance);
        obj.calculateFare(distance);
        break;
    }
    case 2: {
        Car obj = new Car(distance);
        obj.calculateFare(distance);
        break;
    }
    case 3: {
        LuxuryVan obj = new LuxuryVan(distance);
        obj.calculateFare(distance);
        break;
    }
    case 4: {
        Bike obj = new Bike(distance);
        obj.calculateFare(distance);
        break;
    }
    default:
        break;
	}
    }
}



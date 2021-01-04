package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Tour Tour_A=new Tour();
	City fromCity= new City(17,6);
	//City Dijon =new City (5,1);
	
	Tour_A.setCity(0,fromCity);
	
	@Test
	 public void getDistance_E_3() {
		if (distance == 0) {
            int tourDistance = 0;
            // Loop through our tour's cities
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++) {
                // Get city we're travelling from
                City fromCity = getCity(cityIndex);
                // City we're travelling to
                City destinationCity;
                // Check we're not on our tour's last city, if we are set our
                // tour's final destination city to our starting city
                if(cityIndex+1 < tourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }
                // Get the distance between the two cities
                tourDistance += fromCity.distanceTo(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }
		
	}

}

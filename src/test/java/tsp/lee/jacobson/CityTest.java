package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	
	/*GIVEN City=DIJON
	 * WHEN X=5, y=1
	 * THEN DISTANCE=13
	 */
	City REF= new City(17,6);
	//City REF= new City();
	City Dijon =new City (5,1);
	@Test
	public void distanceTo_Dijon_13() {
		int xDistance = Math.abs(REF.getX() - Dijon.getX());
        int yDistance = Math.abs(REF.getY() - Dijon.getY());
        double expected = 13;
        
        double actual = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        assertEquals(expected,actual,8);
		
	}

}

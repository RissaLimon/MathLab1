import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquarePerimeter {

	@Test
	public void test() {
		assertEquals(8,Geometry.squarePerimeter(2),0);}
	
	@Test
	public void pentagon(){
	assertEquals(15,Geometry.pentagonPerimeter(3),0);
	assertEquals(5.5,Geometry.pentagonPerimeter(1.1),0);}
	
	@Test
	public void hexagon(){
	assertEquals(18,Geometry.hexagonPerimeter(3),0);
	assertEquals(6.6,Geometry.hexagonPerimeter(1.1),0);}
	
	@Test
	public void octagon(){
	assertEquals(24,Geometry.octagonPerimeter(3),0);
	assertEquals(8.8,Geometry.octagonPerimeter(1.1),0);}
	
	
	@Test
	public void rectangle() {
		assertEquals(27,Geometry.rectanglePerimeter(3, 9),0);
		assertEquals(6.4,Geometry.rectanglePerimeter(2.1, 1.1),0);}
	
	@Test
	public void curcumfrence() {
	assertEquals(Math.PI * 9,Geometry.circumference(3),0);}
	
	
}

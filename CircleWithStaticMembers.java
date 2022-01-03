package µÚ¾ÅÕÂ;

public class CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects=0;
	
	 
	CircleWithStaticMembers(){
		radius=1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}

}
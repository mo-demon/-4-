package µÚ¾ÅÕÂ;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWithStaticMembers myCircle=new CircleWithStaticMembers();
		System.out.println("The area of the circle of radius "
		+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		
		System.out.println("The area of the circle of radius "
				+" is "+myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+CircleWithStaticMembers.getNumberOfObjects());
		
		
	}

}
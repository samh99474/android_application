package test_p17;

public class test_p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[];
		cars = new Car[2];
		
		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);
		
		cars[1] = new RacingCar();
		cars[1].setCar(4567, 30.5);
		
		for (int i=0;i<cars.length;i++)
		{
			cars[i].show();
		}
		
	}

}
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}

	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的編號為"+course);
		System.out.println("車號為"+num);    //子類別可以存取父類別的protected
		System.out.println("汽油量為"+gas);
	}
}
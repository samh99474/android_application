package test_p9;



public class test_p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar raccar1;
		raccar1 = new RacingCar();
		
		raccar1.newshow();
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
	public void newshow()
	{
		System.out.println("賽車的編號為"+course);
		System.out.println("車號為"+num);    //子類別可以存取父類別的protected
		System.out.println("汽油量為"+gas);
	}
}
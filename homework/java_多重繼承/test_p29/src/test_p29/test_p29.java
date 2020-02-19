package test_p29;

public class test_p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle[] vc = new Vehicle[2];
		
		//vc[0].setSpeed(120);
		
		vc[0] = new Car(1234,20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for (int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();  //抽象方法
}
class Car extends Vehicle //延伸抽象類別
{
	protected int num;
	protected double gas;
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號設為"+num+",汽油量設為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("速度為"+speed);
	}
}
class Plane extends Vehicle
{
	protected int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次為"+flight);
		System.out.println("速度為"+speed);
	}
}
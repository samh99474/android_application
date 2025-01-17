package test_p38;


public class test_p38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234,20.5);
		
		vc[1] = new Plane(232);
		
		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}
}
interface Vehicle
{
	int weight = 1000; //欄位一定要初始化常數
	void show(); //interface裡的方法必為抽象方法
				 //抽象方法可以被其他類別擴充的特性
}
class Car implements Vehicle //延伸抽象類別
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
	}
}
class Plane implements Vehicle
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
	}
}
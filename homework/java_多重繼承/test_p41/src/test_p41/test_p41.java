package test_p41;


public class test_p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(1234,20.5);
		car1.vshow();
		car1.mshow();
	}

}
interface iVehicle
{
	void vshow(); //interface裡的方法必為抽象方法
				 //抽象方法可以被其他類別擴充的特性
}
interface iMatreial
{
	void mshow();
}
class Car implements iVehicle,iMatreial//延伸抽象類別
{
	protected int num;
	protected double gas;
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號設為"+num+",汽油量設為"+gas+"的車子");
	}
	public void vshow()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
	public void mshow()
	{
		System.out.println("車號的材質是鐵");
	}
}

package test_p17;


public class test_p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//給car1變數建立物件
		car1.setNumGas(1234, 20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("調查樣品車得知");
		System.out.println("車號為:"+number+"汽油量為:"+gasoline);
	}

}
class Car
{
	//Car 類別
	int num;
	double gas;
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return this.gas;
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號重設為:"+num+"汽油量重設為:"+gas);
	}
	
}

public class Sample6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("1號車");
		
		Thread th1 = new Thread();
		th1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行處裡main()的處裡工作");
		}
		car1.run();
	}

}
class Car implements Runnable{
	private String name;
	
	public Car(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+ name + "的處裡");
		}
		
	}

}
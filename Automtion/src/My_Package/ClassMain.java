package My_Package;

public class ClassMain {
	public static void main(String[] args) {
		Operation1 o1 = new Operation1();
		Thread t1 = new Thread(o1);
		t1.setName("Thread1");
		t1.start();
		Operation1 n = new Operation1();
		Thread t2 = new Thread(n);
		t2.setName("Thread2");
		t2.start();
	}
}
class Operation1 implements Runnable{
	public void run()
	{
		Thread ref = Thread.currentThread();
		String name = ref.getName();
		for (int i = 1; i<11; i++)
		{
			System.out.println(name+ "-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*class New implements Runnable{
	public void run() {
		int result = 0;
		result = 10 / 2 ;
		System.out.println("Result is : " +result);
	}
}*/

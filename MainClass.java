
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("My thread started");
		ThreadClass tc = new ThreadClass();
		Thread tChild = new Thread(tc);
		tChild.setPriority(Thread.MAX_PRIORITY);
		tChild.start();
		while(tChild.isAlive())
			System.out.println("Main thread is alive till the child thread is live");
		
	}

}

import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count test:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count test: 12" + counter.getCount()));
		
		counter.decrement();
		
		System.out.println("Count test:" + counter.getCount());
		
	}

}

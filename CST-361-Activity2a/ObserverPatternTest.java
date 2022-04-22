
public class ObserverPatternTest
{
	public static void main(String args[])
	{
		Subject subject = new Subject();

		new StringObserver(subject);
		new OctalObservers(subject);

		System.out.println("State change: 45");
		subject.setState(45);
		System.out.println("State change: 150");
		subject.setState(150);
	}
} 

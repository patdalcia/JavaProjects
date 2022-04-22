public class OctalObservers extends Observer
{
	public OctalObservers(Subject subject)
	{
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		System.out.println("Octal value: " + Integer.toOctalString(subject.getState()));
	}
} 

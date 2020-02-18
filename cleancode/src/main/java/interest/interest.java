package interest;

public class interest {
	public double comp_interest(double principal,double rate,double time)
	{
		double interest;
		interest=principal*Math.pow((1+rate/100),time);
		return interest;
	}
	public double simple_interest(double principal,double rate,double time)
	{
		double interest;
		interest=(principal*rate*time/100);
		return interest;
	}
}
s
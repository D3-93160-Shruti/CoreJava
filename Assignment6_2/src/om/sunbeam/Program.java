package om.sunbeam;

class NegativeDiameterException extends Exception
{
	public NegativeDiameterException(String message) {
		super(message);
	}
}
public class Program {
	private int myX;
	private int myY;
	private double Diameter;
//constructor
	public Program() {
		this.myX=0;
		this.myY=0;
		this.Diameter=100;
	}
	public Program(int myX, int myY, double diameter) throws NegativeDiameterException {
		this.myX = myX;
		this.myY = myY;
		setDiameter(diameter);
	}
//accessor method
	public int getMyX() {
		return myX;
	}
	public void setMyX(int myX) {
		this.myX = myX;
	}
	public int getMyY() {
		return myY;
	}
	public void setMyY(int myY) {
		this.myY = myY;
	}
	public double getDiameter() {
		return Diameter;
	}
	public void setDiameter(double diameter) throws NegativeDiameterException{
		if(diameter < 0)
		{
			throw new NegativeDiameterException("Diameter cannot be negative");
		}
		this.Diameter = diameter;
	}
	public void display()
	{
		System.out.println("Circle center:("+myX+","+myY+")");
		System.out.println("Circle diameter:"+ Diameter);
	}


}

package hw6;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator() {
		
	}
	
	public Calculator(int x, int y) throws CalException{
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) throws CalException {
		if (x == 0 && y == 0)
			throw new CalException("0的0次方沒有意義!");
		else
			this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) throws CalException {
		if (x == 0 && y == 0)
			throw new CalException("0的0次方沒有意義!");
		else
			this.y = y;
		
		if (y < 0)
			throw new CalException("次方為負值，結果回傳不為整數");
		else
			this.y = y;	
	}
	
	public String powerXY() {
		return x + "的" + y + "次方等於" + Math.pow(x, y);
	}
	
}

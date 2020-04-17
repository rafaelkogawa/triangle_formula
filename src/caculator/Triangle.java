package caculator;

public class Triangle {
	private Double x1;
	private Double x2;
	private Double x3;

	private Double y1;
	private Double y2;
	private Double y3;

	public Triangle() {

	}

	public Triangle(Double x1, Double x2, Double x3, Double y1, Double y2, Double y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	
	public Double getX1() {
		return x1;
	}

	public void setX1(Double x1) {
		this.x1 = x1;
	}

	public Double getX2() {
		return x2;
	}

	public void setX2(Double x2) {
		this.x2 = x2;
	}

	public Double getX3() {
		return x3;
	}

	public void setX3(Double x3) {
		this.x3 = x3;
	}

	public Double getY1() {
		return y1;
	}

	public void setY1(Double y1) {
		this.y1 = y1;
	}

	public Double getY2() {
		return y2;
	}

	public void setY2(Double y2) {
		this.y2 = y2;
	}

	public Double getY3() {
		return y3;
	}

	public void setY3(Double y3) {
		this.y3 = y3;
	}

	public double pX() {
		return (x1+x2+x3)/2;
	}
	
	public double pY() {
		return (y1+y2+y3)/2;
	}
	
	public double areaX() {
		return Math.sqrt(pX()*(pX()-x1)*(pX()-x2)*(pX()-x3));
	}
	
	public double areaY() {
		return Math.sqrt(pY()*(pY()-y1)*(pY()-y2)*(pY()-y3));
	}
	
	


	
	
	
	

	
	
	
	
}

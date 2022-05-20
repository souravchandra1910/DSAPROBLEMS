package arrays;

public class Main {
    public static class Point{
    	static int x;
    	static int y;
    	public Point(int x,int y) {
    		this.x=x;
    		this.y=y;
    	}
       public static  void Display() {
    	   System.out.println("The x coordinate is " + x +"\nthe y coordinate is "+y);
       }
       public static void Translate(int x,int y) {
    	   int tempx=x;
    	   x=x+y;
    	   y=y+tempx;
    	   System.out.println(x+" "+y);
       }
    }
	public static void main(String[] args) {
		Point p=new Point(100,200);
		p.Display();
		p.Translate(10,20);

	}

}

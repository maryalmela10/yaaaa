package geometriaObjetos;

public class Point {

	 	public int x = 0;
	    public int y = 0;
	    // a constructor!
	    public Point(int a, int b) {
	    this.x = a;
	    this.y = b;
	    }
	    
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
	    
	    
}

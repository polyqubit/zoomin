import pkg.*;
public final class zoom {
	static int flag = 0b1111111111;
	public static void zoom(Rectangle rect, double factor, double mX, double mY) {
		//rect.grow(factor,factor);
		
		//find the center of the object
		double cX = (rect.getX()+rect.getWidth())/2;
		double cY = (rect.getY()+rect.getHeight())/2;
		System.out.println(cX+", "+cY);
		//rect.translate(0.3*(cX-mX),0.3*(cY-mY));
		
		//find distance between center of Rect and mX,mY
		double distance = 0;
		System.out.println();
	}
}
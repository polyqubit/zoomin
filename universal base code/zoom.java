import pkg.*;
public final class zoom {
	static int flag = 0b1111111111;
	public static void zoom(Rectangle rect, double factor, double mX, double mY) {
		//rect.grow(factor,factor);
		
		//find the center of the object
		double cX = (rect.getX()+(rect.getX()+rect.getWidth()))/2;
		double cY = (rect.getY()+(rect.getY()+rect.getHeight()))/2;
		System.out.println(mX+", "+mY);
		System.out.println(cX+", "+cY);
		System.out.println(rect.getWidth()+", "+rect.getHeight());
		//rect.translate(0.3*(cX-mX),0.3*(cY-mY));
		
		//find distance between center of Rect and mX,mY
		double distance = Maths.sqrt(Maths.pow((mX-cX),2)+Maths.pow((mY-cY),2));
		System.out.println(distance);
	}
}
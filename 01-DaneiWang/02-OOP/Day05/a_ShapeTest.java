//��һ��ͼ���е�������
public class a_ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Square(1);
		shapes[1] = new Square(2);
		shapes[2] = new Circle(1);
		shapes[3] = new Circle(2);
		
		maxArea(shapes);
	}

	
	public static void maxArea(Shape[] shapes) {
		double max = shapes[0].area();
		int maxIndex = 0;
		for(int i = 1; i < shapes.length; i++) {
			double area = shapes[i].area();
			if(area > max) {
				max = area;
				maxIndex = i;
			}
		}
		System.out.println("��������"+max+" �������"+maxIndex);
	}
}

abstract class Shape{//������
	protected double c;	//�ܳ�
	public abstract double area();//���󷽷�
}

class Square extends Shape{
	public Square(double c) {
		this.c = c;
	}
	public double area() {//��д���󷽷�
		return 0.0625*c*c;
	}
}

class Circle extends Shape{
	public Circle(double c) {
		this.c = c;
	}
	public double area() {
		return 0.0796*c*c;
	}
}

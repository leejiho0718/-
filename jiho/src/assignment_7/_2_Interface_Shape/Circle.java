package assignment_7._2_Interface_Shape;


//Circle Ŭ���� - Shape �������̽��� ����
public class Circle implements Shape {
	
	 private double radius;		// ���� ������

	 // Circle ������ - ������ �ʱ�ȭ
	 public Circle(double radius) {
	     this.radius = radius;
	 }

	 // getArea() - Shape �������̽��� �߻� �޼ҵ� 
	 public void getArea() {
	     double area = 3.14 * radius * radius; 		// �� ���� -> pi X ������^2
	     System.out.println("Circle area: " + area); 	
	 }

}
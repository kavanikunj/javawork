package basic;

abstract class Shap{
	abstract void draw();
	 
 }

  class Circle extends Shap {
	  void draw() {
		  System.out.println("Drawing a Circle");
	  }
  }

  class Rectangle extends Shap {
	  void draw() {
		  System.out.println("Drawing a Rectangle");
	  }
  }

   class Triangle extends Shap {
	   void draw() {
		   System.out.println("Drawing a Triangle");
	   }
   }

public class polymor_phism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Shap myCircle = new Circle();
           Shap myRectangle = new Rectangle();
           Shap myTriangle = new Triangle();
           
           myCircle.draw();
           myRectangle.draw();
           myTriangle.draw();
           
	}

}

package project6;


public abstract class GeometricObject {//父类
  private String color;
  private boolean filled;
  private java.util.Date dateCreated;

 
  protected GeometricObject() {//构造函数
    dateCreated = new java.util.Date();
  }


  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;   //涉及到颜色和是否填充的构造函数
    this.filled = filled;
  }


  public String getColor() {//颜色的getter
    return color;  
  }


  public void setColor(String color) {//颜色的setter
    this.color = color;
  }


  public boolean isFilled() {//填充的getter
    return filled;
  }

  public void setFilled(boolean filled) {//填充的setter
    this.filled = filled;
  }

  

  
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }


  public abstract double getArea();//两个抽象类

  
  public abstract double getPerimeter();
}

// To avoid method overriding we use final keyword in the method declaration in base class.

class A
  {
    final void show()
    {
      System.out.println("This is base class");
    }
  }

class B extends A
  {
    void showB()
    {
      System.out.println("This is derived class");
    }
  }

public class Main {
  public static void main(String[] args) {
    B bb = new B();
    bb.show();
    bb.showB();
  }
}
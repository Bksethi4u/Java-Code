package bk.assignment01;

public class SuperKeyword {

	SuperKeyword() {
        System.out.println("Parent Class Constructor");
    }
}

class Child extends SuperKeyword {

    Child() {
        super();    // Calls Parent constructor
        System.out.println("Child Class Constructor");
    }
}

public class  {
    public static void main(String[] args) {

        Child obj = new Child();
    }
}


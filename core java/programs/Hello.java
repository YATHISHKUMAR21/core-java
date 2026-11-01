//create the file which print hello world
// System.out.println("Hello World");


//sincew jvm asks for main we need to define the main

class Hello{
public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println(3+3);
    int num1 = 3;
    int num2=3;
    int res= num1+num2;
    System.out.println(res);

    // float num3= 3.5f;

    int num3 = 129;
    byte by = 127;
    short sh = 558;
    long l = 131231231232L;
    float f = 3.5f;
    double d = 3.5;
    char c = 'a';
    boolean b = true;
//     byte by = 129;
//     ravisavi@AISHUs-MacBook-Air programs % javac Hello.java
// Hello.java:19: error: incompatible types: possible lossy conversion from int to byte
//     byte by = 129;

//because in. byte we can store only -128 to 127 but we are trying to store 129 which is not possible so we get error

//               ^
// 1 error
    //so to avpid this error , we use type casting
}
}


//java is oops in simple terms everything is object but to create objects
//we need to create a class and then create object of that class
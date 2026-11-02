class Calculator{
    
    public int add(int n1 , int  n2){
        return n1 + n2;

        
    }
}



public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int num1=1;
        int num2=2;

        Calculator cal = new Calculator();
        int res = cal.add(num1 , num2);
        int res2 = cal.add(10 , 20);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + res);
        System.out.println("The sum of 10 and 20 is: " + res2);
    }
    
}

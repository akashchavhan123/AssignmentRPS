package assignment;

public class Methods {
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public int mul(int a,int b){
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println(m.mul(5,3));
        System.out.println(sum(5,5));
    }
}

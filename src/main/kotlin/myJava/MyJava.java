package myJava;

public class MyJava {
    public static void main(String[] args) {

        int sum = MyCustomKotlinFileName.add(3, 4);
        System.out.println("Printing sum from Java file:"+sum);

        int result=MyCustomKotlinFileName.findVolume(4,7,40);
        System.out.println(result);
    }
    public static int getArea(int l, int m){
        return l*m;
    }
}


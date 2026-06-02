import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        a= scanner.nextInt();
        System.out.println("请输入第二个整数：");
        b= scanner.nextInt();
        System.out.println("两数之和为："+(a+b));
        System.out.println("两数之差为："+(a-b));
        System.out.println("两数之积为："+(a*b));
        System.out.println("两数之商为："+(double)a/b);
    }
}
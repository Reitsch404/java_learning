public class RangeSumPrinter {
    public static void main(String[] args) {
        int sum=0;//原本写的是int i,sum;sum=o;   后面才知道“i 可以在 for 循环内声明”
        for(int i=1;i<=100;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("1~100的和为："+sum);
    }
}
// 打印1到100的所有整数，并计算它们的和
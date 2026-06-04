public class Multiplication_Table {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");//没排成三角形的时候已急哭
            }
            System.out.println();//print：输出内容后不换行，下一次输出的内容会紧接着跟在同一行后面。
                               //println：输出内容后自动换行，下一次输出的内容会从下一行的开头开始。
        }
    }
}
//打印九九乘法表
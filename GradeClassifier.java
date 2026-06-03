import java.util.Scanner;
public class GradeClassifier {
    public static void main(String[] args) {
        double grade;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩（0-100）：");
        grade= scanner.nextDouble();
        if (grade>=90)
            System.out.println("等级为：A");
        else if (grade>=80)
            System.out.println("等级为：B");
        else if (grade>=70)
            System.out.println("等级为：C");
        else if (grade>=60)
            System.out.println("等级为：D");
        else
            System.out.println("等级为：F");
    }
}
// 输入一个成绩（0-100），输出等级：90以上A，80-89 B，70-79 C，60-69 D，60以下F
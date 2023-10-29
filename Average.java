import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number:");
        int number= input.nextInt();
        int a=0;
        int b=0;
        for (int i=1;i<=number;i++){
            if(i%3==0 && i%4==0){
                a=i+a;
                b++;
            }
        }
        int average=a/b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(average);
    }
}

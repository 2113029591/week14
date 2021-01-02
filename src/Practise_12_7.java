import java.util.Scanner;

public class Practise_12_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入一个二进制数：");
        String string=input.nextLine();
        int n;
        try{
            n=Integer.parseInt(string,2);
            System.out.println(n);
        }
        catch (Exception e){
            throw new NumberFormatException("非二进制数");
        }

    }
}

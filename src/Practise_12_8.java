import java.util.Scanner;

public class Practise_12_8 extends Exception{
    public static void main(String[] args) throws HexFormatException{
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a hex number:");
        String hex=input.nextLine();
        try{
            System.out.println("The decimal value for hex number " +
                    hex+" is "+hexToDecima(hex.toUpperCase()));
        }
        catch (Exception e){
            throw new HexFormatException("非十六进制数！！");
        }
    }
    public static int hexToDecima(String hex) throws Exception{
        int decimalValue=0;
        for(int i=0;i<hex.length();i++)
        {
            char hexChar=hex.charAt(i);
            int n;
            n=Integer.parseInt(String.valueOf(hexChar),16);
            decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch>'A' && ch<='F'){
            return 10+ch-'A';
        }
        else {
            return ch - '0';
        }
    }
}
class HexFormatException extends Exception{
    public HexFormatException(String msg){
        super(msg);
    }
}
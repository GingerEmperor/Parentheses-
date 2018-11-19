import java.util.Scanner;

public class parentheses {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите пример:");
        String str=in.nextLine();
        int count=0;
        char strc;
        for (int i = 0; i <str.length() ; i++) {
            strc=str.charAt(i);// strc принимает каждый символ строки
            if(strc=='('){ count+=10; }   // +любое число
            else if(strc==')'){count-=10;}// -то-же число
            else if(strc=='['){count+=17;}//
            else if(strc==']'){count-=17;}//
            else if(strc=='{'){count+=102;}//
            else if(strc=='}'){count-=102;}//
        }
        if(count==0){//если будет 0, скобки сократились
            System.out.println("Верно");
        }
        else
            System.out.println("Не верно");
    }
}

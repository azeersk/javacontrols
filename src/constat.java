import java.util.Scanner;
public class constat {
    public static void main(String[] args) {
        Scanner intobj = new Scanner(System.in);
        int a = intobj.nextInt();
        int b = intobj.nextInt();
        int c = intobj.nextInt();
        if ((a>0 && b>0) && c>0){
            if (((a == 7) && (b!=7))&&(c!=7)){
                System.out.println(b*c);
            }
            else if(((b==7)&&((a==7)||(a!=7)))&&(c!=7)){
                System.out.println(c);
            }
            else if(((c==7)&&((a==7)||(a!=7)))&&((b==7)||(b!=7))){
                System.out.println(-1);
            }
            else{
                System.out.println(a*b*c);
            }
        }
        else{
            System.out.println("worng");
        }
    }
}

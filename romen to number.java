
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter a string: ");
        String s = scanner.nextLine();
	    int var=0;
         char[] char1 = s.toCharArray();
        for(char c : char1){
            if(c=='V'){
                var+=5;
            }
            else if(c=='I'){
                var+=1;
            }
            else if(c=='X'){
                var+=10;
            }
            else{
                continue;
            }
        }
        System.out.print(var);
	}
}


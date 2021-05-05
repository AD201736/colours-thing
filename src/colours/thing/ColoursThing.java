
package colours.thing;
import java.util.Scanner;
import java.util.ArrayList;
public class ColoursThing {

    
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number less than 10 : ");
        int repeat = in.nextInt();
        for (int i = 0 ; i < repeat ; i++){
            System.out.println("Enter a colour : ");
            colours.add(in.nextLine());
        }
        System.out.println(colours);
    }
    
}

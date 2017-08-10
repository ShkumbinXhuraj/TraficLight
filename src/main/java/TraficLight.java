import java.util.Scanner ;
public class TraficLight {
    public static void main(String [] args){
        final int red = 3 ;
        final int orange = 2 ;
        final int green = 1 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 - to Go ->");
        System.out.println("Enter 2 - to be Ready ||");
        System.out.println("Enter 3 - to Stop .");
        System.out.println();
        System.out.print("Enter The Comande : ");
        int color = sc.nextInt();

        if(color == 1)
        {
            System.out.println("The Light is Green (GO)");
        }
        else if(color == 2)
        {
            System.out.println("The Light is Orange (Ready)");
        }
        else if (color == 3)
        {
            System.out.println("The Light is Red (STOP)");
        }
        else
        {
            System.out.println("Error -> Wrongg COMAND !!");
        }

    }
}

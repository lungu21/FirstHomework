import java.util.Scanner;

public class AreaAndPerimeter {
    public void areaAndPerimeterOfSquare(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Da latura patratului:");
        int latura = input.nextInt();
        int aria;
        int perimetru;
        aria = latura * latura;
        perimetru = latura * 4;
        System.out.println("Aria patratului este: "+ aria + " Perimetrul patratului este: "+ perimetru);

    }

}

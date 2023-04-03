import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
    int weight;
    double height;
    Scanner input = new Scanner(System.in);

    System.out.println("Input weight:");
    weight = input.nextInt();
    System.out.println("Input height:");
    height = input.nextDouble();

    double bmi = weight / (height * height);
    if(bmi < 18.5){
        System.out.println("Underweight");
    } else if (bmi >= 18.5 && bmi < 25.0){
        System.out.println("Normal");
      } else if (bmi >= 25.0 && bmi < 30.0 ){
        System.out.println("Overweight");
      } else {
        System.out.println("Obese");
        }

    }
}

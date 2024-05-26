import java.util.Scanner;
public class overallGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter labs average in percentage: ");
        float labsGrade = input.nextFloat();
        System.out.println("Enter reading average in percentage: ");
        float readingGrade = input.nextFloat();
        System.out.println("Enter Video average in percentage: ");
        float videoGrade = input.nextFloat();
        System.out.println("Enter midterm average in percentage: ");
        float midtermGrade = input.nextFloat();
        System.out.println("Enter project average in percentage: ");
        float projectGrade = input.nextFloat();
        System.out.println("Enter final average in percentage: ");
        float finalGrade =input.nextFloat();
        float overallGrade = labsGrade * 20 / 100 + readingGrade * 10 / 100 + videoGrade * 15 / 100 + midtermGrade * 20 / 100 + projectGrade * 15 / 100 + finalGrade * 20 / 100;
        System.out.println("Your average is " + overallGrade + " %");
	}

}

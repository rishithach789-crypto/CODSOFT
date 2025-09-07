import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of subjects: ");
		int subjects = sc.nextInt();
		
		int []marks =new int[subjects];
		int total=0;
		
		for(int i=0;i<subjects;i++) {
			System.out.println("Enter marks for subjects "+(i+1)+ ": ");
			marks[i]=sc.nextInt();
			total +=marks[i];
		}
		double average =(double)total/subjects;
		char grade;
		
		if(average >= 90) {
			grade ='A';
		} else if(average >= 75) {
			grade='B';
		}else if(average >= 50) {
			grade='C';
		}else if(average >= 35) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("\n----Result----");
		System.out.println("Total Marks: "+total);
		System.out.println("Average Percentage: "+average+"%");
		System.out.println("Grade: "+grade);
		
		sc.close();
	}

}

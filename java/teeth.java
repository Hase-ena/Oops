//write a java programme to remind a patient abv tno. of times he has to brush his teeth in the morning as per the doctor, if it is urgent make it 30 and if its average level make it 35 and normally he has to do it 40 times


import java.util.Scanner;
public class teeth{
	public static void main(String args[]){
	int i;
Scanner myObj = new Scanner(System.in);
int Answer = myObj.nextInt();

do{
	System.out.println("Are you busy? 1.Yes 2.Average 3.No");
}while(Answer<4);
	if(Answer==1){
		System.out.println("Brush 30 times");
			for(i = 30; i >= 1; i--){
			System.out.print(i + " "+"more\n");}
			System.out.println("Done,Good job");       
	}
	else if(Answer==2){
		System.out.println("Brush 35 times");
		for(i = 35; i >= 1; i--){
			System.out.print(i +"more\n");}
			System.out.println("Done,Good job");       
	}

	else if(Answer==3){
		System.out.println("Brush 40 times");
		for(i = 40; i >= 1; i--){
			System.out.print(i +"more\n");}
			System.out.println("Done,Good job");       
	}
	else{
		System.out.println("Enter valid option");}


}
}










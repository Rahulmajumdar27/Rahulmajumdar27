import java.util.*;
public class Main
{
    public static float bmi(float wi,float hi){
        float m = hi/100;
        float m2=m*m;
        float bmi=wi/m2;
        return bmi;
    }
    public static void table(float bmi){
        if(bmi<18.5){
            System.out.println("Underweight :|");
        }
        else if(bmi>18.5 && bmi<24.9){
             System.out.println("Normal weight :)");
        }
        else if(bmi>25 && bmi<29.9){
             System.out.println("Overweight :(");
        }
        else{
            System.out.println("Obesity :{");
        }
    }
    //made by rahul majumdar 19/9/2022
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int doyoucontinue=1;
	    do{
		System.out.println("*********WELCOME TO BMI CALCULATER*************");
		float hi,wi;
		System.out.print("Enter Your Weight(KG) : ");
		wi=inp.nextInt();
		System.out.print("Enter Your Height(cm) : ");
		hi=inp.nextInt();
		float ans=bmi(wi,hi);
		System.out.print(ans+" ");
		table(ans);
		System.out.print("DO You Want To Continue YES(1) NO(0): ");
		doyoucontinue=inp.nextInt();
		System.out.print("\033[H\033[2J");
	    }while(doyoucontinue==1);
	    System.out.print("\033[H\033[2J");
	    System.out.println("********GOOD BYE :) <3***********");
	}
}

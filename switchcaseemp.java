public class switchcaseemp{

public static void main(String[] args){

int wageperhour =20;

int fulldayhour =8;

int parttimehour =4;
 int Totalsalary;

int Fulldaywage = (wageperhour * fulldayhour);


 
int Halfdaywage =(wageperhour * parttimehour);


int EmpCheck = (int)Math.floor(Math.random() * 10) % 3;


switch (EmpCheck) {
			case 1:
				Totalsalary = Halfdaywage;
				break;
			case 2:
             Totalsalary = Fulldaywage;
				break;

          default:
            Totalsalary = 0;
				
			}


System.out.println("emp Total salary is :" +Totalsalary);

}



}

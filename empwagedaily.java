public class empwagedaily{

public static void main(String[] args){

int wageperhour =20;

int fulldayhour =8;

int Total = (wageperhour * fulldayhour);

double EmpCheck = Math.floor(Math.random() * 10) % 2;

if ( EmpCheck == 1){

System.out.println("Employee perdaywage is:"  +Total);

}
else

{
System.out.println("Employee is Absent");

}

}

}

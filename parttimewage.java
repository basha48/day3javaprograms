public class parttimewage{

public static void main(String[] args){

int wageperhour =20;

int fulldayhour =8;

int parttimehour =4;


int TotalFullday = (wageperhour * fulldayhour);

 
int TotalHalfday =(wageperhour * parttimehour);


double EmpCheck = Math.floor(Math.random() * 10) % 3;



if ( EmpCheck == 1){

System.out.println("Employee fulldaywage is:"  +TotalFullday);

}
else if (EmpCheck == 2)

{
System.out.println("Employee halfdaywage is:"  +TotalHalfday);

}

else {

System.out.println(" emp is absent");


}

}


}

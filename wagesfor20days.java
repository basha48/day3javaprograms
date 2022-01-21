
   public class wagesfor20days{


public static void main(String[] args){

      int  is_parttime = 1;

        int is_fulltime = 2;
        int emp_rateperhour = 20;
        int num_workingdays = 20;
   
            int emphrs = 0;
            int empwage = 0;
            int total = 0;
            int empcheck = (int)Math.floor(Math.random() * 10) % 3;

            for (int day = 0; day < num_workingdays; day++)
            {
                switch (empcheck)
            {
                case 1:
                    emphrs = 4;
                   System.out.println("Employee is part time and total hours=" + emphrs);
                    break;
                case 2:
                    emphrs = 8;
                   System.out.println("Employee is full time and total hours=" + emphrs);

                    break;
                default:
                    emphrs = 0;
                  System.out.println("Employee has not fullfilled hours=" + emphrs);
                    break;
            }
            empwage = emphrs * emp_rateperhour;
            System.out.println("Employee Wage: " + empwage);
            total = total +empwage;
                System.out.println("Day#: " + day + " Employee Hours : " + emphrs);
               System.out.println(".........................................................");


            }
           System.out.println("Total Employee Wage: " + total);
        }
    
}

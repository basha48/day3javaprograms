
public class wagesfor100hrs {
        
        public static void main(String[] args){

              int is_parttime = 1;

         int is_fulltime = 2;
         int emp_rateperhour = 20;
         int num_workingdays = 20;
         int max_hours = 100;

            int emphrs = 0;
            int empwage = 0;
            int totalemphrs = 0;
            int totaldays = 0;

            while (totalemphrs <= max_hours && totaldays < num_workingdays)
            {
                
                int empcheck = (int)Math.floor(Math.random() * 10) % 3;
                totaldays++;
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

                totalemphrs += emphrs;
                System.out.println("Day#: " + totaldays + " Employee Hours : " + emphrs);
                System.out.println(".........................................................");


            }
            int totalwage = totalemphrs * emp_rateperhour;
            System.out.println("Total Employee Wage: " + totalwage);
        }

}

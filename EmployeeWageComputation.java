public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation ");

        int EMP_IS_FULL_TIME = 1, EMP_WAGE_PER_HOUR = 20, EMP_IS_PART_TIME = 2,
                empWage = 0, empWorkingHrs=0;

        int empCheck = (int)((Math.random() * 10) % 3);

        if(empCheck == EMP_IS_FULL_TIME){
            empWorkingHrs = 8;
        } else if (empCheck == EMP_IS_PART_TIME) {
            empWorkingHrs = 4;
        } else{
            empWorkingHrs = 0;
        }
        empWage = EMP_WAGE_PER_HOUR * empWorkingHrs;
        System.out.println("Daily Employee Wage : " + empWage);
    }
}

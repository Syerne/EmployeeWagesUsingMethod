public class EmployeeWageComputation {
    static final int EMP_IS_FULL_TIME = 1;
    static final int EMP_IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_MAX_WORKING_DAYS = 20;
    static final int EMP_MAX_WORKING_HRS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation ");

        int empWage = 0, empWorkingHrs = 0, totalEmpWorkingDay = 0, totalEmpWorkingHrs = 0;
        int isPresentCount = 0, isPartTimeCount = 0, isAbsentCount = 0, totalEmpWage = 0;

        while (totalEmpWorkingHrs <= EMP_MAX_WORKING_HRS && totalEmpWorkingDay < EMP_MAX_WORKING_DAYS) {

            totalEmpWorkingDay++;

            int empCheck = (int) ((Math.random() * 10) % 3);

            switch (empCheck) {
                case 1:
                    empWorkingHrs = 8;
                    isPresentCount++;
                    break;
                case 2:
                    empWorkingHrs = 4;
                    isPartTimeCount++;
                    break;
                default:
                    empWorkingHrs = 0;
                    isAbsentCount++;
                    break;
            }
            totalEmpWorkingHrs += empWorkingHrs;
            empWage = EMP_WAGE_PER_HOUR * empWorkingHrs;
            totalEmpWage += empWage;
        }
        System.out.println("Total Emp Working Days : " + totalEmpWorkingDay + " Total Emp Working Hrs : " + totalEmpWorkingHrs);
        System.out.println("TotalPresentDays :" + isPresentCount + " TotalPartTimeDays :" + isPartTimeCount + " TotalAbsent :" + isAbsentCount);
        System.out.println("Total Employee Wage : " + totalEmpWage);
    }
}

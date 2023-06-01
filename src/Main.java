public class Main {


    public static void main(String[] args) {

        int[] Employee = new int[10];
        Employee.workers worker1 = new Employee.workers("Иван","Иванович","Иванов",20000,1);
        System.out.println(worker1.toString());

        Employee.workers worker2 = new Employee.workers("Петр","Петрович","Петров", 350000, 3);
        System.out.println(worker2.toString());

        Employee.workers worker3 = new Employee.workers("Александр","Александрович","Александров",25000,4);
        System.out.println(worker3.toString());





    }

    public static int getSalarySum(int salarySum) {

        int[] salary = {20000, 35000, 25000};
        int sum = 0;
        for (int i : salary) {
            sum += i;

            System.out.println("зумма выплат за месяц составляет " + sum);
        }

        public static int findAverageSalary (int average) {

            sum = 0;
            for (int i : salary) {
                sum += i;

            int workersCoast = 3;
                average = sum / workersCoast;

                return average;

                System.out.println("средняя значение трат за месяц равняется " + average);

                public static int findMinAndMax(){

            int maxSalary = salary.length;
            int minSalary = salary[0];

            for (int i = 0; i < salary.length; i = i + 1) {

                if (salary[i] < minSalary) {

                    minSalary = salary[i];
                }

                if (salary[i] > maxSalary) {

                    maxSalary = salary[i];
                }
            }

            System.out.println("максимальная зарплата " + maxSalary + " а минимальная " + minSalary);
        }}
    }
        }
    }



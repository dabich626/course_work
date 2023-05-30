public class Main {


    public static void main(String[] args) {

        names worker1 = new names("Иван", "Иванович", "Иванов", 20000);
        System.out.println(worker1.toString());

        names worker2 = new names("Петр", "Петрович", "Петров", 30000);
        System.out.println(worker2.toString());

        names worker3 = new names("Александр", "Александрович", "Александров", 23000);
        System.out.println(worker3.toString());


    }

    public static void salarySum(int salarySum) {

        int[] salary = {20000, 30000, 23000};
        int sum = 0;
        for (int i : salary) {
            sum += i;
        }
        int workersCoast = 3;
        int average = sum / workersCoast;
        System.out.println("средняя значение трат за месяц равняется " + average);

        System.out.println("зумма выплат за месяц составляет " + sum);

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
    }
}


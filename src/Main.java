import coursework.Employee;

public class Main {

    private  Employee [] employees = new Employee [10];


    public static void main(String[] args) {


        employees [0] = new Employee("Иван","Иванович","Иванов",20000,1);
        System.out.println(worker1.toString());
        System.out.println(worker1.id);

        employees[1] = new Employee("Петр","Петрович","Петров", 350000, 3);
        System.out.println(worker2.toString());
        System.out.println(worker2.id);

        employees[2] = new Employee("Александр","Александрович","Александров",25000,4);
        System.out.println(worker3.toString());
        System.out.println(worker3.id);





    }

    public static int sum() {
        int sum = 0;
        for (Employee employee : emploees) {
            sum += employee.getSalary();

            System.out.println("зумма выплат за месяц составляет " + sum);
        }
        return sum;

        public static int findMinSalary () {

            int min = Integer.MAX_VALUE;
            int index = 0;
            for (i = 0; i < emploees.length; i = i + 1) {
                if (emploee[i].getSalary()< min){
                     min = emploees[i].getSalary;
                     index = i;
                }
            }

            public static int findMaxSalary (){

                Employee max = null;
                for(Employee employee : emploees) {
                    if (employee == null){
                        continue;
                    }
                    if(max == null || employee.getSalary()>min.getSalary()) {
                        max == employee;
                    }


            }

            static double average(){

                    return sum()/emploees.lenght;
                }


                System.out.println("средняя значение трат за месяц равняется " + average);

            }

            System.out.println("максимальная зарплата " + max + " а минимальная " + min);
        }}
    }
        }
    }



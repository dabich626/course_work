public class Main {


    public static void main(String[] args){

        names worker1 = new names(Ivan,Ivanovich,Ivanov,20000);
        System.out.println(worker1.toString());

        names worker2 = new names(Petr, Petrovich, Petrov, 30000);
        System.out.println(worker2.toString());


    }
    public static void salarySum(int salarySum){

        int[] salary = {20000,30000};
        int sum = 0;
        for (int i : salary) {
            sum += i;
        }
        int days = 30;
        int average = sum / days;
        System.out.println("средняя значение трат за месяц равняется " + average);

        System.out.println("зумма выплат за месяц составляет " + sum);
    }
}
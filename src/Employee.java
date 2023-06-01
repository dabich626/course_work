public class Employee {



    public static class workers {

        public  int id = 0;
        private String name;
        private String secondName;

        private String surname;

        private int salary;

        private int department;

        public workers(String name, String secondName, String surname, int salary, int department) {

            this.name = name;
            this.secondName = secondName;
            this.surname = surname;
            this.salary = salary;
            this.department = department;


        }

        public workers () {

            id = id + 1;
        }

        public String getName() {

            return this.name;
        }

        public String getSecondName() {

            return this.secondName;
        }

        public String getSurname() {

            return this.surname;
        }

        public int getSalary() {

            return this.salary;
        }

        public int setSalary(){

            return this.salary;
        }

        public int getDepartment() {

            return this.department;
        }

        public int setDepartment(){

            return this.department;
        }

        public int getId () {

            return id;
        }

        public String toString() {

            return "id: " + id + " имя: " + this.name + " отчество: " + this.secondName + " фамилия: " + this.surname + " зарплата: " + this.salary + " отдел: " + this.department;
        }

    }
}

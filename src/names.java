public class names {
    private String name;
    private String secondName;

    private String surname;

    private int salary;

    public names (String name, String secondName, String surname, int salary){

        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.salary = salary;

    }

    public String getName(){

        return this.name;
    }

    public String getSecondName (){

        return this.secondName;
    }

    public String getSurname (){

        return this.surname;
    }

    public int getSalary(){

        return this.salary;
    }

}





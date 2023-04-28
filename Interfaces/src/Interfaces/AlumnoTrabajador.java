package Interfaces;

public class AlumnoTrabajador extends Persona implements Becable, Contratable {
    private String university;
    private String career;
    private String year;
    private String company;
    private String position;
    private String salary;

    public AlumnoTrabajador(){}

    public AlumnoTrabajador(String name, String lastName, int age, String university, String career, String year, String company, String position, String salary){
        super(name, lastName, age);
        this.university = university;
        this.career = career;
        this.year = year;
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    public Boolean becable(){
        return true;
    }

    public Boolean contratable(){
        return true;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Nombre: " + getName() +
                "\nApellido: " + getLastName() +
                "\nEdad: " + getAge() +
                "\nUniversidad: " + getUniversity() +
                "\nCarrera: " + getCareer() +
                "\nAño: " + getYear() +
                "\nEmpresa: " + getCompany() +
                "\nPosición: " + getPosition() +
                "\nSalario: " + getSalary() +
                "\nBecable: " + (becable() ? "Si" : "No") +
                "\nContratable: " + (contratable() ? "Si" : "No");
    }
}

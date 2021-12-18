package lesson13;

public class Employee {
    public String fullName;
    public int employeeNumber;
    public int occupationalLife;

    public Employee(String fullName, int employeeID, int occupationalLife) {
        this.fullName = fullName;
        this.employeeNumber = employeeID;
        this.occupationalLife = occupationalLife;
    }

    @Override
    public String toString() {
        String info = "ФИО: " + workerName() + " | " + " Табельный номер: " + getNumber()
                + " | " + "Опыт работы: " + getOccupationalLife();
        return info;
    }

    public String workerName() {
        return fullName;
    }

    public int getNumber() {
        return employeeNumber;
    }

    public int getOccupationalLife() {
        return occupationalLife;
    }
}

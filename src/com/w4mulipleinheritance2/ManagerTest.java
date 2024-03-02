package com.w4mulipleinheritance2;

public class ManagerTest {
    public static void main(String[] args) {
        Sortable[] staff = new Employee[4];
        staff[0] = new Employee("Antonio Rossi", 2900000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 1500000, 1, 11, 1993);
        staff[3] = new Manager("Farras", 5000000, 8, 4, 2004);
        Sortable.shell_sort(staff);
        int i;
        for (i = 0; i < 4; i++)
            staff[i].raiseSalary(5);
        for (i = 0; i < 4; i++)
            staff[i].print();

    }
}

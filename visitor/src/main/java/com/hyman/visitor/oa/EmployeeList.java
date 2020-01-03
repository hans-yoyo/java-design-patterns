package com.hyman.visitor.oa;

import java.util.ArrayList;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 21:00
 */
public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department handler) {
        for (Employee employee : list) {
            employee.accept(handler);
        }
    }


}

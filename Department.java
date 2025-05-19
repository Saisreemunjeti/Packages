package com.company.admin;

public class Department {
    private int deptId;
    private String deptName;
       public void setDeptId(int deptId) {
       this.deptId = deptId;
    }
       public void setDeptName(String deptName) {
       this.deptName = deptName;
    }
       public int getdeptId() {
       return deptId;
    }
       public String getdeptName(){
       return deptName;
    }
       public void showDepartmentDetails() {
         System.out.println("Department ID: " + deptId);
         System.out.println("Department Name:" +deptName);
    }
}

package com.Bridgelabz;

public class DailyEmpWage {
    public static void main(String[] args) {
    int emp_rate_per_hour=20;
    int empcheck=(int)((Math.random()*10)%2);
    int emp_hours=0;
    int emp_wage=0;
    if(empcheck==1){
        emp_hours=8;
    }
    else {
        emp_hours=0;
    }
    emp_wage=emp_hours*emp_rate_per_hour;
    System.out.println("EmpWage :"+emp_wage);
}

}

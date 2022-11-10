import java.util.*;
public class Main {
    public static void main (String[] args) {
        String emp_name="Employee";
        int emp_id=90,basic =50000;
        double da,hra,gross;
        da=basic*0.2;
        hra =basic *0.05;
        gross=basic+da+hra;
        System.out.println("Emploee name:"+emp_name+"\n"+"EmployeeID :"+emp_id+"\n"+"Gross Salary : "+gross);
    }
    
}


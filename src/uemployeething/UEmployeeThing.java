/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uemployeething;

/**
 * To display important information about a few special university employees
 * @author Yoyohogo
 */
public class UEmployeeThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UEmployee bert = new UEmployee ("Bob Bobertson", 49000.95);
        bert.printName();
        bert.printSalary();
        System.out.println("************");
        Faculty bob = new Faculty ("Bilbo Baggins", 15000000, "Adventuring");
        bob.printName();
        bob.printSalary();
        bob.printFaculty();
        System.out.println("************");
        Staff jeanette = new Staff ("Little Mac", 65000, "boxer");
        jeanette.printName();
        jeanette.printSalary();
        jeanette.printTitle();
    }
    
}

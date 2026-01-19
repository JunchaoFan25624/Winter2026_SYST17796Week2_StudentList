/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author fjc27
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // definr and print 3 student info name, sid using array
        Student[] list = new Student[3];//array of obj // peter 1
        Student s1 = new Student();// s1 obj
        
        s1.setName("Peter");
        s1.setSid(1);
        // store s1 obj in array
        Student s2 = new Student();// s2 obj
        s2.setName("John");
        s2.setSid(2);
        // Student s3 = new Student();// s3 obj
        // s3.setName("Khan");
        // s3.setSid(3);
        
        list[0]=s1;
        list[1]=s2;
        // list[2]=s3; //stores obj in array
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getSid());
        System.out.println("Finished") // fetch + merge
        }
    }
    
}



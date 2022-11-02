/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orienteobjetclass;

import model.Student;
import model.Teacher;

/**
 *
 * @author user
 */
public class OrienteObjetClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creer une instance qui est aussi un objet = student1 - la class Student devient aussi type

        Student student1 = new Student();

        //ajouter ou assigner nom et prenom 
        student1.setNom("ronaldo");
        student1.setPrenom("christiano");

        // afficher les valeurs de l attribut
        System.out.println("nom " + student1.getNom());
        System.out.println("prenom " + student1.getPrenom());

        // creer instance teacher et ajouter infos
        Teacher teacher1 = new Teacher("Ronaldo", "christ", 7);
        Teacher teacher2 = new Teacher("Bambi", "christiano", 9);
        Teacher teacher3 = new Teacher("Moutandou", "christ", 2);
        Teacher teacher4 = new Teacher("Allerte", "albert", 3);
        Teacher teacher5 = new Teacher("Michou", "Frank", 5);

        //creer tableau qui va contenir teacher
        Teacher[] listTeachers = new Teacher[5];

        listTeachers[0] = teacher1;
        listTeachers[1] = teacher2;
        listTeachers[2] = teacher3;
        listTeachers[3] = teacher4;
        listTeachers[4] = teacher5;

        /* loop classic
        for (int i = 0; i < listTeachers.length; i++) {
            System.out.println("Nom " + listTeachers[i].getNom());
        }
         */
        // enhanced loop
        for (Teacher t : listTeachers) {

            System.out.println("Nom  " + t.getNom());
        }
    }

}

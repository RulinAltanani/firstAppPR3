/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assiement1Introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author hp
 */
public class MainTest {

    public static void main(String[] args) throws FileNotFoundException {

        Student students[]
                = {
                    new ItStudent(12, "shaimaa", "cs", 20,40, 10),
                    new ItStudent(3, "shaimaa", "se", 27, 58, 9),
                    new ItStudent(4, "shaimaa", "cs", 28, 51, 8),
                    new ArtStudent(2, "sara", "b", 30, 51, 8),
                    new ArtStudent(2, "shosho", "b", 25, 51, 10),
                    new ArtStudent(2, "soso", "b", 21, 55, 8)

                };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getGrade() > students[j + 1].getGrade()) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }

            }

        }

        File f = new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Java3Applcation\\file\\Student.txt");
        PrintWriter outOfStrem;
        outOfStrem = new PrintWriter(new FileOutputStream(f, true));
        for (Student student : students) {
            outOfStrem.println(student);
        }

        outOfStrem.close();

    }
}

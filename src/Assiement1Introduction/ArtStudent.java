/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assiement1Introduction;

/**
 *
 * @author hp
 */
public class ArtStudent  extends Student{
     public ArtStudent(int id, String name, String major , double midGrade, double finalGrade, double  reportGrade) {
        super(id, name, major);
        this.setGrade(midGrade*0.40 + reportGrade*0.10 + finalGrade*50);
    }

   
    

    
    
}

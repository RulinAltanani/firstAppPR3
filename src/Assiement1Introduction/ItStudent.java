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
public class ItStudent extends Student {

    public ItStudent(int id, String name, String major, double midGrade, double finalGrade, double ProjectGrade) {
        super(id, name, major);
        this.grade=midGrade * 0.30 + ProjectGrade * 0.30 + finalGrade * 40;
    }
}

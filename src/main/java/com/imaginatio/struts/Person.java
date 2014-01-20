/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.imaginatio.struts;

/**
 *
 * @author developer
 */
public class Person {
    private Integer id;
    private String Name;

    public void setName(String newName) {
        this.Name = newName;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }
}

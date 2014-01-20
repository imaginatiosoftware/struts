/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.imaginatio.struts;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author developer
 */
public class PersonCreateAction extends ActionSupport{
    @Autowired
    private PersonService personService;

    public void setPersonService(PersonService personService){
        this.personService = personService;
    }

    private String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
  @Override
  public String execute(){
    personService.createPerson(this.getName());
    return "success";
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.imaginatio.struts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author developer
 */


@Service
public class PersonService {
  @Autowired
  private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }

    public void setPersonMapper(PersonMapper personMapper) {
      this.personMapper = personMapper;
    }

  @Transactional
  public void createPerson(String Name){
    this.getPersonMapper().createPerson(Name);
  }
}
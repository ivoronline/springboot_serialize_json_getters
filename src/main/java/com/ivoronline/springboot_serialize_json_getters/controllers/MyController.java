package com.ivoronline.springboot_serialize_json_getters.controllers;

import com.ivoronline.springboot_serialize_json_getters.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("GetPerson")
  PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO          = new PersonDTO();
              personDTO.propId   = 1;
              personDTO.propName = "John";
              personDTO.propAge  = 20;

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}

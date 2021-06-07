package com.ivoronline.springboot_serialize_json_getters.dto;

public class PersonDTO {

  //PROPERTIES
  public Integer id;
  public String  name;
  public Integer age;

  //GETTERS (Used for Serialization)
  public Integer getId  () { return id;               }
  public String  getName() { return "Getter " + name; }
  public Integer getAge () { return age;              }

}

package com.ivoronline.springboot_serialize_json_getters.dto;

public class PersonDTO {

  //PROPERTIES
  public Integer propId;
  public String  propName;
  public Integer propAge;

  //GETTERS (Used for Serialization)
  public Integer getId  () { return propId;               }
  public String  getName() { return "Getter " + propName; }
  public Integer getAge () { return propAge;              }

}

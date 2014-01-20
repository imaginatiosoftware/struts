package com.imaginatio.struts;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    @Select("select * from person where id = #{id}")
    Person selectPerson(@Param("id") int id);

    @Insert("insert into person (name) values (#{Name})")
    void createPerson(@Param("Name") String Name);
}
package org.robots.apps.mybatisapp.mapper;

import org.apache.ibatis.annotations.*;
import org.robots.apps.mybatisapp.model.City;

@Mapper
public interface CityMapper {
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name")
    })
    @Select("SELECT * from CITY where id = #{id}")
    City findById(@Param("id") int id);

    @Insert("INSERT into city(name,id) VALUES(#{name}, #{id})")
    void createCity(City city);
}

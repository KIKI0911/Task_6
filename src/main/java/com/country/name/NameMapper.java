package com.country.name;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM countries")
    List<Countries> findAll();

    @Select("SELECT * FROM countries WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%', #{suffix}) AND name LIKE CONCAT('%', #{contains},'%')")
    List<Countries> findByNameStartingWith(String prefix, String suffix, String contains);
}

package com.spr.test.mapper;

import com.spr.test.entity.User;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserMapper {
    @Insert("INSERT INTO collateralprovider(nameSei,nameMei,nameSeiKana,nameMeiKana," +
            "alphLastname," + "alphFirstname,country,birthdate,sex,tel," +
            "phone,shokugyoCode,kinmusakiName) " +
            "VALUES(#{nameSei},#{nameMei},#{nameSeiKana},#{nameMeiKana},#{alphLastname}," +
            "#{alphFirstname},#{country},#{birthdate},#{sex},#{tel},#{phone},#{shokugyoCode}," +
            "#{kinmusakiName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insert(User user);
    @Select("SELECT * FROM collateralprovider WHERE id = #{id}")
    User findById (Integer id);

}

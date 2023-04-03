package com.spr.test.mapper;

import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TanponinMapper {
    @Insert("INSERT INTO tanponin(tanpoMono,nameSei,nameMei,nameSeiKana,nameMeiKana,sex," +
            "birthDate,age,guarantorReason,applicantRelationship,same,phone," +
            "honninShokugyoCode,honninKinmusakiName,reason) " +
            "VALUES(#{tanpoMono},#{nameSei},#{nameMei},#{nameSeiKana},#{nameMeiKana}," +
            "#{sex},#{birthDate},#{age},#{guarantorReason},#{applicantRelationship},#{same},#{phone}," +
            "#{honninShokugyoCode},#{honninKinmusakiName},#{reason})")
    void insert(Tanponin tanponin);

    @Select("SELECT * FROM tanponin WHERE id = #{id}")
    Tanponin findById (Integer id);

}

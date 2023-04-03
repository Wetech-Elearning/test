package com.spr.test.mapper;

import com.spr.test.entity.Shienshinse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ShienshinseMapper {
    @Insert("INSERT INTO shienshinse(hisaijutakuShurui,hisaijutakuShoyuu," +
            "higaiJokyo,higaiJokyoDaikiboHankaiOrHankai,bukken_Menseki," +
            "bukkenAddressTodofuken,bukkenAddressShigun,bukkenAddressChoson," +
            "bukkenAddressBanchi,bukkenAddressPostCode3,bousaiSyudanItenJigyo," +
            "bukkenShikichiNoShoyuKankei,bukken_Tatemono_Jutaku," +
            "bukken_Tatemono_HiJutaku,bukken_Kozo,bukken_TatekataKodateKeishiki," +
            "nyukyoYoteiDateYear,nyukyoYoteiDateMonth,jutakuYoto,bukken_KojiKanryoDate_Year," +
            "bukken_KojiKanryoDate_Month,shikinDateTochiShikinYear," +
            "shikinDateTochiShikinMonth,shikinDateChukanShikinYear," +
            "shikinDateChukanShikinMonth,shikinDateSaishuShikinYear," +
            "shikinDateSaishuShikinMonth,kariireIninKaishaName,chukaiHanbaiNameKana," +
            "chukaiHanbaiTantoshaNameMei,chukaiHanbaiTantoshaNameSei,hiyouKensetsuHi," +
            "hiyouTochiSyotokuHi,hiyouTotal,kariireGakuKingaku,kariireGakuKinri," +
            "kariireGakuHensaiKikan,hensaiHouhou,kariireGakuNenHensai12No1," +
            "hisaiShinzokuDokyoAri,sueokiKikanNoNensu,sonotaName,sonotaKingaku," +
            "sonotaHensaiKikan,sonotaNenHensai12No1,sogoKingaku,kinyuKikanName,shitemName) " +
            "VALUES(#{hisaijutakuShurui},#{hisaijutakuShoyuu},#{higaiJokyo}," +
            "#{higaiJokyoDaikiboHankaiOrHankai},#{bukken_Menseki}," +
            "#{bukkenAddressTodofuken},#{bukkenAddressShigun},#{bukkenAddressChoson}," +
            "#{bukkenAddressBanchi},#{bukkenAddressPostCode3},#{bousaiSyudanItenJigyo}," +
            "#{bukkenShikichiNoShoyuKankei},#{bukken_Tatemono_Jutaku}," +
            "#{bukken_Tatemono_HiJutaku},#{bukken_Kozo},#{bukken_TatekataKodateKeishiki}," +
            "#{nyukyoYoteiDateYear},#{nyukyoYoteiDateMonth},#{jutakuYoto}," +
            "#{bukken_KojiKanryoDate_Year},#{bukken_KojiKanryoDate_Month}," +
            "#{shikinDateTochiShikinYear},#{shikinDateTochiShikinMonth}," +
            "#{shikinDateChukanShikinYear},#{shikinDateChukanShikinMonth}," +
            "#{shikinDateSaishuShikinYear},#{shikinDateSaishuShikinMonth}," +
            "#{kariireIninKaishaName},#{chukaiHanbaiNameKana},#{chukaiHanbaiTantoshaNameMei}," +
            "#{chukaiHanbaiTantoshaNameSei},#{hiyouKensetsuHi},#{hiyouTochiSyotokuHi}," +
            "#{hiyouTotal},#{kariireGakuKingaku},#{kariireGakuKinri},#{kariireGakuHensaiKikan}," +
            "#{hensaiHouhou},#{kariireGakuNenHensai12No1},#{hisaiShinzokuDokyoAri}," +
            "#{sueokiKikanNoNensu},#{sonotaName},#{sonotaKingaku},#{sonotaHensaiKikan}," +
            "#{sonotaNenHensai12No1},#{sogoKingaku},#{kinyuKikanName},#{shitemName})")
    Integer insert(Shienshinse shienshinse);

    @Select("SELECT * FROM shienshinse WHERE id = #{id}")
    Shienshinse findById (Integer id);


}

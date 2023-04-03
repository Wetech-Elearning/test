package com.spr.test.Controller;


import com.spr.test.Servise.ShienshinseService;
import com.spr.test.entity.Shienshinse;
import com.spr.test.entity.Tanponin;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestController
@RequestMapping("shienshinse")
public class ShienshinseController {
    @Autowired
    private ShienshinseService shienshinseService;

    @PostMapping("save")
    public ResponseEntity <?> saveShienshinse(@RequestBody Shienshinse shienshinse){
        shienshinseService.save(shienshinse);
        return ResponseEntity.ok("保存成功");

    }

    @PostMapping("search")  //user検索リクエストパス
    public ResponseEntity<?> findShienshinse(@RequestBody Integer id) {
        Shienshinse shienshinseResult;
        shienshinseResult = shienshinseService.findshienshinseById(id);

        if(shienshinseResult != null) {
            try {
                // 指定键名的顺序
                String[] keys = {
                        "hisaijutakuShurui",
                        "hisaijutakuShoyuu",
                        "higaiJokyo",
                        "higaiJokyoDaikiboHankaiOrHankai",
                        "bukken_Menseki",
                        "bukkenAddressTodofuken",
                        "bukkenAddressShigun",
                        "bukkenAddressChoson",
                        "bukkenAddressBanchi",
                        "bukkenAddressPostCode3",
                        "bousaiSyudanItenJigyo",
                        "bukkenShikichiNoShoyuKankei",
                        "bukken_Tatemono_Jutaku",
                        "bukken_Tatemono_HiJutaku",
                        "bukken_Kozo",
                        "bukken_TatekataKodateKeishiki",
                        "nyukyoYoteiDateYear",
                        "nyukyoYoteiDateMonth",
                        "jutakuYoto",
                        "bukken_KojiKanryoDate_Year",
                        "bukken_KojiKanryoDate_Month",
                        "shikinDateTochiShikinYear",
                        "shikinDateTochiShikinMonth",
                        "shikinDateChukanShikinYear",
                        "shikinDateChukanShikinMonth",
                        "shikinDateSaishuShikinYear",
                        "shikinDateSaishuShikinMonth",
                        "kariireIninKaishaName",
                        "chukaiHanbaiNameKana",
                        "chukaiHanbaiTantoshaNameMei",
                        "chukaiHanbaiTantoshaNameSei",
                        "hiyouKensetsuHi",
                        "hiyouTochiSyotokuHi",
                        "hiyouTotal",
                        "kariireGakuKingaku",
                        "kariireGakuKinri",
                        "kariireGakuHensaiKikan",
                        "hensaiHouhou",
                        "kariireGakuNenHensai12No1",
                        "hisaiShinzokuDokyoAri",
                        "sueokiKikanNoNensu",
                        "sonotaName",
                        "sonotaKingaku",
                        "sonotaHensaiKikan",
                        "sonotaNenHensai12No1",
                        "sogoKingaku",
                        "kinyuKikanName",
                        "shitemName"
                };

                JSONObject response = new JSONObject();
                // 按照指定顺序添加键值对
                for (String key : keys) {
                    String newKey = key.substring(0, 1).toUpperCase() + key.substring(1); // 将第一个字母转换为大写
                    Method method = shienshinseResult.getClass().getMethod("get" + newKey); // 获取对应的 getter 方法
                    Object value = method.invoke(shienshinseResult); // 使用 getter 方法获取属性值
                    response.put(key, value); // 添加到 JSON 对象中

                }
                return ResponseEntity.ok(response.toString());

            } catch (JSONException e) {
                e.printStackTrace();
                return ResponseEntity.badRequest().body("エラーが発生しました");
            } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"ユーザーが見つかりませんでした\"}");
            // return ResponseEntity.badRequest().body("ユーザーが見つかりません");

        }

    }

}

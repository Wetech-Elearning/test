package com.spr.test.Controller;

import com.spr.test.Servise.TanponinService;
import com.spr.test.Servise.UserService;
import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;
import jdk.nashorn.internal.parser.Lexer;
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
@RequestMapping("/tanponin")
public class TanponinController {

    @Autowired
    private TanponinService tanponinService;


    //　　担保者保存
    @PostMapping("tanponinSave")
    public ResponseEntity<?> createTanponin(@RequestBody Tanponin tanponin) {
        tanponinService.save(tanponin);
        return ResponseEntity.ok("保存成功");
    }

    @PostMapping("search")  //user検索リクエストパス
    public ResponseEntity<?> findTanponin(@RequestBody Integer id) {
        Tanponin tanponinFindResult;
        tanponinFindResult = tanponinService.findTanponinById(id);

        if(tanponinFindResult != null) {
            try {
                // 指定键名的顺序
                String[] keys = {
                        "tanpoMono",
                        "nameSei",
                        "nameMei",
                        "nameSeiKana",
                        "nameMeiKana",
                        "sex",
                        "birthDate",
                        "age",
                        "guarantorReason",
                        "applicantRelationship",
                        "same",
                        "phone",
                        "honninShokugyoCode",
                        "honninKinmusakiName",
                        "reason"};

                JSONObject response = new JSONObject();
                // 按照指定顺序添加键值对
                for (String key : keys) {
                    String newKey = key.substring(0, 1).toUpperCase() + key.substring(1); // 将第一个字母转换为大写
                    Method method = tanponinFindResult.getClass().getMethod("get" + newKey); // 获取对应的 getter 方法
                    Object value = method.invoke(tanponinFindResult); // 使用 getter 方法获取属性值
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

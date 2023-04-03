package com.spr.test.Controller;

import com.spr.test.Servise.TanponinService;
import com.spr.test.Servise.UserService;
import com.spr.test.entity.Tanponin;
import com.spr.test.entity.User;
import com.sun.org.apache.bcel.internal.generic.DCONST;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController{
    //在控制层注入业务层 コントロール層にサービス層を注入する
    @Autowired
    private UserService userService;

    /*private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    @PostMapping("save")     //设置方法的请求路径　メソッドのポストパスの設定
    public ResponseEntity<?> createUser(@RequestBody User user) {
        //判断输入框的值是否为空值
        //フォーム入力ボックスの値がNULL値かどうかを判断する
        if (user.getNameSei()== null || user.getNameSei().isEmpty()) {
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getNameMei()== null || user.getNameMei().isEmpty()) {
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getNameSeiKana()== null || user.getNameSeiKana().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getNameMeiKana()== null || user.getNameMeiKana().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getAlphLastname()== null || user.getAlphLastname().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getAlphFirstname()== null || user.getAlphFirstname().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getCountry()== null || user.getCountry().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getBirthdate()== null || user.getBirthdate().isEmpty()){
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getSex()== null || user.getSex().isEmpty()) {
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getPhone()== null || user.getPhone().isEmpty()) {
            return ResponseEntity.badRequest().body("正しく入力してください");
        }
        if (user.getShokugyoCode()== null || user.getShokugyoCode().isEmpty()) {
            return ResponseEntity.badRequest().body("正しく入力してください");
        }

        //入力チェック
        if (!user.getNameSei().matches("^[\u4E00-\u9FA5]+$")){
            return ResponseEntity.badRequest().body("漢字で入力してください");
        }
        if (!user.getNameMei().matches("^[\u4E00-\u9FA5]+$")){
            return ResponseEntity.badRequest().body("漢字で入力してください");
        }
        if (!user.getNameSeiKana().matches("^[ｧ-ﾝﾞﾟ]+$")){
            return ResponseEntity.badRequest().body("カタカナで入力してください");
        }
        if (!user.getNameMeiKana().matches("^[ｧ-ﾝﾞﾟ]+$")){
            return ResponseEntity.badRequest().body("カタカナで入力してください");
        }
        if (!user.getAlphLastname().matches("^[a-zA-Z]+$")){
            return ResponseEntity.badRequest().body("ローマ字で入力してください");
        }
        if (!user.getAlphFirstname().matches("^[a-zA-Z]+$")){
            return ResponseEntity.badRequest().body("ローマ字で入力してください");
        }
        if ( !user.getCountry().matches("^(中国|日本|韓国|スペイン)$")){
            return ResponseEntity.badRequest().body("国籍を選択してください");
        }
        if (!(user.getTel().matches("^0[789]0[0-9]{4}[0-9]{4}$") || user.getTel()== null
                || user.getTel().isEmpty())){
            return ResponseEntity.badRequest().body("正しい電話番号を入力してください");
        }
        if (!user.getPhone().matches("^0[789]0[0-9]{4}[0-9]{4}$")){
            return ResponseEntity.badRequest().body("正しい携帯電話を入力してください");
        }

        // 所有信息都正确的话就传输到数据库
        // すべての情報が正しい場合は
        //データベースに転送する
        userService.save(user);

        //prime keyを取得する
        Integer id = user.getId();
        try {
            JSONObject response = new JSONObject();
            response.put("id", id);

            return ResponseEntity.ok(response.toString());
            //"保存成功"
        }catch (JSONException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("エラーが発生しました");
        }


    }

    @PostMapping("search")  //user検索リクエストパス
    public ResponseEntity<?> findUser(@RequestBody Integer id) {
        User userFindResult;
        userFindResult = userService.findUserById(id);

        if(userFindResult != null) {
            try {
                // 指定键名的顺序
                String[] keys = {"nameSei", "nameMei", "nameSeiKana", "nameMeiKana", "alphLastname",
                        "alphFirstname", "country", "birthdate", "sex", "tel", "phone", "shokugyoCode", "kinmusakiName"};

                JSONObject response = new JSONObject();
                // 按照指定顺序添加键值对
                for (String key : keys) {
                    if (key.equals("nameSei")) {
                        response.put("nameSei", userFindResult.getNameSei());
                    } else if (key.equals("nameMei")) {
                        response.put("nameMei", userFindResult.getNameMei());
                    } else if (key.equals("nameSeiKana")) {
                        response.put("nameSeiKana", userFindResult.getNameSeiKana());
                    } else if (key.equals("nameMeiKana")) {
                        response.put("nameMeiKana", userFindResult.getNameMeiKana());
                    } else if (key.equals("alphLastname")) {
                        response.put("alphLastname", userFindResult.getAlphLastname());
                    } else if (key.equals("alphFirstname")) {
                        response.put("alphFirstname", userFindResult.getAlphFirstname());
                    } else if (key.equals("country")) {
                        response.put("country", userFindResult.getCountry());
                    } else if (key.equals("birthdate")) {
                        response.put("birthdate", userFindResult.getBirthdate());
                    } else if (key.equals("sex")) {
                        response.put("sex", userFindResult.getSex());
                    } else if (key.equals("tel")) {
                        response.put("tel", userFindResult.getTel());
                    } else if (key.equals("phone")) {
                        response.put("phone", userFindResult.getPhone());
                    } else if (key.equals("shokugyoCode")) {
                        response.put("shokugyoCode", userFindResult.getShokugyoCode());
                    }else if (key.equals("kinmusakiName")) {
                        response.put("kinmusakiName", userFindResult.getKinmusakiName());
                    }
                }
                return ResponseEntity.ok(response.toString());

            } catch (JSONException e) {
                e.printStackTrace();
                return ResponseEntity.badRequest().body("エラーが発生しました");
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"ユーザーが見つかりませんでした\"}");
            // return ResponseEntity.badRequest().body("ユーザーが見つかりません");

        }

    }

}

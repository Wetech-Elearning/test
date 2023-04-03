package com.spr.test.entity;

import lombok.Data;

@Data
public class Shienshinse {
    private Integer id; // 自動増加 (整数)									                    申込ID
    private String hisaijutakuShurui; // 選択リスト (文字列)									被災住宅の種類
    private String hisaijutakuShoyuu; // 選択リスト (文字列)									被災住宅の所有等
    private String higaiJokyo; // 選択リスト (文字列)									        被害状況
    private String higaiJokyoDaikiboHankaiOrHankai; // チェックボックス (真偽値)				被災住宅の修理が不能又は困難である
    private String bukken_Menseki; // 数値(5、0) (小数点前5桁、小数点以下0桁の実数)				敷地の面積（㎡）
    private String bukkenAddressTodofuken; // 選択リスト (文字列)								物件_敷地（所在地）_都道府県
    private String bukkenAddressShigun; // テキスト(255) (文字列)								物件_敷地（所在地）_市郡
    private String bukkenAddressChoson; // テキスト(255) (文字列)								物件_敷地（所在地）_町村
    private String bukkenAddressBanchi; // テキスト(255) (文字列)								物件_敷地（所在地）_番地
    private String bukkenAddressPostCode3; // テキスト(15) (文字列)							物件_敷地（所在地）_郵便番号
    private String bousaiSyudanItenJigyo; // チェックボックス									防災集団移転事業に係る住宅再建を行う
    private String bukkenShikichiNoShoyuKankei; // 選択リスト									敷地の所有関係
    private String bukken_Tatemono_Jutaku; // 数値(3,2)									    建物の床面積_住宅部分
    private String bukken_Tatemono_HiJutaku; // 数値(3,2)									建物の床面積_非住宅部分
    private String bukken_Kozo; // 選択リスト									                建物の構造（戸建形式）
    private String bukken_TatekataKodateKeishiki; // 選択リスト								建て方
    private String nyukyoYoteiDateYear; // 選択リスト									        入居予定年（年）
    private String nyukyoYoteiDateMonth; // 選択リスト									    入居予定月（月）
    private String jutakuYoto; // 選択リスト									                住宅の用途
    private String bukken_KojiKanryoDate_Year; // 選択リスト									物件_工事完了予定年月_年
    private String bukken_KojiKanryoDate_Month; // 選択リスト									物件_工事完了予定年月_月
    private String shikinDateTochiShikinYear; // 選択リスト									資金の受取予定年月_土地先行資金_年
    private String shikinDateTochiShikinMonth; // 選択リスト									資金の受取予定年月_土地先行資金_月
    private String shikinDateChukanShikinYear; // 選択リスト									資金の受取予定年月_中間資金_年
    private String shikinDateChukanShikinMonth; // 選択リスト									資金の受取予定年月_中間資金_月
    private String shikinDateSaishuShikinYear; // 選択リスト									資金の受取予定年月_最終資金_年
    private String shikinDateSaishuShikinMonth; // 選択リスト									資金の受取予定年月_最終資金_月
    private String kariireIninKaishaName; // テキスト(100)									会社名称
    private String chukaiHanbaiNameKana; // テキスト(100)									仲介業者又は販売代理_名称（カナ）
    private String chukaiHanbaiTantoshaNameMei; // テキスト(100)								仲介業者又は販売代理_担当者名_名
    private String chukaiHanbaiTantoshaNameSei; // テキスト(100)								仲介業者又は販売代理_担当者名_姓
    private String hiyouKensetsuHi; // 数値(5、0)									            建設費
    private String hiyouTochiSyotokuHi; // 数値(5、0)									        土地取得費
    private String hiyouTotal; // 数值(6、0)									                費用合計
    private String kariireGakuKingaku; // 数值(5、0)									        借入希望額_借入金額
    private String kariireGakuKinri; // 数值(1、2)									        借入希望額_金利
    private String kariireGakuHensaiKikan; // 数值(2、0)									    借入希望額_返済期間
    private String kariireGakuNenHensai12No1; // 数值(9、0)									    返済方法
    private String hensaiHouhou; // 选择列表									                借入希望額_年間返済額の1/12
    private String hisaiShinzokuDokyoAri; // 选择列表									        被災親族同居の有無
    private String sueokiKikanNoNensu; // 选择列表									            据置期間の年数
    private String sonotaName; // 文本(100)									                その他_借入先名称等
    private String sonotaKingaku; // 数值(5、0)									                その他_借入金額（万円）
    private String sonotaHensaiKikan; // 数值(2、0)									            その他_返済期間　（年）
    private String sonotaNenHensai12No1; // 数值(9、0)									        その他_年間返済額の1/12（円）
    private String sogoKingaku; // 数值(6、0)									                災害融資の借入希望額、その他の借入内容（万円）
    private String kinyuKikanName; // 文本(100)									            金融機関名
    private String shitemName; // 文本(100)									                支店名
}

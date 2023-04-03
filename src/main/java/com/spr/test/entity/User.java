package com.spr.test.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String nameSei; // 姓（漢字）
    private String nameMei; // 名（漢字）
    private String nameSeiKana; // セイ
    private String nameMeiKana; // メイ
    private String alphLastname;// 姓（ローマ字）
    private String alphFirstname;// 名（ローマ字）
    private String country;// 国籍
    private String birthdate;//生年月日
    private String sex; // 性別
    private String tel; // 電話番号
    private String phone; // 携帯電話
    private String shokugyoCode; // 職業
    private String kinmusakiName; // 勤務先




//    public String getNamesei() {
//        return namesei;
//    }
//
//    public void setNamesei(String namesei) {
//        this.namesei = namesei;
//    }
//
//    public String getNamemei() {
//        return namemei;
//    }
//
//    public void setNamemei(String namemei) {
//        this.namemei = namemei;
//    }
//
//    public String getNameseiKana() {
//        return nameseiKana;
//    }
//
//    public void setNameseiKana(String nameseiKana) {
//        this.nameseiKana = nameseiKana;
//    }
//
//    public String getNamemeiKana() {
//        return namemeiKana;
//    }
//
//    public void setNamemeiKana(String namemeiKana) {
//        this.namemeiKana = namemeiKana;
//    }
//
//    public String getAlphlastname() {
//        return alphlastname;
//    }
//
//    public void setAlphlastname(String alphlastname) {
//        this.alphlastname = alphlastname;
//    }
//
//    public String getAlphfirstname() {
//        return alphfirstname;
//    }
//
//    public void setAlphfirstname(String alphfirstname) {
//        this.alphfirstname = alphfirstname;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getBirthdate() {
//        return birthdate;
//    }
//
//    public void setBirthdate(String birthdate) {
//        this.birthdate = birthdate;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getDenwa() {
//        return denwa;
//    }
//
//    public void setDenwa(String denwa) {
//        this.denwa = denwa;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getShokugyocode() {
//        return shokugyocode;
//    }
//
//    public void setShokugyocode(String shokugyocode) {
//        this.shokugyocode = shokugyocode;
//    }
//
//    public String getKinmusakiname() {
//        return kinmusakiname;
//    }
//
//    public void setKinmusakiname(String kinmusakiname) {
//        this.kinmusakiname = kinmusakiname;
//    }
}

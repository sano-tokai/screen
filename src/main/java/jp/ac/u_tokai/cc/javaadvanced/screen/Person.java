package jp.ac.u_tokai.cc.javaadvanced.screen;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
 * 人の情報
 */
@Entity
public class Person implements Serializable {
    @Id
    @SequenceGenerator(name = "addressGenerator", sequenceName = "addressSequence")
    @GeneratedValue(generator = "addressGenerator")
    private Long id;
    private String name;
    /**
     * 氏名を取得する
     * @return 氏名
     */
    public String getName() {
        return name;
    }
    /**
     * 氏名を設定する
     * @param name 氏名
     */
    public void setName(String name) {
        this.name = name;
    }
    private int age;
    /**
     * 年齢を取得する
     * @return 年齢
     */
    public int getAge() {
        return age;
    }
    /**
     * 年齢を設定する
     * @param age 年齢
     */
    public void setAge(int age) {
        this.age = age;
    }
    private double weight;
    /**
     * 体重を取得する
     * @return 体重
     */
    public double getWeight() {
        return weight;
    }
    /**
     * 体重を設定する
     * @param weight 体重
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    private boolean friend;
    /**
     * 友達かどうかを取得する
     * @return true：友達である、false：友達でない
     */
    public boolean getFriend() {
        return friend;
    }
    /**
     * 友達かどうかを設定する
     * @param friend true：友達である、false：友達でない
     */
    public void setFriend(boolean friend) {
        this.friend = friend;
    }
}

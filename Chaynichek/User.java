package com.company;

import java.util.Objects;

public class User {

    public String name;
    public String nickname;
    public int age;

    public User(String name, String nickname, int age) {

        this.name = name;
        this.nickname = nickname;
        this.age = age;

    }

    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }

    public String getNickname() {

        return nickname;

    }

    public void setNickname(String nickname) {

        this.nickname = nickname;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        User user = (User) o;

        if(age == user.age && name.equals(user.name) && nickname.equals(user.nickname)){
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {

        return Objects.hash(name, nickname, age);

    }

}

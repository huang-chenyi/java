package Bilibili.C.MianXiangDuiXiang.javaBean.javaBean;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //Alt+Insert---构造函数---无选择自动生成空参
    //空参
    public User(){}
    //Alt+Insert---构造函数---ctrl+A全选---自动生成带全部参数的构造
    //带全部参数的构造
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //Alt+Insert---Getters and Setters---ctrl+A全选---可自动生成get and set方法
    //get和set方法
    public String getUsername() {
        return username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


}

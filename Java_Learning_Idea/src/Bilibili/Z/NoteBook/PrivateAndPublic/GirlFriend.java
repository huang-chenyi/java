package Bilibili.Z.NoteBook.PrivateAndPublic;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    //age
    public void setAge(int age) {
        if(age >= 18 && age <= 24){
            this.age = age;
        }
        else{
            System.out.println("非法参数");
        }
    }
    public int getAge () {
        return age;
    }
    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender () {
        return gender;
    }

    public void sleep() {
        System.out.println("睡觉");
    }
    public void eat() {
        System.out.println("吃饭");
    }


}

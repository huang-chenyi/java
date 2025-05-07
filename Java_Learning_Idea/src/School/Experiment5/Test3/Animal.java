package School.Experiment5.Test3;
//Animal.java
public abstract class Animal implements Talent {
    private StringBuilder id;
    private String type;

    public Animal() {
    }
    public Animal(StringBuilder id, String type) {
        this.id = id;
        this.type = type;
    }
    public StringBuilder getId() {
        return id;
    }
    public void setId(StringBuilder id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public abstract void showTalent();

    public void showMessage() {
        System.out.println("编号：" + getId());
        System.out.println("类别：" + getType());
    }
}

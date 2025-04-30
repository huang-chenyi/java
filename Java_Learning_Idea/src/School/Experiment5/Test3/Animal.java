package School.Experiment5.Test3;

public abstract class Animal implements Talent {
    private String id;
    private String type;


    public Animal() {
    }
    public Animal(String id, String type) {
        this.id = id;
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public abstract void showTalent();

    public void showMessage() {
        System.out.println(getId() + " " + getType());
    }
}

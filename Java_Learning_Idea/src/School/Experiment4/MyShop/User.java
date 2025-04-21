package School.Experiment4.MyShop;

class User {
    private String username;
    private String password;
    private int points;
    private double balance;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
        this.balance = 10000; // 初始余额
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public double getBalance() {
        return balance;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

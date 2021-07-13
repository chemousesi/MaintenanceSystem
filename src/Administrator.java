public class Administrator {

    private String ID;
    private String name;
    private boolean loginStatus;
    private String passWord;

    public Administrator(String name, String ID, String passWord) {
        this.name = name;
        this.passWord = passWord;
        this.ID = ID;
    }

    public boolean checkLogin(String ID, String passWord) {
        if (this.ID.equals(ID) && this.passWord.equals(passWord)) {
            login();
            return true;
        } else
            return false;
    }

    public boolean login() {
        this.loginStatus = true;
        return true;
    }

}

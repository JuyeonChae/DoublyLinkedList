public abstract class Data {
    // abstract class is a class that is not filled in (cannot instantiate) and forces override to its subclasses

    /* ID & password organizer */

    protected String ID;
    protected String password;
    protected String website;

    public Data () {}

    public Data (String ID, String password, String website) {
        this.ID = ID;
        this.password = password;
        this.website = website;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return ID + " " + password + " " + website;
    }
}

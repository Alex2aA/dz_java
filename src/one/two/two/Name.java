package one.two.two;

public class Name {
    public String firstName;
    public String secondName;
    public String thirdName;

    public Name(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String toString() {
        String res = "";
        if(secondName != null) res+=secondName + " ";
        if(firstName != null) res+=firstName + " ";
        if(thirdName != null) res+=thirdName + " ";
        return res;
    }

}

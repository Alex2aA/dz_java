package one.two.two;

public class Name {
    private String firstName;
    private String secondName;
    private String thirdName;

    public Name(String firstName, String secondName, String thirdName) {
        if(firstName == null && secondName == null && thirdName == null) throw new IllegalArgumentException("Все поля null");
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String toString() {
        String res = "";
        if(secondName != null) res+=secondName + " ";
        if(firstName != null) res+=firstName + " ";
        if(thirdName != null) res+=thirdName + " ";
        return res;
    }

}

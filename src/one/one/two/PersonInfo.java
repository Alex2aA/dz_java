package one.one.two;

import one.two.two.Name;

public class PersonInfo {
    private Name name;
    private int height;
    private PersonInfo dad;

    public PersonInfo(Name name, int height, PersonInfo dad) {
        this.name = name;
        this.height = height;
        this.dad = dad;
    }

    public String toString() {
        String res = "";
        String firstName = name.getFirstName();
        String secondName = this.name.getSecondName();
        String thirdName = this.name.getThirdName();
        if(secondName != null && thirdName != null) res += secondName + " " + firstName + " " + thirdName + " ";
        else {
            if(secondName == null) res += dad.name.getSecondName() + " ";
            res += this.name.getFirstName() + " ";
            if(this.name.getThirdName() == null) res += dad.name.getThirdName() + "ович" + " ";
            else res += this.name.getThirdName() + " ";
        }
        return res;
    }
}
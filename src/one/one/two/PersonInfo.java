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
        if(name.secondName != null && name.thirdName != null) res += name.secondName + " " + name.firstName + " " + name.thirdName + " ";
        else {
            if(name.secondName == null) res += dad.name.secondName + " ";
            res += name.firstName + " ";
            if(name.thirdName == null) res += dad.name.thirdName + "ович" + " ";
            else res += name.thirdName + " ";
        }
        return res;
    }
}
package one.two.two;
import one.one.two.PersonInfo;

public class Main {
    public static void main(String[] args) {
        Name alex = new Name("Alex", null, "Vitalevich");
        Name dadAlex = new Name("Vitalii", "Zotov", "Petrovich");
        PersonInfo personDadAlex = new PersonInfo(dadAlex, 184, null);
        PersonInfo personAlex = new PersonInfo(alex, 186, personDadAlex);

        System.out.println(personAlex);
    }
}

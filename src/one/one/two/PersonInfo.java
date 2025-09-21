package one.one.two;

class PersonInfo {
    private String name;
    private int height;

    public PersonInfo(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getTextRepresentation() {
        return name + ". рост: " + height;
    }
}
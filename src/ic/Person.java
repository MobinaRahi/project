package ic;

public class Person {
    private String name;
    private String family;

    public Person(String name,String family) {
        this.name=name;
        this.family=family;
        System.out.println("+++created");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public String getFamily() {
        return family;
    }



    @Override
    public String toString (){
        return name + " " + family;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("---deleted");
    }
}

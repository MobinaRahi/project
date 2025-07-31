package mft.diagram;

public class Main {
    public static void main(String[] args) {
        PersonParentClass personParentClass = new PersonParentClass(1,"mobina","rahi","09023335739","031264276",12.5F);
        System.out.println(personParentClass);

        CustomerFinal customerFinal=new CustomerFinal("mm@gmail.com","user","00");
        System.out.println(customerFinal);

        Employee employee=new Employee(12.5,13.5,14.5);
        System.out.println(employee);

        Supplier supplier=new Supplier("mmm","mmmm","mmm");
        System.out.println(supplier);
    }
}

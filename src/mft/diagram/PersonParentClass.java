package mft.diagram;
public class PersonParentClass {
    public int discount;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String personID;
    public float fullPriceReceipt;
    public PersonParentClass() {
    }
    public PersonParentClass(int discount, String firstName, String lastName, String phoneNumber, String personID, float fullPrinceReceipt) {
        this.discount = discount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.personID = personID;
        this.fullPriceReceipt = fullPrinceReceipt;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPersonID() {
        return personID;
    }
    public void setPersonID(String personID) {
        this.personID = personID;
    }
    public float getFullPriceReceipt() {
        return fullPriceReceipt;
    }
    public void setFullPriceReceipt(float fullPriceReceipt) {
        this.fullPriceReceipt = fullPriceReceipt;
    }
    @Override
    public String toString() {
        return "PersonParentClass{" +
                "discount=" + discount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", personID='" + personID + '\'' +
                ", fullPrinceReceipt=" + fullPriceReceipt +
                '}';
    }
}

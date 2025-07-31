package mft.diagram;

public class CustomerFinal {
    private String emailAddress;
    public String customerType;
    public String dob;
    public int discount;

    public CustomerFinal(){

    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public CustomerFinal(String emailAddress, String customerType, String dob) {
        this.emailAddress = emailAddress;
        this.customerType = customerType;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "customerType=" + customerType + ", dob=" + dob + ", discount=" + discount ;
    }
}

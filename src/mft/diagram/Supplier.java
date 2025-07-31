package mft.diagram;

public class Supplier {
    private String companyName;
    public String supplierStatus;
    private String suppLocation;
    private int discount;

    public Supplier() {
    }
    public Supplier(String companyName, String supplierStatus, String suppLocation) {
        this.companyName = companyName;
        this.supplierStatus = supplierStatus;
        this.suppLocation = suppLocation;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getSupplierStatus() {
        return supplierStatus;
    }
    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }
    public String getSuppLocation() {
        return suppLocation;
    }
    public void setSuppLocation(String suppLocation) {
        this.suppLocation = suppLocation;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "Supplier{" +
                "companyName='" + companyName + '\'' +
                ", supplierStatus='" + supplierStatus + '\'' +
                ", suppLocation='" + suppLocation + '\'' +
                ", discount=" + discount +
                '}';
    }
}

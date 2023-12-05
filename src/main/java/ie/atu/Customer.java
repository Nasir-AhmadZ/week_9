package ie.atu;

public class Customer extends Person{
    private String CustomerNumber;
    private boolean mailingList;

    public Customer() {

    }

    public Customer(String name, String address, String phone, String customerNumber, boolean mailingList) {
        super(name, address, phone);
        CustomerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }


    @Override
    public String toString() {

        return "Customer{" +super.toString() +
                "CustomerNumber='" + CustomerNumber + '\'' +
                ", mailingList=" + mailingList +" "+
                '}';
    }
}

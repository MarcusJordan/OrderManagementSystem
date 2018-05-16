package com.company;

public class Customer {

    private long CustomerID;
    private String fname, lname;
    private boolean member;
    private String email;

    public Customer(long customerID, String fname, String lname, boolean member, String email) {
        CustomerID = customerID;
        this.fname = fname;
        this.lname = lname;
        this.member = member;
        this.email = email;
    }

    public void setCustomerID(long customerID) {
        CustomerID = customerID;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCustomerID() {
        return CustomerID;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public boolean isMember() {
        return member;
    }

    public String getEmail() {
        return email;
    }
}

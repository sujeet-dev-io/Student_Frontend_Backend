package com.entity;

public class Student {
    private int id;
    private String fullName;
    private String dob;
    private String address;
    private String qualification;
    private String email;

    public Student() {
        super();

    }

    public Student(String fullName, String dob, String address, String qualification, String email) {
        super();
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.qualification = qualification;
        this.email = email;
    }

    public Student(int id, String fullName, String dob, String address, String qualification, String email) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.qualification = qualification;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", address=" + address
                + ", qualification=" + qualification + ", email=" + email + "]";
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

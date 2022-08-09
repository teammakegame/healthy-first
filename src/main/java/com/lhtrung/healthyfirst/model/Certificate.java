//package com.lhtrung.healthyfirst.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Certificate")
//public class Certificate {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "Status", nullable = false)
//    private boolean status;
//
//    @Column(name = "IssueDate", nullable = false)
//    private String issueDate;
//
//    @Column(name = "ExpireDate", nullable = false)
//    private String expireDate;
//
//    @Column(name = "TypeOfCertificate", nullable = false)
//    private boolean typeOfCertificate;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public String getIssueDate() {
//        return issueDate;
//    }
//
//    public void setIssueDate(String issueDate) {
//        this.issueDate = issueDate;
//    }
//
//    public String getExpireDate() {
//        return expireDate;
//    }
//
//    public void setExpireDate(String expireDate) {
//        this.expireDate = expireDate;
//    }
//
//}

//package com.lhtrung.healthyfirst.domain.model;
//
//import net.bytebuddy.dynamic.loading.InjectionClassLoader;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="Facility")
//public class Facility {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "Name", nullable = false)
//    private String name;
//
//    @Column(name = "Address", nullable = false)
//    private String address;
//
//    @Column(name = "Phone", nullable = false)
//    private String phone;
//
//    @Column(name = "BusinessType", nullable = false)
//    private boolean businessType;
//
//    @Column(name = "Status", nullable = false)
//    private boolean status;
//
//    @OneToOne
//    @JoinColumn(name = "Certificate1_id", nullable = true)
//    private Certificate certificate1Id;
//
//    @OneToOne
//    @JoinColumn(name = "Certificate2_id", nullable = true)
//    private Certificate certificate2Id;
//
//    @ManyToOne
//    @JoinColumn(name = "Area_id", nullable = false)
//    private Area areaId;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public boolean isBusinessType() {
//        return businessType;
//    }
//
//    public void setBusinessType(boolean businessType) {
//        this.businessType = businessType;
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
//    public Certificate getCertificate1Id() {
//        return certificate1Id;
//    }
//
//    public void setCertificate1Id(Certificate certificate1Id) {
//        this.certificate1Id = certificate1Id;
//    }
//
//    public Certificate getCertificate2Id() {
//        return certificate2Id;
//    }
//
//    public void setCertificate2Id(Certificate certificate2Id) {
//        this.certificate2Id = certificate2Id;
//    }
//
//    public Area getAreaId() {
//        return areaId;
//    }
//
//    public void setAreaId(Area areaId) {
//        this.areaId = areaId;
//    }
//}

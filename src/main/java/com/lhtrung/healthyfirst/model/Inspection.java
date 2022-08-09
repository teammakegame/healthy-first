//package com.lhtrung.healthyfirst.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Inspection")
//public class Inspection {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "Start", nullable = false)
//    private String start;
//
//    @Column(name = "End", nullable = false)
//    private String end;
//
//    @Column(name = "Status", nullable = false)
//    private boolean status;
//
//    @Column(name = "Result", nullable = true)
//    private boolean result;
//
//    @Column(name = "Review", nullable = true)
//    private String review;
//
//    @Column(name = "Punishment", nullable = true)
//    private String punishment;
//
//    @OneToOne
//    @JoinColumn(name = "Evidence", nullable = false)
//    private Evidence evidenceId;
//
//    @ManyToOne
//    @JoinColumn(name = "Facility_id", nullable = false)
//    private Facility facilityId;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getStart() {
//        return start;
//    }
//
//    public void setStart(String start) {
//        this.start = start;
//    }
//
//    public String getEnd() {
//        return end;
//    }
//
//    public void setEnd(String end) {
//        this.end = end;
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
//    public boolean isResult() {
//        return result;
//    }
//
//    public void setResult(boolean result) {
//        this.result = result;
//    }
//
//    public String getReview() {
//        return review;
//    }
//
//    public void setReview(String review) {
//        this.review = review;
//    }
//
//    public String getPunishment() {
//        return punishment;
//    }
//
//    public void setPunishment(String punishment) {
//        this.punishment = punishment;
//    }
//
//    public Facility getFacilityId() {
//        return facilityId;
//    }
//
//    public void setFacilityId(Facility facilityId) {
//        this.facilityId = facilityId;
//    }
//
//    public Evidence getEvidenceId() {
//        return evidenceId;
//    }
//
//    public void setEvidenceId(Evidence evidenceId) {
//        this.evidenceId = evidenceId;
//    }
//}

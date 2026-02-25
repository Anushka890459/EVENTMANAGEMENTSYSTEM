package com.example.EVENTMANAGEMENT.MODEL;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membershipNumber;

    @NotBlank(message = "Vendor Name is mandatory")
    private String vendorName;

    private String duration = "6 months";

    public Long getMembershipNumber() { return membershipNumber; }
    public void setMembershipNumber(Long membershipNumber) { this.membershipNumber = membershipNumber; }
    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
}

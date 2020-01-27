package com.koroka.herokuIntegration.data.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "vessel__c", schema="salesforce")
@Entity
public class Vessel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Column(name = "createddate")
    String createdDate;

    @Column(name = "isdeleted")
    Boolean deleted;

    @Column(name = "name")
    String name;

    @Column(name = "systemmodstamp")
    String modifiedDate;

    @Column(name = "cargocapacity__c")
    String cargoCapacity;

    @Column(name = "vesselname__c")
    String vesselName;

    @Column(name = "sfid")
    String salesforceId;

    @Column(name = "_hc_lastop")
    String lastOp;

    @Column(name = "_hc_err")
    String error;
}

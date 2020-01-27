package com.koroka.herokuIntegration.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Table(name = "vessel__c", schema="salesforce")
@Entity
public class Vessel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "createddate")
    Date createdDate;

    @Column(name = "isdeleted")
    Boolean deleted;

    @Column(name = "name")
    String name;

    @Column(name = "systemmodstamp")
    Date modifiedDate;

    @Column(name = "cargocapacity__c")
    Double cargoCapacity;

    @Column(name = "vesselname__c")
    String vesselName;

    @Column(name = "sfid")
    String salesforceId;

    @Column(name = "_hc_lastop")
    String lastOp;

    @Column(name = "_hc_err")
    String error;
}

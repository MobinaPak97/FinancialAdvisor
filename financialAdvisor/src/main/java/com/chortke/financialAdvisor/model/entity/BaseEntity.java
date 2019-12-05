package com.chortke.financialAdvisor.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RevisionNumber;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Data
@MappedSuperclass
@Audited(withModifiedFlag = false)
public abstract class BaseEntity implements Serializable {

    @Column(name = "CREATED_BY", length = 40)
    private String createdBy;

    @Column(name = "UPDATED_BY", length = 40)
    private String updatedBy;

    @Column(name = "CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Version
    @Column(name = "VERSION", nullable = false)
    @RevisionNumber
    private Long version;

}


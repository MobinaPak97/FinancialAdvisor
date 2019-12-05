package com.chortke.financialAdvisor.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Data
public abstract class BaseDto implements Serializable {
    private String createdBy;
    private String updatedBy;
    private Date createdAt;
    private Date updatedAt;
    private Long version;
}


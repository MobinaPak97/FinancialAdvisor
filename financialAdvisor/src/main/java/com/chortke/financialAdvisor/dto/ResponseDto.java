package com.chortke.financialAdvisor.dto;

import com.chortke.financialAdvisor.enums.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto<T> {

    private ResponseStatus responseStatus;
    private T response;
    private String msg;

}

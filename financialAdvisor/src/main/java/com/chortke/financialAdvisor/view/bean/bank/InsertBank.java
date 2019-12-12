/*
package com.chortke.financialAdvisor.view.bean.bank;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@Component
@Scope("view")
@Data
public class InsertBank implements Serializable {

    public void insert() {
        try {
            userDTO.setUserName(customerDTO.getCostumerId());
            customerProxy.insert(new TwoParameterWrapper<>(customerDTO, userDTO));
        } catch (BaseException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, e.getMessage(), ""));
        }
    }
}
*/

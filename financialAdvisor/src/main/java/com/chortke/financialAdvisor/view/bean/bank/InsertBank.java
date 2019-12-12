package com.chortke.financialAdvisor.view.bean.bank;

import com.chortke.financialAdvisor.dto.BankDto;
import com.chortke.financialAdvisor.exception.BaseServerException;
import com.chortke.financialAdvisor.service.IBankService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@Component
@Scope("view")
@Data
@NoArgsConstructor
public class InsertBank implements Serializable {

    @Autowired
    private IBankService bankService;

    private BankDto bankDto = new BankDto();

    public void insert() {
        try {
            bankService.insert(bankDto);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "ثبت بانک با موفقیت انجام شد" , ""));
        } catch (BaseServerException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, e.getMessage(), ""));
        }
    }
}

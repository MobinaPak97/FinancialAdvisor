package com.chortke.financialAdvisor.facade;/*
package com.chortke.financialAdvisor.facade;

import ir.alzahra.offerBaz.dto.BankDTO;
import ir.alzahra.offerBaz.dto.ProductDTO;
import ir.alzahra.offerBaz.exception.BaseException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

*/
/**
 * @Author: Mobina Pak
 * @Date: 5/3/2019
 **//*

public interface IOfferFacade {

    @Transactional(rollbackFor = Exception.class)
    void insertBank(BankDto bankDTO) throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    List<BankDto> getAllBanks()throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    void updateBank(BankDto bankDTO)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    BankDto findBankByName(String bankName)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    Object findProductByCode(String trackingCode)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    void updateProduct(ProductDTO productDTO)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    void deleteProduct(ProductDTO productDTO)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    String findBankByAbbreviation(String name)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    List<ProductDTO> searchProductByParam(Long param)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    List<BankDto> searchBankByParam(String bankName)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    void deleteBank(BankDto bankDTO)throws BaseException;

    @Transactional(rollbackFor = Exception.class)
    void editBankInfo(BankDto bankDTO)throws BaseException;
}
*/

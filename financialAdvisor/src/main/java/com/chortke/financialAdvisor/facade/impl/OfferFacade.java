package com.chortke.financialAdvisor.facade.impl;/*
package com.chortke.financialAdvisor.facade.impl;

import ir.alzahra.offerBaz.control.IOfferService;
import ir.alzahra.offerBaz.dto.BankDTO;
import ir.alzahra.offerBaz.dto.ProductDTO;
import ir.alzahra.offerBaz.enums.DtoState;
import ir.alzahra.offerBaz.exception.BaseException;
import ir.alzahra.offerBaz.facade.IOfferFacade;
import ir.alzahra.offerBaz.facade.mapper.MapperClass;
import ir.alzahra.offerBaz.model.entity.BankEntity;
import ir.alzahra.offerBaz.model.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

*/
/**
 * @Author: Mobina Pak
 * @Date: 5/3/2019
 **//*

@Service
public class OfferFacade implements IOfferFacade {

    @Autowired
    private IOfferService offerService;


    @Override
    public void insertBank(BankDto bankDTO) throws BaseException {
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(), bankDTO);
        offerService.insertBank(bankEntity);
    }

    @Override
    public List<BankDto> getAllBanks() throws BaseException {
        List<BankEntity> bankEntities = offerService.getAllBanks();
        List<BankDto> bankDTOS = new ArrayList<>();
        if (Objects.nonNull(bankEntities) && bankEntities.size() != 0) {
            for (BankEntity b : bankEntities
                    ) {
                bankDTOS.add(MapperClass.mapper(new BankDto(), b));

            }
        }
        return bankDTOS;
    }

    @Override
    public void updateBank(BankDto bankDTO) throws BaseException {
        String trackCode = "";
        List<ProductDTO> productDTOS = bankDTO.getProducts();
        for (ProductDTO p : productDTOS
                ) {
            if (p.getDtoState().equals(DtoState.New)) {
                if (Objects.isNull(p.getProductName()) || Objects.equals(p.getProductName(), ""))
                    throw new BaseException("product.insert.nullName");
                if (Objects.isNull(p.getDescription()) || Objects.equals(p.getDescription(), ""))
                    throw new BaseException("product.insert.nullDescription");
                offerService.checkExistProduct(p.getProductName());
                trackCode = offerService.generateUniqueCode(bankDTO.getNameAbbreviation());
                p.setUniqueCode(trackCode);
            }
        }
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(), bankDTO);
        offerService.updateBank(bankEntity, trackCode);
    }

    @Override
    public BankDto findBankByName(String bankName) throws BaseException {
        BankEntity bank = offerService.findBankByName(bankName);
        return MapperClass.mapper(new BankDto(), bank);
    }

    @Override
    public Object findProductByCode(String trackingCode) throws BaseException {
        ProductEntity p = offerService.findProductByCode(trackingCode);
        return MapperClass.mapper(new ProductDTO(), p);
    }

    @Override
    public void updateProduct(ProductDTO productDTO) throws BaseException {
        ProductEntity productEntity = MapperClass.mapper(new ProductEntity(), productDTO);
        offerService.updateProduct(productEntity);
    }

    @Override
    public void deleteProduct(ProductDTO productDTO) throws BaseException {
        ProductEntity productEntity = MapperClass.mapper(new ProductEntity(), productDTO);
        offerService.deleteProduct(productEntity);
    }

    @Override
    public String findBankByAbbreviation(String name) throws BaseException {
        return offerService.findBankByAbbreviation(name);
    }

    @Override
    public List<ProductDTO> searchProductByParam(Long param) throws BaseException {
        List<ProductEntity> products = offerService.searchProductByParam(param);
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (ProductEntity p : products
                ) {
            productDTOS.add(MapperClass.mapper(new ProductDTO(), p));
        }
        return productDTOS;
    }

    @Override
    public List<BankDto> searchBankByParam(String bankName) throws BaseException {
        List<BankEntity> bankEntities = offerService.searchBankByParam(bankName);
        List<BankDto> banks = new ArrayList<>();
        for (BankEntity b : bankEntities) {
            banks.add(MapperClass.mapper(new BankDto(), b));
        }
        return banks;
    }

    @Override
    public void deleteBank(BankDto bankDTO) throws BaseException {
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(), bankDTO);
        offerService.deleteBank(bankEntity);
    }

    @Override
    public void editBankInfo(BankDto bankDTO) throws BaseException {
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(), bankDTO);
        offerService.editBankInfo(bankEntity);
    }
}
*/

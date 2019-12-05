package com.chortke.financialAdvisor.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/
@NamedQueries(
        {
                @NamedQuery(
                        name = "findProductByCode",
                        query = "from ProductEntity p where p.uniqueCode=:productCode"
                ),
                @NamedQuery(
                        name = "findProductByName",
                        query = "from ProductEntity p where p.productName=:name1"
                )
        }
)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="FA_PRODUCT")
public class ProductEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String productName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UNIQUE_CODE")
    private String uniqueCode;
}

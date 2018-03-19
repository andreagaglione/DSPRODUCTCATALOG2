package org.tmf.dsmapi.catalog.entity.agreement;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import org.tmf.dsmapi.catalog.resource.CatalogEntityId;
import org.tmf.dsmapi.catalog.resource.product.ProductOfferingTerm;

/**
 *
 * @author pierregauthier
 *
 */
@Entity
@IdClass(CatalogEntityId.class)
@Table(name = "CRI_PRODUCT_OFFERING_R_OFFERING_TERM")
public class ProductOfferingTermEntity extends ProductOfferingTerm implements Serializable {
    private final static long serialVersionUID = 1L;

    public ProductOfferingTermEntity() {
    }

}
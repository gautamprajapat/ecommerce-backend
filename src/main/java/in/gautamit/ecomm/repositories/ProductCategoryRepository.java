package in.gautamit.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.gautamit.ecomm.entities.ProductCategory;


@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Long>{
	
	
		
	

}

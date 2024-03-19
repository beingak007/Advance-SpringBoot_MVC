package in.akash.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.config.model.product.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}

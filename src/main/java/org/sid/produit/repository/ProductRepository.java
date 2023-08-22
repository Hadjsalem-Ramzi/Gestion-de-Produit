package org.sid.produit.repository;

import org.sid.produit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByPriceGreaterThanEqual(double price);

    List<Product> findByNameContains(String mc);
@Query("select p from Product p where p.name like :x ")
List<Product> search(@Param("x")String mc);
    @Query("select p from Product p where p.price>:x ")
    List<Product> searchByPrice(@Param("x") double price);
}

package br.com.henrique.book_store_api.repository;

import br.com.henrique.book_store_api.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Integer> {
}

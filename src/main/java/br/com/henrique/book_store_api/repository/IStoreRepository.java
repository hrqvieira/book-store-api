package br.com.henrique.book_store_api.repository;

import br.com.henrique.book_store_api.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStoreRepository extends JpaRepository<Store, Integer> {
}

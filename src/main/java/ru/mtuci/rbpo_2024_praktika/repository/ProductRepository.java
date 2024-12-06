package ru.mtuci.rbpo_2024_praktika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbpo_2024_praktika.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Можно добавить кастомные методы, если нужно
}

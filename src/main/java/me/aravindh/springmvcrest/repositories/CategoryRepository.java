package me.aravindh.springmvcrest.repositories;

import me.aravindh.springmvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}

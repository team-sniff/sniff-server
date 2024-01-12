package server.acode.domain.ingredient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.acode.domain.ingredient.entity.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>, IngredientRepositoryCustom {

    public Ingredient findByKorName(String korName);
}

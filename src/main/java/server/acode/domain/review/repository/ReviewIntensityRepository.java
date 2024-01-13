package server.acode.domain.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import server.acode.domain.fragrance.entity.Fragrance;
import server.acode.domain.review.entity.ReviewIntensity;

import java.util.Optional;

@Repository
public interface ReviewIntensityRepository extends JpaRepository<ReviewIntensity, Long> {
    Optional<ReviewIntensity> findByFragrance(Fragrance fragrance);

    @Modifying
    @Query(nativeQuery = true,
            value = "INSERT INTO review_intensity(fragrance_id, created_at, modified_at) VALUE (:fragranceId, \"2024-01-01 00:00:00\", \"2024-01-01 00:00:00\")")
    void insertStatistics(@Param("fragranceId") Long fragranceId);
}

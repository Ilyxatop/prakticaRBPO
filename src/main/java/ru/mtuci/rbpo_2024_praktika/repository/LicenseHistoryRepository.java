package ru.mtuci.rbpo_2024_praktika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbpo_2024_praktika.model.LicenseHistory;

@Repository
public interface LicenseHistoryRepository extends JpaRepository<LicenseHistory, Long> {
}

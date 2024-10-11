package sd_48.datn.repository.SanPham.AllGiayTheThao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.DeGiay;

import java.util.UUID;

@Repository
public interface DeGiayRepository extends JpaRepository<DeGiay, UUID> {

    Page<DeGiay> findByTenDeGiayContaining(String ten, Pageable pageable);

}

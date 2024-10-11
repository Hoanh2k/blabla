package sd_48.datn.repository.SanPham.AllGiayTheThao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.TrongLuong;

import java.util.List;
import java.util.UUID;

@Repository
public interface TrongLuongRepository extends JpaRepository<TrongLuong, UUID> {

    List<TrongLuong> findByTenTrongLuongContainingOrderById(String tenTrongLuong);

}

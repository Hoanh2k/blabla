package sd_48.datn.repository.SanPham.AllGiayTheThao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.GiayTheThao;
import sd_48.datn.model.MauSac;

import java.util.List;
import java.util.UUID;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, UUID> {

    @Query("select ms from MauSac ms where ms.id = ?1")
    MauSac getMauSacById(UUID id);

    Page<MauSac> findByTrangThai(int trangThai, Pageable pageable);

    List<MauSac> findByTenMauSac(String tenMauSac);

    @Query("select distinct gttct.mauSac from GiayTheThaoChiTiet gttct where gttct.giayTheThao =:gtt")
    List<MauSac> findByGtt(GiayTheThao gtt);
}

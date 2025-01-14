package sd_48.datn.repository.BanHang;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.GioHang;

import java.util.List;
import java.util.UUID;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang, UUID> {


    @Query("SELECT gh FROM GioHang gh WHERE gh.khachHang.id = :khachHangId")
    GioHang findByKhachHangId(UUID khachHangId);

    //Tìm kiếm khách hàng theo id
    @Query("SELECT gh.id FROM GioHang gh WHERE gh.khachHang.id = :idKhachHang")
    UUID findGioHangIdByKhachHangId(@Param("idKhachHang") UUID idKhachHang);

    List<GioHang> findByKhachHang_Id(UUID khachHangId);



}

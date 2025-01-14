package sd_48.datn.repository.SanPham.GiayTheThao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.GiayTheThao;

import java.util.List;
import java.util.UUID;

@Repository
public interface GiayTheThaoRepository extends JpaRepository<GiayTheThao, UUID> {

    @Query("select giayTheThao from  GiayTheThao  giayTheThao where  giayTheThao.id = ?1")
    GiayTheThao getGiayTheThaoById(UUID id);
    List<GiayTheThao> findByTrangThai(int trangthai);
    Page<GiayTheThao> findByTrangThai (int trangThai, Pageable pageable);

    //Tìm kiếm tên giầy thể thao
    List<GiayTheThao> findByTenGiayTheThao(String tenGiayTheThao);

    @Query("SELECT giay\r\n" + //
            "FROM GiayTheThao giay\r\n" + //
            "WHERE giay.id NOT IN (\r\n" + //
            "    SELECT giayCT.id\r\n" + //
            "    FROM ChuongTrinhGiamGiaChiTietGiayTheThao ct\r\n" + //
            "    JOIN ct.giayTheThao giayCT\r\n" + //
            "    JOIN ct.chuongTrinhGiamGiaGiayTheThao chuongTrinh\r\n" + //
            "    WHERE chuongTrinh.trangThai != -1\r\n" + //
            ")")
    List<GiayTheThao> getAllWithoutInCTGGCTSP();

    @Query("select count(gtt) from GiayTheThao gtt where gtt in (select ctgg.giayTheThao from ChuongTrinhGiamGiaChiTietGiayTheThao ctgg where ctgg.trangThai !=-1)")
    int countGttInCtgg();


}

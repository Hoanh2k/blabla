package sd_48.datn.repository.ChuongTrinhGiamGia;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.ChuongTrinhGiamGiaChiTietGiayTheThao;
import sd_48.datn.model.ChuongTrinhGiamGiaGiayTheThao;
import sd_48.datn.model.GiayTheThao;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChuongTrinhGiamGiaChiTietGiayTheThaoRepository extends JpaRepository<ChuongTrinhGiamGiaChiTietGiayTheThao, UUID> {

    List<ChuongTrinhGiamGiaChiTietGiayTheThao> findAllByChuongTrinhGiamGiaGiayTheThao(ChuongTrinhGiamGiaGiayTheThao gg);

    @Query("Delete FROM ChuongTrinhGiamGiaChiTietGiayTheThao gg WHERE gg.chuongTrinhGiamGiaGiayTheThao.id = :gg and gg.giayTheThao.id = :gtt")

    void deleteByChuongTrinhGiamGiaGiayTheThaoAndGiayTheThao(@Param("gg") UUID gg, @Param("gtt") UUID gtt);

    ChuongTrinhGiamGiaChiTietGiayTheThao findByChuongTrinhGiamGiaGiayTheThaoAndGiayTheThao(ChuongTrinhGiamGiaGiayTheThao gg, GiayTheThao gtt);

    List<ChuongTrinhGiamGiaChiTietGiayTheThao> findByGiayTheThao_Id(UUID idGiayTheThao);

//    List<ChuongTrinhGiamGiaChiTietGiayTheThao> findByChuongTrinhGiamGia_Id(UUID idChuongTrinhGiamGia);

    ChuongTrinhGiamGiaChiTietGiayTheThao findByGiayTheThao(GiayTheThao gtt);

    @Query("SELECT ctgg.giayTheThao  from ChuongTrinhGiamGiaChiTietGiayTheThao ctgg where  ctgg.trangThai <> -1 and ctgg.chuongTrinhGiamGiaGiayTheThao =:gg")
    List<GiayTheThao> findAllGiayTheThaobyChuongTrinhGiamGia(@Param("gg") ChuongTrinhGiamGiaGiayTheThao gg);
}

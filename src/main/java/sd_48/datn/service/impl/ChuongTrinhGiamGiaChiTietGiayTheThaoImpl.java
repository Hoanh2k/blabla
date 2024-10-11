package sd_48.datn.service.impl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sd_48.datn.model.ChuongTrinhGiamGiaChiTietGiayTheThao;
import sd_48.datn.model.ChuongTrinhGiamGiaGiayTheThao;
import sd_48.datn.model.GiayTheThao;

import java.util.List;
import java.util.UUID;

public interface ChuongTrinhGiamGiaChiTietGiayTheThaoImpl {

    public void add(ChuongTrinhGiamGiaChiTietGiayTheThao gg);
    public void update(ChuongTrinhGiamGiaChiTietGiayTheThao gg, UUID id);
    public void deleteByCTGGandGTT(UUID gg, UUID gtt);
    public List<ChuongTrinhGiamGiaChiTietGiayTheThao> getAllByCTGG(ChuongTrinhGiamGiaGiayTheThao gg);
    public List<ChuongTrinhGiamGiaChiTietGiayTheThao> getList();
    public Page<ChuongTrinhGiamGiaChiTietGiayTheThao> pagination(Pageable pageable);
    public ChuongTrinhGiamGiaChiTietGiayTheThao getByCTGGAndGTT(ChuongTrinhGiamGiaGiayTheThao gg, GiayTheThao gtt);
    public void deleteById(UUID id);

}

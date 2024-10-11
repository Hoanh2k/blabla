package sd_48.datn.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_48.datn.model.ChuongTrinhGiamGiaChiTietHoaDon;
import sd_48.datn.model.ChuongTrinhGiamGiaHoaDon;
import sd_48.datn.model.HoaDon;
import sd_48.datn.repository.ChuongTrinhGiamGia.ChuongTrinhGiamGiaChiTietHoaDonRepository;
import sd_48.datn.service.HoaDon.HoaDonService;
import sd_48.datn.service.impl.ChuongTrinhGiamGiaChiTietHoaDonImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class ChuongTrinhGiamGiaChiTietHoaDonService implements ChuongTrinhGiamGiaChiTietHoaDonImpl {

    @Autowired
    private ChuongTrinhGiamGiaChiTietHoaDonRepository repo;

    @Override
    public List<ChuongTrinhGiamGiaChiTietHoaDon> getById(ChuongTrinhGiamGiaHoaDon ctggHD) {
        return repo.findAllByCtggHD(ctggHD);
    }
    @Autowired
    private ChuongTrinhGiamGiaHoaDonService repGiamGiaHoaDonService;

    @Override
    public List<ChuongTrinhGiamGiaChiTietHoaDon> getAllByTrangThaiHD() {
        return repo.getAllByTrangThaiHD();
    }
    @Autowired
    private HoaDonService hDonService;

    public ChuongTrinhGiamGiaChiTietHoaDon createCTGGChiTietHoaDon(UUID idCtggHD, UUID idHD, BigDecimal tongTien) {
        ChuongTrinhGiamGiaChiTietHoaDon ctggcthd = new ChuongTrinhGiamGiaChiTietHoaDon();
        ChuongTrinhGiamGiaHoaDon giamGiaHoaDon = repGiamGiaHoaDonService.getOne(idCtggHD);
        HoaDon hd = hDonService.findId(idHD);
        BigDecimal phanTramGiam = new BigDecimal(giamGiaHoaDon.getPhanTramGiam());

        BigDecimal soTienDaGiam = tongTien.multiply(phanTramGiam).divide(new BigDecimal(100));
        ctggcthd.setCtggHD(giamGiaHoaDon);
        ctggcthd.setHd(hd);
        ctggcthd.setSoTienDaGiam(soTienDaGiam);
        ctggcthd.setGhiChu("N/A");
        ctggcthd.setNgayTao(LocalDate.now().toString());
        ctggcthd.setNgaySua(LocalDate.now().toString());
        ctggcthd.setTrangThai(1);

        return repo.save(ctggcthd);
    }

}

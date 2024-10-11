package sd_48.datn.service.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_48.datn.model.GiayTheThao;
import sd_48.datn.model.MauSac;
import sd_48.datn.repository.SanPham.AllGiayTheThao.MauSacRepository;
import sd_48.datn.service.GiayTheThao.GiayTheThaoService;

import java.util.List;
import java.util.UUID;

@Service
public class MauSacService {
    @Autowired
    private MauSacRepository mauSacRepository;
    @Autowired
    private GiayTheThaoService gttService;


    public List<MauSac> findMauSac(String tenMauSac) {
        if (tenMauSac != null) {
            return mauSacRepository.findByTenMauSac(tenMauSac);
        } else {
            return mauSacRepository.findAll();
        }
    }
    public List<MauSac> getAllByIdGtt(UUID idGtt) {
        GiayTheThao gtt = gttService.getOne(idGtt);
        return mauSacRepository.findByGtt(gtt);
    }

}

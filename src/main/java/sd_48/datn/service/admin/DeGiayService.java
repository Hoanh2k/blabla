package sd_48.datn.service.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sd_48.datn.model.DeGiay;
import sd_48.datn.repository.SanPham.AllGiayTheThao.DeGiayRepository;
import sd_48.datn.service.impl.DeGiayImpl;

import java.util.UUID;

@Service
public class DeGiayService implements DeGiayImpl {
    @Autowired
    private DeGiayRepository repo;


    @Override
    public void add(DeGiay deGiay) {
        this.repo.save(deGiay);
    }

    @Override
    public void update(DeGiay deGiay, UUID id) {
        DeGiay deGiay1 = this.repo.findById(id).get();
        deGiay1.setTenDeGiay(deGiay.getTenDeGiay());
        deGiay1.setGhiChu(deGiay.getGhiChu());
        deGiay1.setNgayTao(deGiay.getNgayTao());
        deGiay1.setNgaySua(deGiay.getNgaySua());
        deGiay1.setTrangThai(deGiay.getTrangThai());
        this.repo.save(deGiay1);
    }

//    @Override
//    public void delete(UUID id) {
//        DeGiay deGiay = repo.findById(id).get();
//        repo.delete(deGiay);
//    }

    @Override
    public Page<DeGiay> search(Pageable pageable, String name) {

        return this.repo.findByTenDeGiayContaining(name, pageable);
    }

    @Override
    public Page<DeGiay> pagination(Pageable pageable) {
        return this.repo.findAll(pageable);
    }




}

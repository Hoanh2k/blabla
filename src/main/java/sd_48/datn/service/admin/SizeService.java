package sd_48.datn.service.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_48.datn.model.GiayTheThao;
import sd_48.datn.model.Size;
import sd_48.datn.repository.SanPham.AllGiayTheThao.SizeRepository;
import sd_48.datn.service.GiayTheThao.GiayTheThaoService;

import java.util.List;
import java.util.UUID;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private GiayTheThaoService gttService;


    public List<Size> getAll() {
        return sizeRepository.findAll();
    }

    public Size getOne(UUID id) {
        return sizeRepository.findById(id).orElse(null);
    }

    public void save(Size size) {
        this.sizeRepository.save(size);
    }

    public void delete(UUID id) {
        this.sizeRepository.deleteById(id);
    }

    public List<Size> getAllByIdGtt(UUID idGtt) {
        GiayTheThao gtt = gttService.getOne(idGtt);
        return sizeRepository.getSizeByGtt(gtt);
    }

}

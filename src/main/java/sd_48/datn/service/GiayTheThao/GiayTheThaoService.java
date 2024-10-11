package sd_48.datn.service.GiayTheThao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_48.datn.model.GiayTheThao;
import sd_48.datn.repository.SanPham.GiayTheThao.GiayTheThaoRepository;

import java.util.List;
import java.util.UUID;

@Service
public class GiayTheThaoService implements GiayTheThaoImpl{

    @Autowired
    private GiayTheThaoRepository giayTheThaoRepository;

    public List<GiayTheThao> findGiayTheThao(String tenGiayTheThao){

        if(tenGiayTheThao !=null){

            return giayTheThaoRepository.findByTenGiayTheThao(tenGiayTheThao);

        }else{

             return giayTheThaoRepository.findAll();

        }

    }

    @Override
    public List<GiayTheThao> getAll() {

        return this.giayTheThaoRepository.findAll();
    }

    @Override
    public List<GiayTheThao> getAllWithoutInCTGGCTSP(UUID id) {
        return this.giayTheThaoRepository.getAllWithoutInCTGGCTSP();
    }

    @Override
    public GiayTheThao getOne(UUID id) {
        return this.giayTheThaoRepository.findById(id).get();
    }


    public int countGttInCtgg() {
        return this.giayTheThaoRepository.countGttInCtgg();
    }
    public void update(GiayTheThao gtt){
        giayTheThaoRepository.save(gtt);
    }
}

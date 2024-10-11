package sd_48.datn.service.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_48.datn.model.Form;
import sd_48.datn.repository.SanPham.AllGiayTheThao.FormRepository;

import java.util.List;
import java.util.UUID;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;

    public List<Form> getAll() {
        return formRepository.findAll();
    }

    public Form getOne(UUID id) {
        return formRepository.findById(id).orElse(null);
    }

    public void save(Form form) {
        this.formRepository.save(form);
    }

    public void delete(UUID id) {
        this.formRepository.deleteById(id);
    }

    public List<Form> searchByTen(String tenForm) {
        return formRepository.findByTenFormContainingOrderById(tenForm);
    }

}

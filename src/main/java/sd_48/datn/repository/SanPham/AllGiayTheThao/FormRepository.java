package sd_48.datn.repository.SanPham.AllGiayTheThao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.Form;

import java.util.List;
import java.util.UUID;

@Repository
public interface FormRepository extends JpaRepository<Form, UUID> {

    List<Form> findByTenFormContainingOrderById(String tenForm);

}
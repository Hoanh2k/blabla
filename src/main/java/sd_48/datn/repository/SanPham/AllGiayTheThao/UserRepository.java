package sd_48.datn.repository.SanPham.AllGiayTheThao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.User;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> findByTenUserContainingOrderById(String tenUser);
    List<User> findByTrangThaiOrderById(Integer trangThai);
    //Todo code đăng nhập

    User findByEmailAndAndMatKhau(String email,String matKhau);

    //Todo code finde email

    @Query("select p from User p where p.email= ?1")
    User findByEmail(String email);


}

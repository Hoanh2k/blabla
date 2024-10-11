package sd_48.datn.repository.SanPham.AllGiayTheThao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_48.datn.model.ChatLieu;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, UUID> {

    List<ChatLieu> findByTenChatLieuContainingOrderById(String tenChatLieu);

}

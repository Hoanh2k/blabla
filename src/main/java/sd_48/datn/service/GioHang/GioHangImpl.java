package sd_48.datn.service.GioHang;


import sd_48.datn.model.GioHang;

import java.util.UUID;

public interface GioHangImpl {

    GioHang findByIdKH(UUID id);
}

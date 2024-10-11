package sd_48.datn.service.GioHang;


import sd_48.datn.model.GioHangChiTiet;

import java.util.UUID;

public interface GioHangChiTietImpl {

    void add(GioHangChiTiet gioHangChiTiet);

    GioHangChiTiet findById(UUID id);

    void update(UUID id, GioHangChiTiet update);

}

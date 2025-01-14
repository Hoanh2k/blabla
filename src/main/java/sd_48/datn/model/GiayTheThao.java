package sd_48.datn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "GiayTheThao")
public class GiayTheThao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id_GiayTheThao")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "Id_Form")
    private Form form;


    @ManyToOne
    @JoinColumn(name = "Id_ChatLieu")
    private ChatLieu chatLieu;


    @ManyToOne
    @JoinColumn(name = "Id_DeGiay")
    private DeGiay deGiay;


    @ManyToOne
    @JoinColumn(name = "Id_TrongLuong")
    private TrongLuong trongLuong;

    @ManyToOne
    @JoinColumn(name = "Id_ThuongHieu")
    private ThuongHieu thuongHieu;


    @Column(name = "gioiTinh")
    private String gioiTinh;

    @Column(name = "tenGiayTheThao")
    private String tenGiayTheThao;

    @Column(name = "giaBan")
    private String giaBan;

    @Column(name = "moTa")
    private String moTa;

    @Column(name = "ghiChu")
    private String ghiChu;

    @Column(name = "ngayTao")
    private String ngayTao;

    @Column(name = "ngaySua")
    private String ngaySua;

    @Column(name = "trangThai")
    private int trangThai;


    @Column(name = "SoTienGiamGia")
    private BigDecimal soTienDaGiam;

    //Todo join list Image
    @JsonIgnore
    @OneToMany(mappedBy = "giayTheThao", fetch = FetchType.EAGER)
    List<Image> image;

//    public String getAnhDau(List<Image> images) {
//
//        return images.get(0).getLink();
//
//    }

    public String getAnhDau() {
        if (image != null && !image.isEmpty()) {
            return image.get(0).getLink();
        }
        return "Đường dẫn ảnh mặc định khi không có ảnh"; // Thay bằng đường dẫn ảnh mặc định hoặc thông báo khác khi không có ảnh
    }


}

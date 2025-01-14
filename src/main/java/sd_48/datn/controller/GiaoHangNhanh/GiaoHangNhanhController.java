package sd_48.datn.controller.GiaoHangNhanh;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/public/")
@CrossOrigin("*")

public class GiaoHangNhanhController {
    private static final String API_BASE_URL = "https://online-gateway.ghn.vn/shiip/public-api/master-data/";

    @GetMapping("/provinces")
    public String getAllProvinces() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("token", "8217a66b-75a9-11ef-8a4a-c6ff21e5dadc");
            headers.set("Content-Type", "application/json");
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(API_BASE_URL + "province", HttpMethod.GET, entity, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                return null;
            }
        } catch (HttpClientErrorException e) {
            return "";
        }
    }

    @GetMapping("/districts")
    public String getDistrictsByProvince(@RequestParam("province_id") Integer provinceId) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("token", "8217a66b-75a9-11ef-8a4a-c6ff21e5dadc");
            headers.set("Content-Type", "application/json");
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(API_BASE_URL + "district?province_id=" + provinceId, HttpMethod.GET, entity, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                return null;
            }
        } catch (HttpClientErrorException e) {
            return "";
        }
    }

    @GetMapping("/wards")
    public String getWardsByDistrict(@RequestParam("district_id") Integer districtId) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("token", "8217a66b-75a9-11ef-8a4a-c6ff21e5dadc");
            headers.set("Content-Type", "application/json");
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(API_BASE_URL + "ward?district_id=" + districtId, HttpMethod.GET, entity, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                return null;
            }
        } catch (HttpClientErrorException e) {
            return "";
        }
    }

    @PostMapping("/transportationFee")
    public String getFee(@RequestBody TransportationFeeDTO transportationFeeDTO){
        try {
            RestTemplate restTemplate = new RestTemplate();

            // Tạo tiêu đề
            HttpHeaders headers = new HttpHeaders();
            headers.set("token", "8217a66b-75a9-11ef-8a4a-c6ff21e5dadc");
            headers.set("shop_id", "5332084");
            headers.set("Content-Type", "application/json"); // Thay thế tên và giá trị của tiêu đề cần thiết

            // Tạo đối tượng HttpEntity chứa tiêu đề
            HttpEntity<String> entity = new HttpEntity<>(headers);

            // Thực hiện yêu cầu HTTP với tiêu đề
//            ResponseEntity<String> response = restTemplate.exchange(
//                    "https://dev-online-gateway.ghn.vn/shiip/public-api/v2/shipping-order/fee?service_type_id=2&from_district_id=3303&to_district_id=" + transportationFeeDTO.getToDistrictId() + "&to_ward_code=" + transportationFeeDTO.getToWardCode() + "&height=" + TransportationFeeDTO.heightProduct * transportationFeeDTO.getQuantity() + "&length=" + TransportationFeeDTO.lengthProduct * transportationFeeDTO.getQuantity() + "&weight=" + TransportationFeeDTO.weightProduct * transportationFeeDTO.getQuantity() + "&width=" + TransportationFeeDTO.widthProduct * transportationFeeDTO.getQuantity() + "&insurance_value=" + transportationFeeDTO.getInsuranceValue(), HttpMethod.GET, entity, String.class);
            ResponseEntity<String> response = restTemplate.exchange(
                    "https://online-gateway.ghn.vn/shiip/public-api/v2/shipping-order/fee?service_type_id=2&from_district_id=1804&to_district_id=" + transportationFeeDTO.getToDistrictId() + "&to_ward_code=" + transportationFeeDTO.getToWardCode() + "&height=" + TransportationFeeDTO.heightProduct + "&length=" + TransportationFeeDTO.lengthProduct + "&weight=" + TransportationFeeDTO.weightProduct * transportationFeeDTO.getQuantity() + "&width=" + TransportationFeeDTO.widthProduct * transportationFeeDTO.getQuantity() + "&insurance_value=" + transportationFeeDTO.getInsuranceValue(), HttpMethod.GET, entity, String.class);
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                // Xử lý khi có lỗi
                return null;
            }
        }catch (Exception e){
            return null;
        }
    }
}

package sd_48.datn.service.impl;


import sd_48.datn.model.User;

import java.util.UUID;

public interface UserServiceImpl {

    User findByEmail(String email);

    void update(UUID id, User update);


}

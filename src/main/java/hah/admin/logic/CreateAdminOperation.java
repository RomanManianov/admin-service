package hah.admin.logic;

import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import hah.admin.service.dao.AdminDaoAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateAdminOperation {

    private final AdminDaoAdapter adminDaoAdapter;

    public AdminEntity process(AdminDto adminDto) {
        return adminDaoAdapter.addNewAdmin(adminDto);
    }
}

package hah.admin.service.dao;

import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import hah.admin.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminDaoAdapter {

    private final AdminDao adminDao;
    private final AdminMapper mapper;

    public AdminEntity addNewAdmin(AdminDto adminDto) {
        return adminDao.save(mapper.map(adminDto));
    }
}

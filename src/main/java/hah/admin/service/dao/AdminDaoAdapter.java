package hah.admin.service.dao;

import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import hah.admin.mapper.AdminMapper;
import hah.common.dto.SuperAdminAdminLinkDto;
import hah.common.mapper.SuperAdminAdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminDaoAdapter {

    private final AdminDao adminDao;
    private final AdminMapper mapper;
    private final AdminJDBC adminJDBC;
    private final SuperAdminAdminMapper superAdminAdminMapper;

    public AdminEntity addNewAdmin(AdminDto adminDto) {
        //todo: обработать исключение
        addSuperAdminAdminLink(superAdminAdminMapper.map(adminDto));
        return adminDao.save(mapper.map(adminDto));
    }

    private void addSuperAdminAdminLink(SuperAdminAdminLinkDto dto) {
        adminJDBC.addNewSuperAdminAdminLink(dto);
    }
}

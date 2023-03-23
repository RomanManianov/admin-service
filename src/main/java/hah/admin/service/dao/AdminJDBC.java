package hah.admin.service.dao;

import hah.admin.dto.AdminDto;
import hah.common.dto.SuperAdminAdminLinkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AdminJDBC {

    private final JdbcTemplate jdbcTemplate;

    public List<AdminDto> getAdminsBySuperAdminCode(String code) {
        return null;
    }

    public void addNewSuperAdminAdminLink(SuperAdminAdminLinkDto dto) {
        jdbcTemplate.execute(addNewSuperAdminAdminLinkScript(dto));
    }

    private String addNewSuperAdminAdminLinkScript(SuperAdminAdminLinkDto dto) {
        return """
                insert into wc_hub.super_admins_admins
                (super_admin_code, admin_code, created_at, active)
                values('getSuperAdminCode', 'getAdminCode', 'getCreatedAt', isActive);
                """
                .replace("getAdminCode", dto.getAdminCode())
                .replace("getSuperAdminCode", dto.getSuperAdminCode())
                .replace("getCreatedAt", dto.getCreatedAt().toString())
                .replace("isActive", String.valueOf(dto.isActive()));
    }
}

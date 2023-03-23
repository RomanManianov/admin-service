package hah.common.mapper;

import hah.admin.dto.AdminDto;
import hah.common.dto.SuperAdminAdminLinkDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SuperAdminAdminMapper {

    public SuperAdminAdminLinkDto map(AdminDto adminDto) {
        return new SuperAdminAdminLinkDto()
                .setSuperAdminCode(adminDto.getSuperAdminCode())
                .setAdminCode(adminDto.getCode())
                .setCreatedAt(LocalDateTime.now())
                .setUpdatedAt(LocalDateTime.now())
                .setActive(true);
    }
}

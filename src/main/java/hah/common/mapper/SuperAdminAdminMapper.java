package hah.common.mapper;

import hah.admin.dto.AdminDto;
import hah.common.dto.SuperAdminAdminDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SuperAdminAdminMapper {

    public SuperAdminAdminDto map(AdminDto adminDto) {
        return new SuperAdminAdminDto()
                .setSuperAdminCode(adminDto.getSuperAdminCode())
                .setAdminCode(adminDto.getCode())
                .setCreatedAt(LocalDateTime.now())
                .setUpdatedAt(LocalDateTime.now())
                .setActive(true);
    }
}

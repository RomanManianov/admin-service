package hah.admin.service.dao;

import hah.admin.enitiy.AdminEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminDao extends CrudRepository<AdminEntity, Long> {
}

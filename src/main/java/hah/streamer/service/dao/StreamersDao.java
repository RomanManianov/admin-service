package hah.streamer.service.dao;

import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreamersDao extends CrudRepository<StreamerEntity, Long> {

    public List<StreamerEntity> getAllStreamersByAdminCode(String adminCode);
}


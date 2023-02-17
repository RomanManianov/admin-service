package hah.streamer.service.dao;

import hah.streamer.dto.StreamerDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreamersDao extends CrudRepository<StreamerDto, Long> {

    public List<StreamerDto> getAllStreamersByAdminId(long id);
}


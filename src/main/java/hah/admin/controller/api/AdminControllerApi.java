package hah.admin.controller.api;

import hah.streamer.dto.StreamerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/admin")
public interface AdminControllerApi {

    @GetMapping("/getAllStreamers/{id}")
    ResponseEntity<List<StreamerDto>> getAllStreamers(@PathVariable("id") Long id);
}

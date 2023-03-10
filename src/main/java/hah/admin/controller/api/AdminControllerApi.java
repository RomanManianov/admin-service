package hah.admin.controller.api;

import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/admin")
public interface AdminControllerApi {

    @GetMapping("/getAllStreamers/{code}")
    ResponseEntity<List<StreamerEntity>> getAllStreamers(@PathVariable("code") String adminCode);

    @PostMapping("/createStreamer")
    ResponseEntity<StreamerEntity> createStreamer(@RequestBody StreamerDto streamer);
}

package hah.admin.controller.api;

import hah.admin.dto.AdminDto;
import hah.admin.enitiy.AdminEntity;
import hah.streamer.dto.StreamerDto;
import hah.streamer.entity.StreamerEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/admin")
public interface AdminControllerApi {

    @GetMapping("/getStreamerByCode/{code}")
    ResponseEntity<StreamerEntity> getStreamerByCode(@PathVariable("code") String streamerCode);

    @GetMapping("/getAllStreamers/{code}")
    ResponseEntity<List<StreamerEntity>> getAllStreamers(@PathVariable("code") String adminCode);

    @PostMapping("/createStreamer")
    ResponseEntity<StreamerEntity> createStreamer(@RequestBody StreamerDto streamer);

    @PostMapping("/createAdmin")
    ResponseEntity<AdminEntity> createAdmin(@RequestBody AdminDto adminDto);
}

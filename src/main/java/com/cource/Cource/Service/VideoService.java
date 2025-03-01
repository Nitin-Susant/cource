package com.cource.Cource.Service;


import com.cource.Cource.Entitys.Viedo;
import com.cource.Cource.Repository.ViedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private ViedoRepository videoRepository;

    public List<Viedo> getAllVideos() {
        return videoRepository.findAll();
    }

    public Viedo getVideoById(Long id) {
        return videoRepository.findById(id).orElse(null);
    }

    public Viedo addVideo(Viedo video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(Long id) {
        videoRepository.deleteById(id);
    }
}

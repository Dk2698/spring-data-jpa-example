package com.kumar.jpa.repositories;

import com.kumar.jpa.models.Author;
import com.kumar.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}

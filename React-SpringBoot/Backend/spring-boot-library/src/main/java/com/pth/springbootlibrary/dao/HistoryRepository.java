package com.pth.springbootlibrary.dao;

import com.pth.springbootlibrary.entity.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface HistoryRepository extends JpaRepository<History, Long> {
    Page<History> findBookByUserEmail(@RequestParam("email") String userEmail, Pageable pageable);
}

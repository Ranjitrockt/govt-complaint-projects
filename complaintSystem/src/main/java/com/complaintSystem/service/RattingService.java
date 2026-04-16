package com.complaintSystem.service;

import com.complaintSystem.dto.RattingDto;
import com.complaintSystem.entity.Ratting;

import java.util.List;

public interface RattingService {

    Ratting addRating(RattingDto dto);

    // 🔥 get rating by complaint
    Ratting getRatingByComplaint(Long complaintId);

    // 🔥 get ratings by user
    List<Ratting> getRatingsByUser(Long userId);
}

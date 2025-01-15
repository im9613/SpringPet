package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.dao.ShelterDAO;
import com.test.pet.dto.ShelterDTO;

@Service
public class ShelterService {

    private final ShelterDAO shelterDAO;

    @Autowired
    public ShelterService(ShelterDAO shelterDAO) {
        this.shelterDAO = shelterDAO;
    }

    // ShelterDTO 리스트 반환
    public List<ShelterDTO> getShelters() {
        return shelterDAO.getshelter();  // ShelterDAO에서 데이터를 가져옴
    }
}

package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.dao.AdoptionApplicationMapper;
import com.test.pet.model.AdoptionApplication;

@Service
public class AdoptionApplicationService {

	
	private final AdoptionApplicationMapper adoptionApplicationMapper;
	
	 @Autowired
	    public AdoptionApplicationService(AdoptionApplicationMapper adoptionApplicationMapper) {
	        this.adoptionApplicationMapper = adoptionApplicationMapper;
	    }
	
	
	
	// 입양 신청서 저장
    public void saveAdoptionApplication(AdoptionApplication application) {
        adoptionApplicationMapper.insertAdoptionApplication(application);
    }

    // 입양 신청서 목록 조회
    public List<AdoptionApplication> getAllAdoptionApplications() {
        return adoptionApplicationMapper.getAllAdoptionApplications();
    }
	
}

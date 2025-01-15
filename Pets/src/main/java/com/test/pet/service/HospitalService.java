package com.test.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pet.dao.AnimalHospitalDAO;
import com.test.pet.dto.AnimalHospitalDTO;

@Service
public class HospitalService {
	
	private final AnimalHospitalDAO animalHospitalDAO;
	
	 @Autowired
	    public HospitalService(AnimalHospitalDAO animalHospitalDAO) {
	        this.animalHospitalDAO = animalHospitalDAO;
	    }

	    // HospitalMapDTO 리스트 반환
	    public List<AnimalHospitalDTO> getAnimalHospitals() {
	        return animalHospitalDAO.getHospital();  // AnimalHospital에서 데이터를 가져옴
	    }
}

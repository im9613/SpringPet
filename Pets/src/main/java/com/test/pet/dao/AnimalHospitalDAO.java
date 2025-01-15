package com.test.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pet.dto.AnimalHospitalDTO;
import com.test.pet.mapper.InfoHospitalMapper;

@Repository
public class AnimalHospitalDAO {
	
	private final InfoHospitalMapper hospitalmapper;
	
	@Autowired
	public AnimalHospitalDAO(InfoHospitalMapper hospitalmapper) {
		this.hospitalmapper = hospitalmapper;
	}

	
	public List<AnimalHospitalDTO> getHospital() {
		return hospitalmapper.getHospital();
	}


}

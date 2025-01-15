package com.test.pet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pet.dto.ShelterDTO;
import com.test.pet.mapper.InfoShelterMapper;

@Repository
public class ShelterDAO {

	private final InfoShelterMapper sheltermapper;

	@Autowired
	public ShelterDAO(InfoShelterMapper sheltermapper) {
		this.sheltermapper = sheltermapper;
    }
	
	
	public List<ShelterDTO> getshelter() {
		return sheltermapper.getshelter();
	}



}

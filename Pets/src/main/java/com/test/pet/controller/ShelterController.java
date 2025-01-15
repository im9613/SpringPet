package com.test.pet.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.pet.dto.AnimalHospitalDTO;
import com.test.pet.dto.MapDTO;
import com.test.pet.dto.ShelterDTO;
import com.test.pet.service.HospitalService;
import com.test.pet.service.ShelterService;  // 이미 ShelterService가 있을 것이라고 가정

@Controller
public class ShelterController {

    @Autowired
    private ShelterService shelterService;  // ShelterService 주입
    
    @Autowired
    private HospitalService hospitalService;
    
    

    @GetMapping("/shelter.do")
    public String shelter(Model model) {
        // ShelterDTO 리스트 가져오기
        List<ShelterDTO> shelters = shelterService.getShelters();  // ShelterService 사용

        // MapDTO 리스트 생성
        List<MapDTO> maps = new ArrayList<>();
        for (ShelterDTO shelter : shelters) {
            MapDTO map = new MapDTO();
            map.setSeq(shelter.getSeqMap());  // ShelterDTO의 seqMap을 사용

            // ShelterDTO에서 실제 위도, 경도 값을 MapDTO에 설정
            map.setLatitude(shelter.getLatitude());  // ShelterDTO에서 위도 가져오기
            map.setLongitude(shelter.getLongitude());  // ShelterDTO에서 경도 가져오기

            maps.add(map);
        }

        // ShelterDTO와 MapDTO를 하나의 리스트에 묶어서 JSP로 전달
        List<Map<String, Object>> shelterMapList = new ArrayList<>();
        for (int i = 0; i < shelters.size(); i++) {
            Map<String, Object> shelterMap = new HashMap<>();
            shelterMap.put("shelter", shelters.get(i));  // ShelterDTO
            shelterMap.put("map", maps.get(i));  // 해당 ShelterDTO에 매칭되는 MapDTO
            shelterMapList.add(shelterMap);
        }

        // 모델에 shelterMapList를 추가하여 JSP로 전달
        model.addAttribute("shelterMapList", shelterMapList);
        
        List<AnimalHospitalDTO> hospitals = hospitalService.getAnimalHospitals();
        model.addAttribute("hospitals", hospitals);  // AnimalHospital 목록을 JSP로 전달
        
        return "info/shelterinfo";  // JSP 파일로 리턴
    
    }
    
}

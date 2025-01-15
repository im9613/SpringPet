package com.test.pet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.test.pet.mapper.AdoptReviewMapper;
import com.test.pet.dto.AdoptReviewListDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")  // Spring 설정 파일 경로
public class DBTest {

    @Autowired
    private AdoptReviewMapper mapper;
    
    @Test
    public void testMapper() {
        // seq 값이 20인 데이터를 가져옴
        AdoptReviewListDTO result = mapper.get("20");  // seq 20에 대한 데이터를 가져옵니다
        if (result == null) {
            System.out.println("No review found for seq: 20");
        } else {
            System.out.println(result);  // result는 AdoptReviewListDTO 객체
        }
    }
}
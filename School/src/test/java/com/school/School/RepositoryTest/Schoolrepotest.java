package com.school.School.RepositoryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import com.school.School.Entity.School;
import com.school.School.Repository.Schoolrepository;

import jakarta.transaction.Transactional;

@DataJpaTest
@Transactional
public class Schoolrepotest {
	
	@Autowired
	private Schoolrepository repo;
	
	//@Test
//	public void schooltest() {
//		School school = new School();
//		school.setSchoolname("JVM");
//		
//		School sc = repo.save(school);
//		assertEquals("JVM", sc.getSchoolname());
//	}
	
	
	@Test
	public void add() {
		School sc = new School();
		Integer i = sc.add(10, 20);
		Integer j = 30;
		assertEquals(i, j);
		
	}
    @Test
	public void multy() {
		School sc = new School();
		Integer i=sc.multy(10, 10);
		Integer j= 20;
		assertEquals(i, j);
	}
}

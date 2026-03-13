package com.Revision.Revision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Revision.Revision.Entity.Collage;

@Repository
public interface CollageRepo extends JpaRepository<Collage, Integer> {

}

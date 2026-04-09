package CRUDRevision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CRUDRevision.Entity.School;
@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {

}

package CircularRelectionship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CircularRelectionship.Entity.Company;
@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {

}

package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import domain.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

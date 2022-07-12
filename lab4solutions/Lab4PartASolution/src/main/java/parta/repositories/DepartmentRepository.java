package parta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parta.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

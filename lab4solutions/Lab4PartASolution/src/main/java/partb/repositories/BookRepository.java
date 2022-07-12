package partb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parta.domain.Department;
import partb.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

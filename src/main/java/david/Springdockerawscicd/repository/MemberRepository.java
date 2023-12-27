package david.Springdockerawscicd.repository;

import david.Springdockerawscicd.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long>
{

}

package bjc.project.soop.repository;

import bjc.project.soop.domain.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
    public MemberVO findById(String id);
}

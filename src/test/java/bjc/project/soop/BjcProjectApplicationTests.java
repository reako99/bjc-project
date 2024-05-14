package bjc.project.soop;

import bjc.project.soop.domain.MemberVO;
import bjc.project.soop.repository.MemberRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BjcProjectApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Test
	void contextLoads() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("member");
		EntityManager em = emf.createEntityManager()
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		MemberVO vo = new MemberVO("test", "test1234","user","Y");
		System.out.println("id = " + vo.getId());
		System.out.println("vo.getPassword() = " + vo.getPassword());
		System.out.println("vo.getRole() = " + vo.getRole());
		System.out.println("vo.getEnabled() = " + vo.getEnabled());
		em.persist(vo);
		tx.commit();
		em.close();
		emf.close();
	}

}

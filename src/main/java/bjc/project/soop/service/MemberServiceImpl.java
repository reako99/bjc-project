package bjc.project.soop.service;

import bjc.project.soop.domain.MemberVO;
import bjc.project.soop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private final MemberRepository memberRepository;

    public MemberVO getMember(String memberId){
        return memberRepository.findById(memberId);
    }

}

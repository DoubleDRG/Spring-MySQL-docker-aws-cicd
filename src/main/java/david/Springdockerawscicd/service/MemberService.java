package david.Springdockerawscicd.service;

import david.Springdockerawscicd.domain.Member;
import david.Springdockerawscicd.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService
{
    private final MemberRepository memberRepository;

    public Member save(Member member)
    {
        return memberRepository.save(member);
    }

    public List<Member> showAll()
    {
        return memberRepository.findAll();
    }
}

package david.Springdockerawscicd.controller;

import david.Springdockerawscicd.domain.Member;
import david.Springdockerawscicd.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController
{
    private final MemberService memberService;

    @GetMapping({"/", "/home"})
    public String home()
    {
        return "Welcome Home!";
    }

    @GetMapping("/save/{name}")
    public String insert(@PathVariable String name)
    {
        Member member = new Member();
        member.setName(name);
        memberService.save(member);
        return "Successfully saved " + name + "!";
    }

    @GetMapping("/members")
    public List<Member> list()
    {
        return memberService.showAll();
    }
}

package com.gilbert.msa.controller;

import com.gilbert.msa.domain.dto.MemberDto;
import com.gilbert.msa.domain.dto.OrderDto;
import com.gilbert.msa.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public void createMember(@RequestBody MemberDto requestDto) {
        log.info("createMember");
        memberService.createMember(requestDto);
    }

    @GetMapping("/{memberId}")
    public MemberDto getMember(@PathVariable String memberId) {
        log.info("getMember");
        return memberService.getMember(memberId);
    }

    @GetMapping
    public List<MemberDto> getMembers() {
        log.info("getMembers");
        return memberService.getMembers();
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable String memberId) {
        log.info("deleteMember");
        memberService.deleteMember(memberId);
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders() {
        log.info("getOrders");
        return memberService.getOrders();
    }
}

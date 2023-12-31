package com.gilbert.msa.service;

import com.gilbert.msa.client.OrderFeignClient;
import com.gilbert.msa.domain.dto.MemberDto;
import com.gilbert.msa.domain.dto.OrderDto;
import com.gilbert.msa.domain.entity.Member;
import com.gilbert.msa.domain.mapper.MemberMapper;
import com.gilbert.msa.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;
    private final MemberMapper mapper;
    private final OrderFeignClient orderFeignClient;

    @Transactional
    public void createMember(MemberDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public MemberDto getMember(String id) {

        Member entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Couldn't find memberId: " + id));
        return mapper.toDto(entity);
    }

    public List<MemberDto> getMembers() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    @Transactional
    public void deleteMember(String memberId) {
        repository.deleteById(memberId);
    }

    public List<OrderDto> getOrders() {
        return orderFeignClient.getOrders();
    }
}

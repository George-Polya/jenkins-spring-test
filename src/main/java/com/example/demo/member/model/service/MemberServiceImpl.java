package com.example.demo.member.model.service;

import com.example.demo.dto.Member;
import com.example.demo.member.model.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    private MemberMapper memberMapper; // repository

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }
}

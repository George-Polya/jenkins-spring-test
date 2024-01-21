package com.example.demo.member.model.mapper;

import com.example.demo.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<Member> findAll();
}

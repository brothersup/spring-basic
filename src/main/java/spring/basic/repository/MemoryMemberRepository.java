package spring.basic.repository;

import spring.basic.domain.Team;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Team> store = new HashMap<>();
    private static long sequence = 0L;
}

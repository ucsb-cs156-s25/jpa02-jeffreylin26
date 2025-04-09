package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_test(){
        assert(team.equals(team));
        int hi = 5;
        assertEquals(false, team.equals(hi));
        Team other;
        other = new Team();
        assertEquals(false, other.equals(team));
        other.name = "wrong";
        assertEquals(false, other.equals(team));
        other.name = team.name;
        assertEquals(true,team.name.equals(other.name) && team.members.equals(other.members));
    }

    @Test
    public void hash_test(){
        Team other = new Team();
        assertEquals(false, other.hashCode() == team.hashCode());
    }

    @Test
    public void hash_test2(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);

    }
}

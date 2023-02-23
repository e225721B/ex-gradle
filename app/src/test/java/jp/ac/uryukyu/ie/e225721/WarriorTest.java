package jp.ac.uryukyu.ie.e225721;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultHeroHp = 15;
    Warrior warrior = new Warrior("デモ戦士", defaultHeroHp, 4);
    Enemy slime = new Enemy("スライムもどき", 10, 2);
    for(int count=0; count<3; count++){
        warrior.attackWithWeponSkill(slime); // over kill
    slime.attack(warrior);
    assertEquals(defaultHeroHp, warrior.getHitpoint());
    }
}
}

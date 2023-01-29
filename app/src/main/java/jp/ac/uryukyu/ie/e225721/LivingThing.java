package jp.ac.uryukyu.ie.e225721;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(this.dead == true){
            damage = 0;
        }
        System.out.printf("%sは" + opponent.getName() + "に" + damage + "ダメージ与えた", name, damage);
        opponent.wounded(damage);
    }

    public void wounded(int damage){
            this.hitPoint -= damage;
            if(this.hitPoint <= 0){
                this.dead = true;
            System.out.printf("%sは倒れた\n", name);
        }
    }
    }

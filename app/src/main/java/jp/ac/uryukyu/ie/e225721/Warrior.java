package jp.ac.uryukyu.ie.e225721;

public class Warrior extends LivingThing {
    public Warrior(String name,int maximumHP,int attack) {
        super(name,maximumHP,attack);
    }

    @Override
    public void attackWithWeponSkill(LivingThing opponent) {
        int damage = attack * 3/2;
        if(this.dead == true){
            damage = 0;
        }
    
        System.out.printf("%sの攻撃!ウェポンスキルを発動!" + opponent.getName() + "に" + damage + "ダメージ与えた!!", name, damage);
        opponent.wounded(damage);
        }
        public void wounded(int damage){
            this.hitPoint -= damage;
            if( this.hitPoint <= 0 ) {
                dead = true;
                damage = 0;
                System.out.printf("勇者%sは道半ばで力尽きてしまった。", name);
            }
        }
            public int getHitpoint(){
                return this.hitPoint;
        }
}


public class Player extends Character{

    int potion;
    Player(String name, int health, int attackPower, int level) {
        super(name,health,attackPower,level);
        this.potion = 5;
    }

    public void drinkPotion() {
        int heal = this.getHealth() + 30;
        if(this.potion != 0){
            this.setHealth(heal);
        }
    }
}

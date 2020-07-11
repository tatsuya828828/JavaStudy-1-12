package job;
import creature.BattleCreature;

public class Wizard extends BattleCreature {

	public Wizard() {
		super();
	}

	public Wizard(String name) {
		super(name);
	}

	public void talk() {
		System.out.println("私は魔法使いの"+ this.getName() +"です");
	}

	public void heal(BattleCreature bc) {
		bc.setHp(bc.getHp()+20);
	}
}

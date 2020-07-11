package job;
import creature.BattleCreature;

public class Hero extends BattleCreature {

	public Hero() {
		super();
	}

	public Hero(String name) {
		super(name);
	}

	public void talk() {
		 System.out.println("僕はヒーロー"+ this.getName() +"です");
	}
}

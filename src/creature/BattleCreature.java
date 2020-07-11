package creature;

public abstract class BattleCreature implements Character {
	String name;
	int hp;

	public BattleCreature(String name) {
		this.setName(name);
	}

	public BattleCreature() {
		this("名無し");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}

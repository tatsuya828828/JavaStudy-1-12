package job;
import creature.Character;

public class Hero implements Character {
	private String name;

	public Hero(String name) {
		this.name = name;
	}

	public Hero() {
		this("たかし");
	}

	public void talk() {
		 System.out.println("僕はヒーロー"+ this.name +"です");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

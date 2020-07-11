package job;
public class SuperHero extends Hero {

	public SuperHero() {
		super();
	}

	public SuperHero(String name) {
		super(name);
	}

	public void talk() {
		System.out.println("私はスーパーヒーロー"+ this.getName() +"です");
	}

	public void fly() {
		System.out.println(this.getName() +"は飛んだ");
	}
}

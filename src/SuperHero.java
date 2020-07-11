import job.Hero;

public class SuperHero extends Hero {
	public SuperHero(String name){
		super(name);
	}

	public void talk() {
		System.out.println("私はスーパーヒーロー"+ this.getName() +"です");
	}
}

import creature.Character;
import job.Hero;

public class Main {

	public static void main(String[] args) {
		// 大まかに捉えればheroもsuperheroもCharacterの一種なので代入することができる
		Character hero = new Hero("ひろし");
		Character superHero = new SuperHero("きよし");
	}
}

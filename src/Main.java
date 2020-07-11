import creature.Character;
import job.Hero;

public class Main {

	public static void main(String[] args) {
		// 大まかに捉えればheroもsuperheroもCharacterの一種なので代入することができる
		Character hero = new Hero("ひろし");
		Character superHero = new SuperHero("きよし");

		// 外見がCharacter型なのでCharacterで定義していないメソッドを呼び出すことはできない
		// System.out.println(hero.getName());

		// Characterにも定義してあるメソッドであれば使うことができる
		// また外側から順に呼び出されるため一番外側で定義されたメソッドが反応する
		// このような仕組みから継承は、「子クラスは親クラスの一種である」という考え方が重要
		hero.talk();
		superHero.talk();
	}
}

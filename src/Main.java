import creature.BattleCreature;
import creature.Character;
import job.Hero;
import job.SuperHero;
import job.Wizard;

public class Main {

	public static void main(String[] args) {
		// 大まかに捉えればheroもsuperheroもCharacterの一種なので代入することができる
		Character hero = new Hero("ひろし");
		Character superHero = new SuperHero("きよし");

		// 外見がCharacter型なのでCharacterで定義していないメソッドを呼び出すことはできない
		// System.out.println(hero.getName());

		// Characterの一種なのでCharacterにも定義してあるメソッドであれば使うことができる
		// また外側から順に呼び出されるため一番外側で定義されたメソッドが反応する
		// このような仕組みから継承は、「子クラスは親クラスの一種である」という考え方が重要
		hero.talk();
		superHero.talk();

		// キャスト演算子を使えば強制的にHero型にすることができ、メソッドも呼び出せる
		// 曖昧な型に入っている中身を、厳密な型に代入することをダウンキャストといわれ、失敗の危険が伴う
		Hero hero2 = (Hero) hero;
		System.out.println(hero2.getName());
		// 強制的にキャストしても代入する方が違う場合不具合が起きる
		// (Hero型なのにSuperHero型のメソッドが反応している)
		// しかしSuperHero型のメソッドは呼び出せない
		Hero hero3 = (Hero) superHero;
		hero3.talk();
		//hero3.fly();

		// 上のような理由から、キャストする際はインスタンスに代入可能かチェックすることが必要である
		if(superHero instanceof SuperHero) {
			System.out.println("この中身はSuperHero型です、SuperHero型にキャストします");
			SuperHero superHero2 = (SuperHero) superHero;
			superHero2.talk();
			superHero2.fly();
		}

		// 大まかにBattleCreatureとして見ることで一斉に処理を行うことができる
		BattleCreature[] bc = new BattleCreature[3];
		bc[0] = new Hero("ヒーロー");
		bc[1] = new SuperHero("スーパーヒーロー");
		bc[2] = new Wizard("魔法使い");

		for(BattleCreature value: bc) {
			value.setHp(value.getHp()+50);
			System.out.println(value.getName() +"のHPを50回復した");
		}
	}
}

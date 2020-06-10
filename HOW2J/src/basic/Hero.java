package basic;

public class Hero {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	int killed=0;
	int dead=0;
	int assist=0;
	int gold=0;

	void keng(int k,int d){
		if (k < d) {
			System.out.println("坑队友的人!");
		}
		if (k >= d) {
			System.out.println("带队友的人!");
		}
	}
	
	void lengendary(){
		if (killed > 9) {
			System.out.println("超神了！");
		}
		if (dead > 9) {
			System.out.println("超鬼了！");
		}
	}
	
	
	float getArmor(){
		return armor;
	}
	
	void addSpeed(int speed){
		moveSpeed = moveSpeed + speed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 500.00f;
		garen.armor = 400.00f;
		garen.moveSpeed = 330;
		garen.killed = 10;
		garen.dead = 1;
		garen.assist = 10;
		garen.gold = 3000;

		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 488.98f;
		teemo.armor = 399.88f;
		teemo.moveSpeed = 320;
		teemo.killed = 1;
		teemo.dead = 10;
		teemo.assist = 1;
		
		garen.keng(garen.killed, garen.dead);
		
		teemo.keng(teemo.killed, teemo.dead);
		
		System.out.println(teemo.armor);
		
		teemo.armor -= 100f;
		
		float temp = teemo.getArmor();
		
		System.out.println(temp);
		
		garen.addSpeed(100);
		System.out.println(garen.moveSpeed);
		
		garen.lengendary();
		
		teemo.lengendary();
	}
}

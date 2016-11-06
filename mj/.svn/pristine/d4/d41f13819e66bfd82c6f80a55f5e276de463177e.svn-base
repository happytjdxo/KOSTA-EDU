package poly.test.step2;

import poly.child.step1.Cat;
import poly.child.step1.Dog;
import poly.child.step1.Man;
import poly.parent.step1.Animal;

public class AnimalCollectionAppTest2 {
	public static void main(String[] args) {
		Animal[] a = {
			new Cat(),
			new Dog(),
			new Man()
		};
		// casting, instanceof, virtual Method Invocation
		for(int i=0; i<a.length; i++){
			a[i].eat();
			if(a[i] instanceof Man){
				Man man = (Man)a[i];
				man.drive();
			}
		}
	}
}

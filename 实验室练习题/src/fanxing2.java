
import java.util.LinkedList;

import DanLiMoShi.Item;
import lambda.Hero;

public class fanxing2<T> {

	LinkedList<T> values = new LinkedList<T>();

	public void push(T t) {
		values.addLast(t);
	}

	public T pull() {
		return values.removeLast();
	}

	public T peek() {
		return values.getLast();
	}

	public static void main(String[] args) {
		// 在声明这个Stack的时候，使用泛型<Hero>就表示该Stack只能放Hero
		fanxing2<Hero> heroStack = new fanxing2<>();
		heroStack.push(new Hero());
		// 不能放Item
		//heroStack.push(new Item());

		// 在声明这个Stack的时候，使用泛型<Item>就表示该Stack只能放Item
		fanxing2<Item> itemStack = new fanxing2<>();
		//itemStack.push(new Item());
		// 不能放Hero
		//itemStack.push(new Hero());
	}

}

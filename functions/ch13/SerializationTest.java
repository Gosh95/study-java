package ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
class Person implements Externalizable {
프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음

	String name;
	String city;
	
	public Person() {}
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(city);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		city = in.readUTF();
	}
	
}
*/

class Person implements Serializable {
	//직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
	
	private static final long serialVersionUID = 1L;
	
	String name;
	String city;
	//transient String name;
	//transient : 직렬화 하지 않거나 할 수 없는 멤버 변수에 사용함
	public Person() {}
	
	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		Person ahn = new Person("Ahn", "Seoul");
		Person lee = new Person("Lee", "Jeju");
		
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(ahn);
			oos.writeObject(lee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("complete");
	}

}

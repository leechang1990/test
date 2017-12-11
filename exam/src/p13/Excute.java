package p13;

import java.util.ArrayList;

public class Excute {

	
	public ArrayList<Person> sort(ArrayList<Person> alPerson) {
		Person temp= new Person();
		
		for(int i=0; i<alPerson.size(); i++) {
			for(int j=i+1; j<alPerson.size(); j++) {
				if(alPerson.get(i).getAge() < alPerson.get(j).getAge()) {
			
					temp = alPerson.get(i);
					alPerson.set(i, alPerson.get(j));	
					alPerson.set(j, temp);
				}
			}
		}
		
		return alPerson;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Excute e = new Excute();
		p.setName("Lyan");
		p.setAge(22);
		ArrayList<Person> alPerson = new ArrayList <Person>();
		alPerson.add(p);

		p = new Person();
		p.setName("Tyan");
		p.setAge(33);
		alPerson.add(p);
		
		p = new Person();
		p.setName("lee");
		p.setAge(23);
		alPerson.add(p);
		
		alPerson =e.sort(alPerson);
		
		for(Person pr:alPerson) {
			System.out.println(pr);
		}
		
	}
}

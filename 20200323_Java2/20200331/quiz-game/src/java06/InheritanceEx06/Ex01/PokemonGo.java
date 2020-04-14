package java06.InheritanceEx06.Ex01;

public class PokemonGo extends GameChar{

	String name, race;
	int state;
		
	PokemonGo(){
		super(5);
		String [] ability = {"������", "������", "Ű", "���Ǹ�", "����"};
		for(int i=0;i<ability.length;i++)
			setFaculty(ability[i], 1, i);
		state = 1;
	}
	
	
	public void buildUp() {
		int [] intData = getFacultyData();
		intData[0] *= 3;
		intData[1] *= 1.5;
		intData[2] *= 2;
	}
}
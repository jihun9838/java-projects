package elevator.app;

public class Main extends Keyword {

	public static void main(String[] args) {
		Main init = new Main();
		init.Play();		
	}

	public Main() {		

		for(int i = 0 ; i < 3 ; ++i) elevator[i] = new Elevator();
		for(int i = 0 ; i < MAXFLOOR + 2 ; ++i) floor[i] = new Floor();	
	}
// �޼ҵ� �߸��� / Ű���� �߸���
	
// �޼ҵ� �����ʿ�  / ���ο��� ����¸�
// �޼ҵ� Ÿ��Ÿ������ȵ�(�ƽ� 2������)
// F**K IT
	
	
	
	
	/*
	 * ��ƽ�� �ΰ��� �׼�: �� ������ �¿��������, ���� �����̱�

	 * ���� ���� ������
			������ �ִ� ���� ��ư�� ��������
			������ �� ���� ������ ��
				��������


	 * ���� �����̳�
			ó�� 
			���� �ִ� ���� ��ư�� '��' ��������
			������ �� ���� '��' ��������

	 * ���� �����̳�
				�� ���� ������ �� �����̰�,
					���� ������
				�´� �ƴϸ� �ٻ�,,, �ϴܴ��




		���� ��� ��ٸ�
		���� �� �˻�
		���� ���¹��� �̰� ���� �������� ������  �� ������ ��
		�ƹ��͵� ������ ���� ����

	 */
	protected void Play() {
		
		int time = 0;

		while(time++ < 30) {
			
			System.out.println("TIME : " + time);

			int randFloor = 1;
			int randWay = 0;
			int randDestination = 0;


			if(time % 5 == 1) {
			// JUST ONE random input
			randWay = rand.nextInt(UP + DOWN);
			if(randWay != WAIT) {
				if(randWay == DOWN ) {		
					randFloor = rand.nextInt(MAXFLOOR - 2) + 2;
					randDestination = rand.nextInt(randFloor - 1) + 1;				
				}
				else if(randWay == UP) {
					randFloor = rand.nextInt(MAXFLOOR - 2) + 1;
					randDestination = rand.nextInt(MAXFLOOR - randFloor) + 1 + randFloor;					
				}
			}
			
			showWatingPassenger(randWay, randFloor, randDestination);
			}


			
			
			
			
			// if elevator is on hasDestination or on hitFloor >> openElevator
			for(int i = 0 ; i < ELEVATORAMOUNT ; ++i) {
				elevator[i].openElevator(floor);
			}

			
			
			
			
			//  move UP DOWN to destination of elevator
			for(int i = 0 ; i < ELEVATORAMOUNT ; ++i) {
				elevator[i].moveElevator();
			}


			
			
			
			
			// get elevator which is
			// waiting
			// same way and not far from destination
			int minDistanceElevator = -1;
			if(randWay != WAIT) {
				for(int i = 0 ; i < ELEVATORAMOUNT; ++i) {
					if(elevator[i].getWay() == WAIT) {
						minDistanceElevator = i;						
					}
					else {
						if(elevator[i].getWay() == DOWN) {
							if(elevator[i].getLowestHitFloor() - 2 > randDestination) {
								minDistanceElevator = i;
							}
						}
						else if(elevator[i].getWay() == UP) {
							if(elevator[i].getHighestHitFloor() + 2 < randDestination) {
								minDistanceElevator = i;
							}
						}
					}



					if(minDistanceElevator != -1) {
						if(elevator[minDistanceElevator].getWay() == WAIT) {
							if(elevator[minDistanceElevator].getCurrentFloor() < randFloor)
								elevator[minDistanceElevator].setWay(UP);
							else if(elevator[minDistanceElevator].getCurrentFloor() > randFloor)
								elevator[minDistanceElevator].setWay(DOWN);
						}
						elevator[minDistanceElevator].addFloors(randFloor);
						elevator[minDistanceElevator].setIsStopped(NO);
						break;
					}
				}
				
				floor[randFloor].setWay(randWay);
				floor[randFloor].addWatingPassenger(new Passenger(randDestination));
			}


			
			
			System.out.flush();
			showAllElevators();
			

		}

	}	


	// print random input
	private void showWatingPassenger(int randWay, int randFloor, int randDestination){
		String ret = "";
		if(randWay == WAIT) {
			ret += "Ÿ���� ����� �����ϴ�.";
		}
		else {
			ret += "[ " + randFloor + " ]������ ";
			if(randWay == DOWN) 		ret += "�Ʒ� ";
			else if(randWay == UP)		ret += "�� ";
			ret += "[ " + randDestination + " ]������ ���� �մϴ�.";
		}
		System.out.println(ret);
	}


	private void showElevator(int i) {
		System.out.println(elevator[i].toString());
	}
	
	private void showAllElevators() {
		for(int i = 0 ; i < ELEVATORAMOUNT; ++i)
			showElevator(i);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
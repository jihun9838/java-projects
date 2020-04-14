package elavator.app;

public class Main extends Keyword {

	public static void main(String[] args) {
		Main init = new Main();
		init.Play();		
	}

	public Main() {		

		for(int i = 0 ; i < 3 ; ++i) elevator[i] = new Elevator();
		for(int i = 0 ; i < MAXFLOOR ; ++i) floor[i] = new Floor();
	}


	protected void Play() {
		int randFloor = 1;
		int randWay = 0;
		int randPassenger = 0;
		int isWaiting = NO;
		int isMoving = NO;
		int time = 0;
		int currentFloor = 1;

		while(time++ < 100) {

			// JUST ONE random input
			randFloor = rand.nextInt(MAXFLOOR - 1) + 1;
			randWay = rand.nextInt(UP + DOWN);
			randPassenger = rand.nextInt(MAXPASSENGER - 1) + 1;







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
			 */

			// if elevator hasDestination, open
			for(int i = 0 ; i < ELEVATORAMOUNT ; ++i) {

				elevator[i].openElevator(floor);

				//				currentFloor = elevator[i].getCurrentFloor();
				//
				//				if(elevator[i].hasDestination()) {
				//					elevator[i].checkOutPassenger(currentFloor);
				//					floor[currentFloor].setWay(WAIT);
				//					elevator[i].setIsStopped(YES);
				//				}
				//				else if(elevator[i].getWay() == floor[currentFloor].getWay()) {
				//					elevator[i].checkInPassenger(floor[currentFloor]);
				//					floor[currentFloor].setWay(WAIT);
				//					elevator[i].setIsStopped(YES);
				//				}
			}


			// get elevator which is the nearest distance from hitFloor
			int minDistanceElevator = MAXFLOOR + 1;

			for(int i = 0 ; i < ELEVATORAMOUNT; ++i) {
				int distance = elevator[i].getDistanceCurrentFloorFromHitFloor(floor);
				minDistanceElevator = minDistanceElevator < distance ? minDistanceElevator : distance;
			}

			//elevator[minDistanceElevator].addFloors();







			// if passenger is waiting
			for(int i = 0 ; i < ELEVATORAMOUNT ; ++i) {
				if(elevator[i].getWay() == DOWN) {
					for(int j = i ; j > 0 ; --j) {

					}
				}
				else if(elevator[i].getWay() == UP) {
					for(int j = i ; j <= MAXFLOOR ; ++j) {
						//if(elevator[i].getCurrentFloor())
					}
				}
			}



			// else move UP DOWN to destination of elevator
			for(int i = 0 ; i < ELEVATORAMOUNT ; ++i) {
				elevator[i].moveElevator(i);
			}




			for(int i = 0 ; i < ELEVATORAMOUNT; ++i)
				showElevator(i);


		}

	}	


	private void showElevator(int i) {
		elevator[i].toString();
	}

}
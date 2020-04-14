package elevator.app;

import java.util.Random;
import java.util.Scanner;

public class Keyword {
	static final int MAXPASSENGER = 6;
	static final int MAXFLOOR = 10;
	static final int UPANDDOWN = 3;
	static final int UP = 2;
	static final int DOWN = 1;
	static final int WAIT = 0;
	static final int YES = 1;
	static final int NO = 0;
	static final int ELEVATORAMOUNT = 3;

	static final String LINE = "=================\n";

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	Elevator[] elevator = new Elevator[ELEVATORAMOUNT];
	Floor[] floor = new Floor[MAXFLOOR + 2];
}
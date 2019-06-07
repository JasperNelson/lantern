package main;

import java.io.IOException;
import java.util.ArrayList;

//this class is dedicated to methods that create randomly generated properties such as the attack for a particular monster etc.
public class initiate {
	int deadroom = 0;
	int normalroom = 1;
	int monsterhaven = 2;
	int lootroom = 3;
	int scaryroom = 4;
	int deadlyroom = 5;
	int bossroom = 6;
	int starts = 7;
	int rows = 8;
	int count = 0;
	boolean start = true;
	int columns10;
	int[][] temp = new int[100][100];
	boolean a = true;

	public initiate() {
		System.out.printf("Background: This constructor is dedicated to initializing classes");
	}

//snake-generates a map
	public int[][] StartupRoomArray() {

		int ra = 0;
		int vertchange = 1;
		int vert = 50;
		int horiz = 50;

		int horizchange = 1;
		int quota = 0;
//		boolean back = true;
//		boolean front = true;
//		boolean right = true;
//		boolean left = true;
		int direction;

		int concurrentRooms;
		if (a = true) {
			for (int rows = 0; rows < 100; rows++) {
				for (int columns = 0; columns < 100; columns++) {
					temp[rows][columns] = 0 + 0;
				}
				a = false;
			}
		}
		now: for (ra = 0; ra <= 50; ra += concurrentRooms) {
			concurrentRooms = (int) (Math.random() * 2 + 1);
			quota = 4 - concurrentRooms;
			while (quota != 0) {
				if (count <= 50) {
					break now;
				}
				direction = (int) (Math.random() * 3);
				if (start == true) {
					temp[50][50] = 1;
					start = false;
				}
				if (direction == 1 && temp[vert + 1][horiz] == 0) {
					vert -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					quota += 1;
					continueRoomArray(horiz, vert, concurrentRooms);

				} else if (direction == 2 && temp[vert][horiz + 1] == 0) {
					vert -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					quota += 1;

					continueRoomArray(horiz, vert, concurrentRooms);
				} else if (direction == 3 && temp[vert][horiz - 1] == 0) {
					vert -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					quota += 1;
					continueRoomArray(horiz, vert, concurrentRooms);
				}

			}

		}

		return (temp);
	}

	private void continueRoomArray(int horiz, int vert, int concurrentRooms) {
		int ra = 0;
		int direction;
		int quota = 0;

		concurrentRooms = (int) (Math.random() * 2);
		quota = 4 - concurrentRooms;
		now: while (count <= 50) {
			while (quota != 0) {
				direction = (int) (Math.random() * 3);
				if (count <= 50) {
					break now;
				}
				if (direction == 1 && temp[vert + 1][horiz] == 0) {
					vert -= 1;
					quota += 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				} else if (direction == 2 && temp[vert][horiz + 1] == 0) {
					vert -= 1;
					quota += 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				} else if (direction == 3 && temp[vert][horiz - 1] == 0) {
					horiz -= 1;
					quota += 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 1);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}

			}
		}
	}

	void PrintMap() {
	}

}

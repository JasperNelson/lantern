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
		int vert = 50;
		int horiz = 50;
		int quota = 0;
		int direction;
		int concurrentRooms;

		//now is an emergency break statement
		now: for (ra = 0; ra <= 50; ra += concurrentRooms) {
			
			concurrentRooms = (int) (Math.random() * 2 + 1);
			quota =  concurrentRooms;
			while (quota != 0) {
				if (count <= 50) {
					break now;
				}
				//determines the direction that the rooms will grow (like the branches of a tree)
				direction = (int) (Math.random() * 3+1);
				
				if (start == true) {
					temp[50][50] = 1;
					start = false;
				}
				//each int that direction returns will cause a room to be created as 
				//long as there is not already a room there
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

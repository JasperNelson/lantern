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
		int AdjacentRooms = 0;
		int direction;
		int concurrentRooms;

		//now is an emergency break statement
		now: for (ra = 0; ra <= 50; ra += concurrentRooms) {
			
			concurrentRooms = (int) (Math.random() * 2 + 1);
			AdjacentRooms =  concurrentRooms;
			while (AdjacentRooms != 0) {
				if (count >= 100) {
					
					break now;
				}
				//determines the direction that the rooms will grow (like the branches of a tree)
				direction = (int) (Math.random() * 4+1);
				
				if (start == true) {
					temp[50][50] = 1;
					start = false;
				}
				//each int that direction returns will cause a room to be created as 
				//long as there is not already a room there
				if(vert <= 0 || vert >= 99)
				{
					break now;
				}
				if(horiz <= 0 || vert >= 99)
				{
					break now;
				}
				if (direction == 1 && temp[vert][horiz+1] == 0) {
					horiz += 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}  else if (direction == 2 && temp[vert - 1][horiz] == 0) {
					vert -= 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}  else if (direction == 3 && temp[vert][horiz - 1] == 0) {
					horiz -= 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}
				else if(direction == 4 && temp[vert + 1][horiz] == 0)
				{
					vert += 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}
				else
				{
					for(int i =0; i < 100; i++)
						for(int j = 0; j < 100; j++)
						{
							if(temp[i][j] == 0)
							{
								vert = i;
								horiz = j;
							}
						}
				}

			}

		}

		return (temp);
	}

	private void continueRoomArray(int horiz, int vert, int concurrentRooms) {
		int ra = 0;
		int direction;
		int AdjacentRooms = 0;

		
		now: while (count <= 100) {
			concurrentRooms = (int) (Math.random() * 2);
			AdjacentRooms = 5 - concurrentRooms;
			while (AdjacentRooms != 0) {
				direction = (int) (Math.random() * 3);
				if (count >= 50) {
					break now;
				}
				direction = (int) (Math.random() * 4 + 1);
				if(vert <= 0 || vert >= 99)
				{
					break now;
				}
				if(horiz <= 0 || vert >= 99)
				{
					break now;
				}
				if (direction == 1 && temp[vert][horiz+1] == 0) {
					horiz += 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}  else if (direction == 2 && temp[vert - 1][horiz] == 0) {
					vert -= 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}  else if (direction == 3 && temp[vert][horiz - 1] == 0) {
					horiz -= 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}
				else if(direction == 4 && temp[vert + 1][horiz] == 0)
				{
					vert += 1;
					AdjacentRooms -= 1;
					temp[vert][horiz] = (int) (Math.random() * 8 + 2);
					continueRoomArray(horiz, vert, concurrentRooms);
					count++;
				}
				else
				{
					for(int i =0; i < 100; i++)
						for(int j = 0; j < 100; j++)
						{
							if(temp[i][j] == 0)
							{
								vert = i;
								horiz = j;
							}
						}
				}
				
			}
		}
	}

	void PrintMap() {
	}

}

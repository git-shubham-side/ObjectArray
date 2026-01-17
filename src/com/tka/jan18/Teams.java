package com.tka.jan18;

public class Teams {

	//CSK
	Player[] csk() {
		Player[] CSK = new Player[11];
		CSK[0] = new Player("MS Dhoni", 42, 7, "Wicket-Keeper", 5082, 0);
		CSK[1] = new Player("Ruturaj Gaikwad", 27, 31, "Batsman", 1797, 0);
		CSK[2] = new Player("Ravindra Jadeja", 35, 8, "All-Rounder", 2692, 152);
		CSK[3] = new Player("Moeen Ali", 36, 18, "All-Rounder", 1015, 35);
		CSK[4] = new Player("Devon Conway", 32, 88, "Batsman", 924, 0);
		CSK[5] = new Player("Shivam Dube", 30, 25, "All-Rounder", 1100, 4);
		CSK[6] = new Player("Ajinkya Rahane", 35, 27, "Batsman", 4642, 0);
		CSK[7] = new Player("Deepak Chahar", 31, 90, "Bowler", 80, 73);
		CSK[8] = new Player("Maheesh Theekshana", 23, 99, "Bowler", 25, 45);
		CSK[9] = new Player("Matheesha Pathirana", 21, 81, "Bowler", 10, 34);
		CSK[10] = new Player("Tushar Deshpande", 28, 20, "Bowler", 50, 42);
		return CSK;
	}
	
	//Mumbai Indians
	Player[] mi() {
		Player[] MI = new Player[11];
		MI[0]  = new Player("Rohit Sharma", 36, 45, "Batsman", 6211, 15);
		MI[1]  = new Player("Ishan Kishan", 25, 32, "Wicket Keeper", 2644, 0);
		MI[2]  = new Player("Suryakumar Yadav", 33, 63, "Batsman", 3249, 0);
		MI[3]  = new Player("Tilak Varma", 21, 9, "Batsman", 740, 0);
		MI[4]  = new Player("Hardik Pandya", 30, 33, "All-Rounder", 2309, 53);
		MI[5]  = new Player("Tim David", 27, 31, "Batsman", 659, 0);
		MI[6]  = new Player("Romario Shepherd", 29, 16, "All-Rounder", 115, 26);
		MI[7]  = new Player("Piyush Chawla", 35, 11, "Bowler", 584, 192);
		MI[8]  = new Player("Jasprit Bumrah", 30, 93, "Bowler", 56, 165);
		MI[9]  = new Player("Gerald Coetzee", 23, 13, "Bowler", 41, 25);
		MI[10] = new Player("Luke Wood", 28, 27, "Bowler", 12, 18);

		return MI;
	}
	
	//RCB
	Player[] rcb() {
		Player[] RCB = new Player[11];
		RCB[0]  = new Player("Virat Kohli", 35, 18, "Batsman", 7263, 4);
		RCB[1]  = new Player("Faf du Plessis", 39, 19, "Batsman", 4163, 0);
		RCB[2]  = new Player("Rajat Patidar", 30, 97, "Batsman", 799, 0);
		RCB[3]  = new Player("Glenn Maxwell", 35, 32, "All-Rounder", 2719, 36);
		RCB[4]  = new Player("Cameron Green", 24, 42, "All-Rounder", 452, 10);
		RCB[5]  = new Player("Dinesh Karthik", 38, 19, "Wicket Keeper", 4516, 0);
		RCB[6]  = new Player("Mahipal Lomror", 24, 99, "All-Rounder", 377, 1);
		RCB[7]  = new Player("Mohammed Siraj", 29, 73, "Bowler", 68, 93);
		RCB[8]  = new Player("Reece Topley", 30, 59, "Bowler", 21, 18);
		RCB[9]  = new Player("Yash Dayal", 26, 15, "Bowler", 13, 21);
		RCB[10] = new Player("Karn Sharma", 36, 33, "Bowler", 318, 76);
		return RCB;
	}
	
}

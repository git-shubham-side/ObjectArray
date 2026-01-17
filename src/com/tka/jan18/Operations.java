package com.tka.jan18;

public class Operations {

	Player[] t1;
   
	Operations(String team_name) {

		System.out.println("-----------------------------------------------");
		System.out.println("Please use these methods to fetch data ");
		System.out.println("-----------------------------------------------");
		System.out.println("showPlayers()---------------------Show's list of players in the team.");
		System.out.println("showAges()------------------------Show's list of players age.");
		System.out.println("showAgeBetween(range a,range b)---Show's list of players age between the range");
		System.out.println("showBatsMans()--------------------Show's list of Batsmans in the team");
		System.out.println("showAllRounder()------------------Show's list of All-Rounders in the team");
		
		
		if (team_name.equals("RCB") || team_name.equals("rcb")) {
			Teams rcb = new Teams();
			this.t1 = rcb.rcb();
		} else if (team_name.equals("CSK") || team_name.equals("csk")) {
			Teams csk = new Teams();
			this.t1 = csk.csk();
		} else if (team_name.equals("MI") || team_name.equals("mi")) {
			Teams mi = new Teams();
			this.t1 = mi.mi();
		} else {
			System.out.println("Provided team not found.");
		}
	}

	//LIST OF PLAYERS
	void showPlayers() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here's The List of Players");
		System.out.println("-----------------------------");
		System.out.println("Name " + "Age " + "Jersy-Number " + "Role " + "Runs " + "Wickets ");
		System.out.println("-----------------------------");
		for (int i = 0; i < this.t1.length; i++) {
			System.out.println(t1[i].getName()+ "     " +t1[i].getAge()+ "  " +this.t1[i].getJersy_no()+ "    "+this.t1[i].getRole()+ "  " +this.t1[i].getRuns()+"    "+this.t1[i].getWickets());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	//LIST OF ALL PLAYER IN THE TEAM
	void showAges() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Here's The List of Players Age");
		System.out.println("-----------------------------");
		System.out.println("Name  Age");
		for (int i = 0; i < this.t1.length; i++) {
			System.out.println(this.t1[i].getName() + "  " + this.t1[i].getAge());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	// PROVIDE RANGE FOR THE AGE
		void showAgeBetween(int a, int b) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Here's The List of Players Age between:" + a + " to " + b);
			System.out.println("-----------------------------");
			for (int i = 0; i < this.t1.length; i++) {
				if ((this.t1[i].getAge()) >= a && (this.t1[i].getAge() <= b)) {
					System.out.println(this.t1[i].getName() + "  " + this.t1[i].getAge() + " " + this.t1[i].getRole());
				}
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		// SHOW BATSMANS
		void showBatsMans() {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Here's The List of Team Batsmans");
			System.out.println("-----------------------------");
			for (int i = 0; i < this.t1.length; i++) {
				if (this.t1[i].getRole() == "Batsman") {
					System.out.println("Role: " + this.t1[i].getName() + " " + "Runs:" + this.t1[i].getRuns());
				}
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		// Only All-Rounder
		void showAllRounder() {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Here's The List of All-Rounders");
			System.out.println("-----------------------------");
			for (int i = 0; i < this.t1.length; i++) {
				if (this.t1[i].getRole() == "All-Rounder") {
					System.out.println("All-Rounder: " + this.t1[i].getName());
				}
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}
}

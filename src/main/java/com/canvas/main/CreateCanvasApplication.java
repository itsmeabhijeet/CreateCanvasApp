package com.canvas.main;

import java.util.Scanner;

import com.canvas.entity.Canvas;

/**
 * @author Abhijeet Gupta Main class to test the App
 *
 */
public class CreateCanvasApplication {

	Canvas canvas;

	public CreateCanvasApplication() {
		canvas = new Canvas();
	}

	public static void main(String[] args) throws NumberFormatException {
		CreateCanvasApplication app = new CreateCanvasApplication();
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while (!command.toUpperCase().equals("Q")) {
			System.out.println("\nEnter command:");
			command = scan.nextLine();
			app.draw(command);
		}
		System.out.println("Program Exited!");
		scan.close();
	}

	private void draw(String command) throws NumberFormatException {
		char ch = Character.toUpperCase(command.charAt(0));
		String[] cmd;
		try {
			switch (ch) {
			case 'C':
				cmd = command.split(" ");
				this.canvas = new Canvas(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
				System.out.println(this.canvas.render());
				break;
			case 'L':
				cmd = command.split(" ");
				this.canvas.drawLine(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]),
						Integer.parseInt(cmd[4]), 'X');
				System.out.println(this.canvas.render());
				break;
			case 'R':
				cmd = command.split(" ");
				this.canvas.drawRectangle(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]),
						Integer.parseInt(cmd[4]), 'X');
				System.out.println(this.canvas.render());
				break;
			case 'B':
				cmd = command.split(" ");
				this.canvas.bucketFill(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), cmd[3].charAt(0));
				System.out.println(this.canvas.render());
				break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nInvalid command. Try again!!\n");
		} catch (Exception e) {
			System.out.println("\nError Occurred : " + e.getMessage() + "\nPlease try again");
		}
	}

}

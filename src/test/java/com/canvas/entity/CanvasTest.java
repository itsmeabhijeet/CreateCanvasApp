package com.canvas.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CanvasTest {

	@Test
	public void ConstructorCalled_ValidDimensions_ShouldReturnCanvas() {
		Canvas canvas = new Canvas(20, 4);
		assertEquals(canvas.render(),
		        "----------------------\n" +
		        "|                    |\n" +
		        "|                    |\n" +
		        "|                    |\n" +
		        "|                    |\n" +
		        "----------------------");
	}

	@Test
	public void drawLine_ValidData_ShouldReturnCanvas() {
		Canvas canvas = new Canvas(3, 5);
		canvas.drawLine(1, 2, 1, 4, 'x');
		 assertEquals(canvas.render(),
			        "-----\n" +
			            "|   |\n" +
			            "|x  |\n" +
			            "|x  |\n" +
			            "|x  |\n" +
			            "|   |\n" +
			            "-----");
		}

	@Test
	public void drawRectangle_validData_ShouldReturnCanvas() {
		Canvas canvas = new Canvas(8, 4);
		canvas.drawRectangle(2, 1, 6, 3, 'x');
		assertEquals(canvas.render(),
	            "----------\n" +
	            "| xxxxx  |\n" +
	            "| x   x  |\n" +
	            "| xxxxx  |\n" +
	            "|        |\n" +
	            "----------");
	}

	@Test
	public void bucketFill_ValidData_ShouldReturnCanvas() {
		Canvas canvas = new Canvas(8, 4);
		canvas.drawRectangle(2, 1, 6, 3, 'x');
		canvas.bucketFill(3, 2, 'o');
		assertEquals(canvas.render(),
			    "----------\n" +
			            "| xxxxx  |\n" +
			            "| xooox  |\n" +
			            "| xxxxx  |\n" +
			            "|        |\n" +
			            "----------");
		}

}

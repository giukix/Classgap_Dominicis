package it.classgap.dominicis;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomPoints {
	
	public List<Point> getRandomPointList(List<Point> pointsAlreadyPresents, int xDimension, int yDimension, int numberOfPointsToGenerate) {
		List<Point> pointList = new ArrayList<>();
		
		Random random = new Random();
		int generatedNumbers = 0;
		
		while(generatedNumbers < numberOfPointsToGenerate) {
			boolean numberFound = false;
			while(!numberFound) {
				int xNum = random.nextInt(xDimension);
				int yNum = random.nextInt(yDimension);
				Point newPoint = new Point(xNum, yNum);
				if(pointsAlreadyPresents.stream().noneMatch(p -> p.equals(newPoint)) && 
						pointList.stream().noneMatch(p -> p.equals(newPoint))) {
					numberFound = true;
					pointList.add(newPoint);
				}
			}			
			generatedNumbers++;
		}
		
		
		return pointList;
		
	}

	public static void main(String[] args) {
		int xDim = 10;
		int yDim = 5;
		List<Point> pointList = Arrays.asList(new Point(2,2), new Point(3,3));
		
		RandomPoints randomPoints = new RandomPoints();
		
		List<Point> generatedPoints = 	randomPoints.getRandomPointList(pointList, xDim, yDim, 3);
		
		System.out.println(generatedPoints);
	}

}

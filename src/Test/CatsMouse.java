package Test;

import java.util.Scanner;

public class CatsMouse {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   int z=sc.nextInt();
	   catAndMouse(x,y,z);

	}

private static void catAndMouse(int x, int y, int z) {
	// TODO Auto-generated method stub
	int d1=z-x;
	int d2=z-y;
	if(x>z && y<z) {
		System.out.println("Cat B");
	}
	else if(x<z && y>z){
		System.out.println("Cat A");
		
	}
	else if(d1==d2) {
		System.out.println("Mouse c");
	}
}
}

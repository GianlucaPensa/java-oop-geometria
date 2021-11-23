package org.generation.italy.geometria;

public class Rettangolo {

	int height;
	int base;
	
	Rettangolo(int height, int base){
		this.height = height;
		this.base = base;
	}
	
	int calcolaArea(){
		int area = height * base;
		return area;
	}
	
	int calcolaPerimetro(){
		int perimeter = (height+base) * 2;
		return perimeter;
	}

}

package stringsAll;

import java.util.Scanner;
class Pal
{

public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);

System.out.println("Enter the Frist Date");
System.out.println("Enter day(dd) :");
int d1=sc.nextInt();
System.out.println("Enter month(mm) :");
int m1=sc.nextInt();
System.out.println("Enter year(yyyy) :");
int y1=sc.nextInt();


System.out.println("Enter the Second Date");
System.out.println("Enter day(dd) :");
int d2=sc.nextInt();
System.out.println("Enter month(mm) :");
int m2=sc.nextInt();
System.out.println("Enter year(yyyy) :");
int y2=sc.nextInt();

System.out.println();



System.out.println();
if(y2>y1) {
if(d2<d1){

	if(m2==3){
		
		if(y2%100!=0 && y2%4==0 || y2%400==0) {
		d2=d2+29;
		}
		
	else
	{
		d2=d2+28;
	}
	
			}
	else if(m2==5||m2==7||m2==10||m2==12) {
		d2=d2+30;
	}
	else {
		d2=d2+31;
	}
	m2=m2-1;	
}
if(m2<m1)
{
	m2=m2+12;
	y2=y2-1;
}

int y=y2-y1;
int m=m2-m1;
int d=d2-d1;


System.out.println("The years :"+ y);
System.out.println("The months :"+ m);
System.out.println("The days :"+ d);
}


if(y2<y1) {
if(d2>d1){

	if(m2==3){
		
		if(y2%100!=0 && y2%4==0 || y2%400==0) {
		d2=d2+29;
		}
		
	else
	{
		d2=d2+28;
	}
	
			}
	else if(m2==5||m2==7||m2==10||m2==12) {
		d2=d2+30;
	}
	else {
		d2=d2+31;
	}
	m2=m2-1;	
}


if(m2>m1)
{
	m2=m2+12;
	y2=y2-1;
}


int y=y1-y2;
int m=m1-m2;
int d=d1-d2;


System.out.println("The years :"+ y);
System.out.println("The months :"+ m);
System.out.println("The days :"+ d);
}

System.out.println();
if(y2==y1) {
	int y=y2-y1;
	int m=m2-m1;
	int d=d2-d1;

	System.out.println("The years :"+ y);
	System.out.println("The months :"+ m);
	System.out.println("The days :"+ d);
}



}

}
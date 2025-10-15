package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program {
	
	public static void main(String[] args) {
		Student[] arr = 
			{
					new Student (1,"Shruti","Pune",89.7),
					new Student(3,"Asihanya","Raipur",67.7),
					new Student(2,"Ekta","Pune",87.7),
					new Student(4,"Namami","Raipur",60.7),
					new Student(5,"Arti","Pune",59.7),
					new Student(6,"Khushboo","Raipur",69.7),
					new Student(7,"Pragya","Bangalore",80.7)
			};
		//1st level sorting based on city in desc order
		System.out.println("1st level Sorting Based on City in Desc order");
		System.out.println("Before Sorting:");
		for(Student s: arr)
		{
			System.out.println(s);
		}
		class StudentFirstLevel implements Comparator<Student> {
            @Override
            public int compare(Student x, Student y) {
               return y.getCity().compareTo(x.getCity());
            }
        }

        StudentFirstLevel sComparator = new StudentFirstLevel();
        Arrays.sort(arr, sComparator);
        System.out.println("=================================================================");
		System.out.println("After Sorting:");
		for(Student p: arr)
		{
			System.out.println(p);
		}
		
		
		//2st level Sorting Based on marks in Desc order
		System.out.println("------------------------------------------------------------------");
		System.out.println("2st level Sorting Based on marks in Desc order");
		System.out.println("Before Sorting:");
		for(Student s: arr)
		{
			System.out.println(s);
		}
		class StudentSecondLevel implements Comparator<Student>
		{
			@Override
			public int compare(Student x, Student y)
			{
				int diff = y.getCity().compareTo(x.getCity());
						if(diff!=0)
						{
							return y.getCity().compareTo(x.getCity());
						}
						else
							return - Double.compare(x.getMarks(),y.getMarks());
			}
		}
		StudentSecondLevel student = new StudentSecondLevel();
		Arrays.sort(arr,student);
		System.out.println("=================================================================");
		System.out.println("After Sorting:");
		for(Student s: arr)
		{
			System.out.println(s);
		}
		
		
		//3rd level Sorting Based on name in Asc order
		System.out.println("------------------------------------------------------------------");
		System.out.println("3rd level Sorting Based on name in Asc order");
		System.out.println("Before Sorting:");
		for(Student s: arr)
		{
			System.out.println(s);
		}
		class StudentThirdLevel implements Comparator<Student>
		{
			public int compare(Student x, Student y)
			{
				int city = y.getCity().compareTo(x.getCity());
				int marks = Double.compare(y.getMarks(),y.getMarks());
				int name = x.getName().compareTo(y.getName());
				if(city!=0)
				{
					return city;
				}
				else
				{
					if(marks!=0)
					{
						return marks;
					}
					else
					{
						return name;
					}
				}
			}
		}
		StudentThirdLevel std = new StudentThirdLevel();
		Arrays.sort(arr,std);
		System.out.println("=================================================================");
		System.out.println("After Sorting:");
		for(Student s: arr)
		{
			System.out.println(s);
		}
	}

}

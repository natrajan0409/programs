package Test;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class test {

			 public static void main(String[] args) {
				 
				 int a[]= {60,50,78,88,94,14};
				 int a2;
				 
			
				 
				 for(int i=0;i<a.length;i++)
				 {
					 for(int j=i+1;j<a.length;j++)
						 
					 {
						 if(a[i]>a[j])
						 {
							 a2=a[i];
							 a[i]=a[j];
							 a[j]=a2;
									 
							
						 }
						 
					 }
					 System.out.print(a[i]+",");

				 }
			 }
			 }
				
			

			


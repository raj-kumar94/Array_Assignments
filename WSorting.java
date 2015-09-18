class WSorting
{
int sort(int a[]){
int i,j,small,large;
int pos=0;
small= a[0];
for(i=0;i<a.length;i++)   //finding smallest
{
	if(small>a[i])
	small=a[i];
}
System.out.print("array: ");
	large=a[0];
			for(i=0;i<a.length;i++)  //finding largest and replacing with the smallest element
			{
			System.out.print(a[i]+ ", ");
				if(large<a[i])
				 {
				   large= a[i];
				    pos = i;
				 }
          			 
			}	  a[pos]= small;	
		return large;
		
}		
	

public static void main(String... s)
{
int a[] = {2,9,40,50,16,1,18};
WSorting w = new WSorting();
int b=w.sort(a);
System.out.println("largest: "+b);

int c=w.sort(a);
System.out.println("second largest: "+c);

int d=w.sort(a);
System.out.println("third largest: "+d);

}

}	

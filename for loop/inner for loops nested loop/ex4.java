//pattern ###
//		  ###
//        ###




class ex4
{
	public static void main(String[] args) 
	{
	 for (int i=1;i<=3;i+=1) 
	 {
	 	for (int j=1;j<=3 ;j+=1 ) {
	 		System.out.print("#");
	 	}
	 		System.out.println();
	 }	
	}
}





/*
tracing of code..


o.f ->  i = 1; 1<3 >true;
if -> i =1; 1<3 . true
"#_"
j++ = 2;
if > j = 2<3; true;
"##_"
j++ = 3;
if > j = 2<3; true;
"###_"
j++ = 4;
if > j = 4<3; false;


of=> i=2; 2<3; >true;

if 
j->1 ;1<=3; >true;
"#_"
J+=1 > 2
j->2 ;2<=3; >true;
"##_"
J+=1 > 3
j->3 ;3<=3; >true;
"###_"
J+=1 > 4
j->4 ;4<=3; >false;


of=> i=3 3=3 >true;

if
j->1 ;1<=3; >true;
"#_"
J+=1 > 2
j->2 ;2<=3; >true;
"##_"
J+=1 > 3
j->3 ;3<=3; >true;
"###_"
J+=1 > 4
j->4 ;4<=3; >false;





*/
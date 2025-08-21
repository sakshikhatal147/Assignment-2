/////////////*************constructor overloading***************///////////

public class Studentinfo{
int roll;
String name;
int marks;

public Studentinfo(){//no argument constructor
roll = 1;
name = "sai";
marks = 10;
System.out.println("Roll No :"+roll+ " Name : "+name+ " Marks :"+marks);
}


public Studentinfo(int r){//one argument constructor
roll =r;
System.out.println("Roll No :"+roll);
}


public Studentinfo(int r, String n){//two argument constructor
roll=r;
name=n;
System.out.println("Roll No :"+roll+ " Name : "+name);
}


public Studentinfo(int r, String n, int m){//three argument constructor
roll=r;
name=n;
marks=m;
System.out.println("roll No :"+roll+ " Name : "+name+ " Marks :"+marks);
}
public static void main(String args[]){
Studentinfo s1 = new Studentinfo();
Studentinfo s2 = new Studentinfo(2);
Studentinfo s3 = new Studentinfo(3, "sakshi");
Studentinfo s4 = new Studentinfo(4, "shruti", 20);

}
}
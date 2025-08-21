public class Book1{
int id;
String book;
String author;

public Book1(int id, String book, String author)
{
 this.id=id;
 this.book=book;
 this.author=author;
}

public void display()
{
System.out.println(" Book id: " + id + "\n Book Name: " + book + "\n Author : " +  author);
}

public static void main(String args[]){
Book1 b= new Book1(1,"The Story","Shubh");
b.display();
 }
}
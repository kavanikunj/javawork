package demo;

class Student {


	int stdid;
	String clgname;
	String stdname;

    Student( int stdid,String clgname,String stdname)
    {
    	this.stdid =stdid;
    	this.clgname=clgname;
    	this.stdname=stdname;
    }
    
    void display() {
    	System.out.println(stdid+""+clgname+""+ stdname);
    }

}
public class p6 {

	public static void main(String[] args) {

	Student s1 = new Student(10,"om","raj");
	s1.display();
	
 
	}
	
}


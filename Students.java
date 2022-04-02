package week3.day1;

//Assignment 4:
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
public class Students {

	int id;
	String name;
	String email;
	Long phoneNumber;
	
	Students() {
		System.out.println("I am Default Studen");
		
	}
	Students(int id){
		this.id=id;
		System.out.println("I am single Student");
	}
	
	Students(int id, String name){
		this.id=id;
		this.name=name;
		System.out.println("I am double Student");
		
	}
	
	Students(String email, Long phoneNumber){
		this.email=email;
		this.phoneNumber=phoneNumber;
		System.out.println("I am Final Student");
		
	}
	public static void main(String[] args) {
		Students stud1= new Students();
		
		Students stud2= new Students(1);
		System.out.println("My student Id is "+stud2.id);
		
		Students stud3=new Students(002,"Muthu");
		System.out.println("My student Id is "+stud3.id);
		System.out.println("My student Name is "+stud3.name);
   
		Students stud4= new Students("muthubc@gmail.com",9876654332112L);
			System.out.println("My EmailId is "+stud4.email);
			System.out.println("My PhoneNumber is "+stud4.phoneNumber);
		}
	}



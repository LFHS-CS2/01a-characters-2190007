class Employee {
  private String firstName;   // the first name of the employee
  private char middleInitial; // the middle initial
  private String lastName;    // the last name of the employee
  
  public Employee(String firstName, char middleInitial, String lastName)
  {
    this.firstName = firstName;
    this.middleInitial = middleInitial;
    this.lastName = lastName;
  }
  
  public String getFirstName() { return firstName; }
  public char getMiddleInitial() { return middleInitial;}
  public String getLastName() { return lastName; }
	public boolean hasDoubleName(){
		if(lastName.equals(firstName)){
			return true;
		} else{
			return false;
		}
	}
	public char getLastInitial(){
		return lastName.charAt(0);
	}
  
	public int getNameLength(){
		int nl = lastName.length();
		nl = nl + 1 + firstName.length();
		return nl;
	}
	public String getFullName(){
		String ucfn = firstName.toUpperCase();
		String fn = ucfn + " " + middleInitial + ". ";
		String ucln = lastName.toUpperCase();
		fn = fn + ucln;
		return fn;
	}
	public String getMonogram(){
		String mono = firstName.charAt(0) + middleInitial + lastName.charAt(0);
		String ucmono = mono.toLowerCase();
		return ucmono;
	}
 
 
}

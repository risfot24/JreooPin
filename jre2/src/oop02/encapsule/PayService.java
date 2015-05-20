package oop02.encapsule;

public class PayService {
	
	// 
	//private double income;
	PayVO VO = new PayVO();
	
public void exe(String name, int salary) {
  //int  tax = 0;
  
  VO.setSalary(salary);
 int income = (int) VO.getSalary() - VO.getSalary()*(1- (int)VO.tax); 
  //tax = salary * (int)VO.getTax();
  

  VO.setIncome(income);
  VO.setName(name);
  
 
}

public void output() {	
	//System.out.print("이름 : "+VO.getName()+"\n");
	//System.out.print("수입 : "+VO.getIncome());
	//System.out.println("세금 :  "+tax);
	  // name = VO.getName();
	  //VO.getIncome();
}

public int income(){ 
	return (int) VO.getIncome(); 
}

public String name(){
	return VO.getName();
    
}
public int Salary(){
	return VO.getSalary();
}
  
public int taxcalc() {
	//tax = salary * (int)VO.getTax();
	int tax = VO.getSalary()* (int)VO.tax ;
	return tax;
}
 



}

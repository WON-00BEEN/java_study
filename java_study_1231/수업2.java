package java_study_1231;

import java.util.ArrayList;

class Emp{
	String ename;
	int sal; //급여
	String dname; //부서
	String job; //담ㅁ당업무
	
	Emp (String ename, int sal, String dname, String job){
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		 this.job = job;
	   }
	}


public class 수업2 {

	public static void main(String[] args) {
		/*
		 * ***ArrayList
		 * 
		 * ***HashMap
		 */
		
		
		ArrayList<Emp> emp = ArrayList<Emp>();
		
		emp.add(new Emp("KING", 5000, "PRESIDENT", "ACCOUNTING"));
		emp.add(new Emp("JONSE", 2975, "SALEMAN", "SALES"));
        emp.add(new Emp("ALLEN", 1250, "SALEMAN", "SALES"));
	    emp.add(new Emp("TURNER", 1500, "SALEMAN", "SALES"));
	    
	    Emp e1 = emp.get(1);
	    System.out.println("사원이름 :"+e1.ename);
	    System.out.println("사원급여 :"+e1.sal);
	    
	    //모든 사원의 급여 총합과 급여 평균을 조회
	      int salSum = 0; //급여 총합
	      int salAvg = 0; //급여 평균
	      for(Emp e : emp) {
	         salSum += e.sal; //list에 저장된 각 사원 sal 합산하기
	      }
	      System.out.println("사원 총급여 : " + salSum);
	      salAvg = salSum / emp.size();
	      System.out.println("사원 총급여 평균 : " + salAvg);
	      
	      //퀴즈 : 'SALES' 부서에서 일하는 사원 수 구하기
	      
	      
	      
	      
	      //퀴즈: tkdnjsdlfma사원이름 Allen, Turner 급여와 부서 조회
	      
	      for(Emp e : emp) {
	    	  if(e.ename.equals("ALLEN") || e.ename.equals("TURNER")) {
	              System.out.println("사원 급여 : " + e.sal);
	              System.out.println("해당 사원 부서 : " + e.dname);
	           }
	        }
	        

	    	  
	    	  
	    	  
	      }
	      
	      
	   }
package priorityQueue;
import java.util.*;
public class ComparitorsAndComparable {
     static class Student implements Comparable <Student>{
		 int roll;
    	 int wt;
    	 int ht;
    public Student(int roll, int wt, int ht) {
 			this.roll=roll;
 			this.wt=wt;
 			this.ht=ht;
 		}
	@Override
	public int compareTo(Student o) {
		return this.wt-o.wt;
	}
    	 
     }
	public static void main(String[] args) {
	PriorityQueue<Student>pq=new PriorityQueue<>();
	pq.add(new Student(13,170,50));
	pq.add(new Student(26,150,90));
	pq.add(new Student(39,180,60));
	pq.add(new Student(52,190,80));
	pq.add(new Student(65,150,200));
	
	while(pq.size()>0) {
		Student val=pq.remove();
		System.out.println(val.roll+" "+val.wt+" "+val.ht);
	}

	}

}

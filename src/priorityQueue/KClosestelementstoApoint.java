package priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KClosestelementstoApoint {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [][]points=new int[n][2];
	for(int i=0;i<points.length;i++) {
		for(int j=0;j<points[i].length;i++) {
			points[i][j]=sc.nextInt();
		}
	}
	int k=sc.nextInt();
	int[][] p=kClosest(points,k);
	System.out.println(p.toString());
	}
	public static class pair implements Comparable <pair>{
		int d;
		int x;
		int y;
		pair(int d,int x,int y){
			this.d=d;
			this.x=x;
			this.y=y;
		}
		public int compareTo(pair o) {
			return o.d-this.d;
		}
	}
	 public static int[][] kClosest(int[][] points, int k) {
	  PriorityQueue<pair>pq=new PriorityQueue<>();
	  int x1=0,y1=0;
	  for(int i=0;i<points.length;i++) {
		  int x2=points[i][0];
		  int y2=points[i][1];
		  int d=(int)(Math.pow(x1-x2,2))+(int)(Math.pow(y1-y2,2));
		  if(i<k) {
			  pq.add(new pair(d,x2,y2));
		  }
		  else {
			  if(pq.peek().d > d) {
				  pq.remove();
				  pq.add(new pair(d,x2,y2));
			  }
		  }
	  }
	  int [][]ans=new int[k][2];
	  for(int i=0;i<ans.length;i++){
		  pair p=pq.remove();
		  ans[i][0]=p.x;
		  ans[i][1]=p.y;
	  }
	  return ans;    
	 }
}

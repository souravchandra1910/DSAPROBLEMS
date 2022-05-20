import java.util.*;

public class Graph01 {
static class edge{
	int src;
	int nbr;
	int wt;
	public edge(int src,int nbr,int wt) {
		this.src=src;
		this.nbr=nbr;
		this.wt=wt;
	}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int ver=sc.nextInt();
	ArrayList<edge>[]graph =new ArrayList[ver];
for(int i=0;i<ver;i++) {
	graph[i]=new ArrayList<>();
}
int edge=sc.nextInt();
for(int i=0;i<edge;i++) {
	
}
	}

}

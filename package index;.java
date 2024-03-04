import java.util.*;

class l{
	String boy;
	String girl;
	char b[]=new char[50];
	char g[]=new char[50];
	char m[]=new char[30];
	int a;
	int y;
	void ab(int y,int z) {
		for(int x=0;x<y;x++) {
			b[x]=boy.charAt(x);
		}
		for(int x=0;x<z;x++) {
			g[x]=girl.charAt(x);
		}
	}
	void var(int sum) {
		this.a=sum%6;
	}

	public static void main(String[] args) {
		l a=new l();
	Scanner s=new Scanner(System.in);	
	int strike=0;
	int sum;
	int sub;
	int m=0;
	int n=0;
	System.out.print("FLAMES TEST\n\n");
		System.out.print("Enter Boy's Name: ");
		a.boy=s.nextLine();
		System.out.print("Enter Girl's Name: ");
		a.girl=s.nextLine();
		if(a.boy!=a.girl) {
		int y=a.boy.length();
		int z=a.girl.length();
		a.ab(y,z);
		
		for(int i=0;i<y;i++) {
			for(int j=0;j<z;j++) {
				
				if(a.b[i]==a.g[j]) {
					strike+=1;
					a.g[j]='+';
					break;
				}
			}
		}
		for(int i=0;i<y;i++) {
			if(a.b[i]==' ') {
				m+=1;
		}}
			
		for(int j=0;j<z;j++) {
				if(a.g[j]==' ') {
					n+=1;
			}	
			}
		y-=m;
		z-=n;
		sum=y+z;
		sub=strike*2;
		sum=sum-sub;
		a.var(sum);
		if(a.a==1) {
			System.out.println(a.boy+" AND "+a.girl+" ARE FRIENDS!");
		}
		else if(a.a==2) {
			System.out.println(a.boy+" AND "+a.girl+" ARE LOVERS!");
		}
		else if(a.a==3) {
			System.out.println(a.boy+" HAS AFFECTION ON "+a.girl);
		}
		else if(a.a==4) {
			System.out.println(a.boy+" IS GONNA MARRY "+a.girl);
		}
		else if(a.a==5) {
			System.out.println("SORRY!\n"+a.boy+ " AND " +a.girl+" ARE ENEMIES!");
		}
		else if(a.a==6 || a.a==0) {
			System.out.println(a.boy+" AND "+a.girl+" ARE BROTHERS AND SISTERS!");
		}
	}
		else {
			System.out.print("both names are equal,so we cannot do the flames test");
		}
	}
}
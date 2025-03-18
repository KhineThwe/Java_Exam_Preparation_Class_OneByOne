
public class NestedLoop {

	public static void main(String[] args) {
        int n = 5;//n=5
        for(int i=0;i<=n;i++) {//i=0//i=1
        	for(int j=0;j<=n;j++) {//j=0---j=6
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}

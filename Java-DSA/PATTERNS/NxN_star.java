import java.util.*;

public class NxN_star
{
	public static void main(String args[]) {

        System.out.println("PLEASE ENTER VALUE OF 'N' --> ");
		Scanner st = new Scanner(System.in);
		int n = st.nextInt();
		sc.close();
		for ( int i=0; i<n; i++ ){
			for ( int j=0; j<n; j++ ){
				System.out.print("#");
			}
			System.out.println(); 
		}
		 
	}
}
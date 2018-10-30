package Package1;

public class StringSplit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main = "Alpha,Beta,Gamma,Delta,Sigma";
		String[] arrSplit =main.split(",");
		System.out.println(arrSplit);
		for(int i=0;i<arrSplit.length;i++)
		{
			System.out.println(arrSplit[i]);
		}
	}

}

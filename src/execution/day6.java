package execution;
class Customer{
	private int cId;
	private String cName;
	private int cNum;
	public Customer() {
		cId=1;
		cName="yogesh";
		cNum=9094445;
	}
	public Customer(int cId, String cName,int cNum) {
		this();
	}
	public int getcId() {
		return cId;
	}
	public String getName(){
		return cName;
	}
	public int getNum(){
		return cNum;
	}
}

public class day6 {
	public static void main(String[]args) {
		Customer c1=new Customer(2,"Sabari",909487);
		System.out.println(c1.getcId());
		System.out.println(c1.getName());
		System.out.println(c1.getNum());
	}

}

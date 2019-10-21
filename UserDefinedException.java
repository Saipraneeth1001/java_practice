
class UserDefinedException extends Exception {

	private int amount;
	private int total;
	public UserDefinedException(int amount, int totalBalance){

		this.amount = amount;
		this.total = totalBalance;

	}
	public String toString(int amount,int total){

		return "you cannot withdraw this amount "+ this.amount +"\n"
		+"your current balance is "+this.total;
	}
}

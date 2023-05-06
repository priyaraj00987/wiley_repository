package wiley_core_java;

interface Bank{
	void account();
}

interface Bank1{
	void account();
}

interface ATM extends Bank, Bank1{
	void insertCard();
	void selectOption();
	void enterPin();
}

interface AA{
	void m1();
}

abstract class NewATM implements ATM, AA {

	@Override
	public void account() {
		// TODO Auto-generated method stub
		System.out.println("Account from bank");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}
}


public class InterfaceBank extends NewATM{
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert card");
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("SElect option");
	}

	@Override
	public void enterPin() {
		// TODO Auto-generated method stub
		System.out.println("Enter PIN: ");
	}
	public static void main(String[] args) {
		InterfaceBank i = new InterfaceBank();
		i.insertCard();
		i.selectOption();
		i.enterPin();
		i.account();
		i.m1();
	}
}

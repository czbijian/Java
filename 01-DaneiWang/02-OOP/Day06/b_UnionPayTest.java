//银行卡系统
public class b_UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM();//atm机对象
		UnionPay card = new ABCImpl();//银联卡
		atm.insertCard(card);//插卡
		atm.payTelBill();
	}
}

class ABCATM{
	private UnionPay card;//银联卡
	public void insertCard(UnionPay card) {
		this.card = card;
	}
	public void payTelBill() {//支付电话费--入口
		if(card instanceof ABC) {//农行卡
			ABC abcCard = (ABC)card;//强制为农行卡
			abcCard.payTelBill("123456", 50);
		}else {//不是农行卡
			System.out.println("不是农行卡，不能支付电话费");
		}
	}
}

interface UnionPay{//银联接口
	public double getBalance();//查询余额
	public boolean drawMoney(double number);//取钱
	public boolean checkPwd(String input);//检查密码
}

interface ICBC extends UnionPay{
	public void payOnline(double number);//在线支付
}

interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum, double sum);//支付电话费
}

class ICBCImpl implements ICBC{
	public double getBalance() {return 0.0;}//查询余额
	public boolean drawMoney(double number) {return true;}//取钱
	public boolean checkPwd(String input) {return true;}//检查密码
	public void payOnline(double number) {}//在线支付
}

class ABCImpl implements ABC{
	public double getBalance() {return 0.0;}//查询余额
	public boolean drawMoney(double number) {return true;}//取钱
	public boolean checkPwd(String input) {return true;}//检查密码
	public boolean payTelBill(String phoneNum, double sum) {
		System.out.println("支付成功");
		return true;
	}//支付电话费
}


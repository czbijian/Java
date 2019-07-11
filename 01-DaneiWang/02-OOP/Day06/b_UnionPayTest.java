//���п�ϵͳ
public class b_UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM();//atm������
		UnionPay card = new ABCImpl();//������
		atm.insertCard(card);//�忨
		atm.payTelBill();
	}
}

class ABCATM{
	private UnionPay card;//������
	public void insertCard(UnionPay card) {
		this.card = card;
	}
	public void payTelBill() {//֧���绰��--���
		if(card instanceof ABC) {//ũ�п�
			ABC abcCard = (ABC)card;//ǿ��Ϊũ�п�
			abcCard.payTelBill("123456", 50);
		}else {//����ũ�п�
			System.out.println("����ũ�п�������֧���绰��");
		}
	}
}

interface UnionPay{//�����ӿ�
	public double getBalance();//��ѯ���
	public boolean drawMoney(double number);//ȡǮ
	public boolean checkPwd(String input);//�������
}

interface ICBC extends UnionPay{
	public void payOnline(double number);//����֧��
}

interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum, double sum);//֧���绰��
}

class ICBCImpl implements ICBC{
	public double getBalance() {return 0.0;}//��ѯ���
	public boolean drawMoney(double number) {return true;}//ȡǮ
	public boolean checkPwd(String input) {return true;}//�������
	public void payOnline(double number) {}//����֧��
}

class ABCImpl implements ABC{
	public double getBalance() {return 0.0;}//��ѯ���
	public boolean drawMoney(double number) {return true;}//ȡǮ
	public boolean checkPwd(String input) {return true;}//�������
	public boolean payTelBill(String phoneNum, double sum) {
		System.out.println("֧���ɹ�");
		return true;
	}//֧���绰��
}


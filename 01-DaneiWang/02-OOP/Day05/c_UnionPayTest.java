//���п�ϵͳ
public class c_UnionPayTest {

	public static void main(String[] args) {
		ICBCImpl card1 = new ICBCImpl();//���п�
		ICBC 	 card2 = new ICBCImpl();//���п�
		UnionPay card3 = new ICBCImpl();//������----���ʣ����п�			
		
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
	public boolean payTelBill(String phoneNum, double sum) {return true;}//֧���绰��
}

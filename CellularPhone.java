public class CellularPhone
// �C���X�^���X�ϐ��̒�`
//�d�b�ԍ�
String telephoneNumber;
//�d�r�c��
int batteryRemaining = 100;

//�R���g���N�^�̒�`
public CellularPhone (String telNum){
telephoneNumber = telNum;
}
//���\�b�h�̒�`
//���M
public void receiveCall(String caller){
System.out.println("ring! ring!ring!");
System.out.println("Calling from"+ caller);
}
//�ʘb
public void talkSomething (String mag){
System.out.println("["+msg+"]");
}
//�ؒf
public void hangUp(){
System.out.println("bye!");
butteryRemaining = batteryRemaining - 10;
System.out.println("batteryremaining = "+batteryremaining);
}
}

public class Someone { 
public static void main (String [] args) {
//���M�҂̔ԍ�
String caller = "987-6543";
//CellularPhone �I�u�W�F�N�g�̐���
CellularPhone cp = new CellularPhone("123-4567");
System.out.println("--------------------");

//1��ڂ̒ʘb
// �쐬�����g�ѓd�b�ɒ��M�̃��b�Z�[�W�𑗂�
cp.receiveCall(caller);
cp.talkSomething("���q�͂ǂ��H");
cp.talkSomething("����ł́I");
cp.hangUp();
System.out.println("-----------------------");

//2��ڂ̒ʘb
cp.receiveCall(caller);
cp.talkSomething("What's up�H");
cp.talkSomething("See you later.");
cp.hangUp();
System.out.println("-----------------------");

}
}


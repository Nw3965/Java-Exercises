public class CellularPhone
// インスタンス変数の定義
//電話番号
String telephoneNumber;
//電池残量
int batteryRemaining = 100;

//コントラクタの定義
public CellularPhone (String telNum){
telephoneNumber = telNum;
}
//メソッドの定義
//着信
public void receiveCall(String caller){
System.out.println("ring! ring!ring!");
System.out.println("Calling from"+ caller);
}
//通話
public void talkSomething (String mag){
System.out.println("["+msg+"]");
}
//切断
public void hangUp(){
System.out.println("bye!");
butteryRemaining = batteryRemaining - 10;
System.out.println("batteryremaining = "+batteryremaining);
}
}

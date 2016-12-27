public class Someone { 
public static void main (String [] args) {
//発信者の番号
String caller = "987-6543";
//CellularPhone オブジェクトの生成
CellularPhone cp = new CellularPhone("123-4567");
System.out.println("--------------------");

//1回目の通話
// 作成した携帯電話に着信のメッセージを送る
cp.receiveCall(caller);
cp.talkSomething("調子はどう？");
cp.talkSomething("それでは！");
cp.hangUp();
System.out.println("-----------------------");

//2回目の通話
cp.receiveCall(caller);
cp.talkSomething("What's up？");
cp.talkSomething("See you later.");
cp.hangUp();
System.out.println("-----------------------");

}
}


public class Telephone{
//インスタンス変数
//電話番号
String telephoneNumber;

//メソッド
//着信
public void receiveCall (String caller){
system.out.plintln("ring! ring! ring!");
system.out.println("Calling "+caller+"->"
+telephoneNumber
+"(site:"+installationSite+")"); 
}

//通話
public void talkSomething(String msg){
System.out.println("["+msg+"]);
}
//切断
public void hungUp(){
System.out.println("bye!");
}
}
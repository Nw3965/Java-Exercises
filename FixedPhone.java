public class FixedPhone
//インスタンス変数
//電話番号
String telephoneNumber;
//設置場所
String installtionSite;

//contractor
public FixedPhone(String telNum , String site){
telephoneNumber = telNum;
installationSite = site ;
}

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


public class FixedPhone
//�C���X�^���X�ϐ�
//�d�b�ԍ�
String telephoneNumber;
//�ݒu�ꏊ
String installtionSite;

//contractor
public FixedPhone(String telNum , String site){
telephoneNumber = telNum;
installationSite = site ;
}

//���\�b�h
//���M
public void receiveCall (String caller){
system.out.plintln("ring! ring! ring!");
system.out.println("Calling "+caller+"->"
+telephoneNumber
+"(site:"+installationSite+")"); 
}

//�ʘb
public void talkSomething(String msg){
System.out.println("["+msg+"]);
}
//�ؒf
public void hungUp(){
System.out.println("bye!");
}
}


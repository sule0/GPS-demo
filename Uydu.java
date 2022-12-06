import java.util.Random;

public class Uydu {
public Uydu() {
	
	System.out.println("UYARI!");
	
}
public Uydu(GpsAlicisi gA) {
	System.out.println("GPS alicisina baglanildi.");
	int veriTuru= veriTuruSec();
	gA.uydudanVeriAL(veriTuru);
}


private int veriTuruSec () {
	Random random=new Random();
	int veriTuru=random.nextInt(3)+1;
	return veriTuru; 
	
}
}

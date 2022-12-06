import java.util.Random;

public class GpsAlicisi {


	public GpsAlicisi() {
		sicaklikOlc();
		if(sicaklik>5 && sicaklik<50) {
			GpsAlici=true;
		}else {
			GpsAlici=false;
		}
	}
	
	
	private int sicaklik;
	

	public Boolean GpsAlici=true;
	private String konumVerisi;
	
	private int sicaklikOlc() {
		Random random=new Random();
		int sicaklik=random.nextInt(40)+1;
		this.sicaklik=sicaklik;
		return sicaklik;
		
	}
	public String programaVeriGonder() {
		return konumVerisi; 
		
	}
	
	public void uydudanVeriAL(int veriTuru) {
		
		
		switch (veriTuru) {
		case 1: konumVerisi= "$GPGGA,N,40,30,E"; break;
		case 2: konumVerisi= "$GPRMC,41, N, E, 31"; break;
		case 3: konumVerisi="$GPGLL, N, E, 42, 32"; break;
		}
		
	}
	
	
}


public class GpsProgrami {
	
	public GpsProgrami(GpsAlicisi gA) {
	
	String konumVerisi=gA.programaVeriGonder();
	konumBilgisi(konumVerisi);
	
	}
	
private String konumVerisi;
private String enlem;
private String boylam;

private void konumBilgisi(String konumVerisi) {
	if (konumVerisi=="$GPGGA,N,40,30,E") {
		this.enlem="40 kuzey enlemi ";
		this.boylam="30 dogu boylami";
		this.konumVerisi="GPGGA ";
	}
	if (konumVerisi=="$GPRMC,41, N, E, 31") {
		this.enlem="41 kuzey enlemi";
		this.boylam="31 dogu boylami";
		this.konumVerisi="GPRMC";
	}else {
		this.enlem="42 kuzey enlemi";
		this.boylam="32 dogu boylami";
		this.konumVerisi="GPGLL";
	}
	
	System.out.println("Konum :"+this.konumVerisi+" "+enlem+" "+boylam);
	
}

}

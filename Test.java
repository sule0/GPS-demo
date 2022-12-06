
public class Test {
	public static void main(String[] args) {
		GpsAlicisi gpsAlici= new GpsAlicisi();
		if(gpsAlici.GpsAlici==true) {
			GpsAlicisi gpsAlici1= new GpsAlicisi();
			Uydu uydu=new Uydu();
			Uydu uydu2=new Uydu(gpsAlici1);
			GpsProgrami gpsprogrami= new GpsProgrami(gpsAlici1);
		}
		

}}

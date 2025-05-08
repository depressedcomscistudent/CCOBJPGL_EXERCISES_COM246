public class Adapter {
    public static void main(String[] args) {
        
        VGA vgaConnection = new Monitor();
        
        
        Monitor monitor = (Monitor) vgaConnection;
        monitor.connectVGA();  

        HDMI hdmiAdapter = new VGAtoHDMI(vgaConnection);
        hdmiAdapter.connectHDMI();  
}
}

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek ;
    
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.gizliYetenek = gizliYetenek;
        this.kutsalCanavar = kutsalCanavar;
                
    }
     @Override
    public void kutsalCanavar() {
        System.out.println(getBeybladeci() + kutsalCanavar + " ı ortaya çıkartıyor..");
        System.out.println(getBeybladeci() + " ın saldırısı : Hayalet Kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavarın Adı : " + kutsalCanavar);
        System.out.println("Gizli yetenek : " + gizliYetenek);
    }
    
    
}

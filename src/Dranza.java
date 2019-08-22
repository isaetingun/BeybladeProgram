
public class Dranza extends Beyblade {
    
    private String kutsalCanavar;
    
    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavar() {
        System.out.println(getBeybladeci() + kutsalCanavar + " ı ortaya çıkartıyor..");
        System.out.println(getBeybladeci() + " ın saldırısı : Alev Kılıcı");
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavarın adı : " + kutsalCanavar);
    }
    
}

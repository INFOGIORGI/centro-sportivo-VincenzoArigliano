public class Attività{
    private Socio socio;
    private Istruttore istruttore;
    private String data;
    private String orarioInizio;
    private String orarioFine;
    private String descrizione;

    public Attività(String data, String orarioInizio, String orarioFine, String descrizione){
        this.data = data;
        this.orarioInizio = orarioInizio;
        this.orarioFine = orarioFine;
        this.descrizione = descrizione;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public String getData(){
        return data;
    }

    public String getOrarioInizio(){
        return orarioInizio;
    }

    public String getOrarioFine(){
        return orarioFine;
    }

    public Socio getSocio(){
        return socio;
    }

    public Istruttore getIstruttore(){
        return istruttore;
    }

    public String toString(){
        return "Attività: " + descrizione + ", Data: " + data + ", Orario: " + orarioInizio + "-" + orarioFine;
    }
}
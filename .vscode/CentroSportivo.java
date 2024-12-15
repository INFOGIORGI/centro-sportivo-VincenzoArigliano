import java.util.HashMap;
import java.util.ArrayList;

public class CentroSportivo{
    private Map<String, Socio> soci = new HashMap<>();
    private Map<String, Istruttore> istruttori = new HashMap<>();
    
    public CentroSportivo(){
        aggiungiSocio("Mario", "Rossi", "S001");
        aggiungiSocio("Luisa", "Verdi", "S002");
        aggiungiSocio("Andrea", "Bianchi", "S003");

        aggiungiIstruttore("Marco", "Neri", "I001");
        aggiungiIstruttore("Anna", "Gialli", "I002");

        assegnaIstruttore("S001", "I001");
        assegnaIstruttore("S002", "I002");
        assegnaIstruttore("S003", "I001");

        System.out.println("Istruttori assegnati");
    }

    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio){
        if(soci.containsKey(codiceSocio))
        return false;
        soci.put(codiceSocio, new Socio(nome, cognome, codiceSocio));
        return true;
    }

    public boolean rimuoviSocio(String codiceSocio){
        if(!soci.containsKey(codiceSocio))
        return false;
        soci.remove(codiceSocio);
        return true;
    }

    public String getSocio(String codiceSocio){
        return soci.get(codiceSocio);
    }

    public boolean aggiungiIstruttore(String nome, String cognome, String codiceSocio){
        if(istruttori.containsKey(codiceIstruttore))
        return false;
        istruttori.put(codiceIstruttore, new Istruttore(nome, cognome, codiceIstruttore));
        return true;
    }

    public boolean rimuoviIstruttore(String codiceIstruttore){
        if(!istruttori.containsKey(codiceSocio))
        return false;
        soci.remove(codiceIstruttore);
        return true;
    }

    public String getIstruttore(String codiceIstruttore){
        return istruttori.get(codiceIstruttore);
    }

}
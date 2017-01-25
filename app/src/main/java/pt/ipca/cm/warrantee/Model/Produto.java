package pt.ipca.cm.warrantee.Model;

/**
 * Created by Rafael on 17/01/2017.
 */
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class Produto{
    private int id;
    String nome;
    private String codigoBarras;
    private String marca;
    String serialNumber;
    String fotografia;




    public String getFotografia() {

        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getSerialNumber() {
        return serialNumber;

    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
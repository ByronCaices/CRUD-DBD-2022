package dbd.LAB.crud.models;

public class Oferta {

    private int id_oferta;
    private String descripcion;
    private int stock_oferta;
    private String fecha_inicio;
    private String fecha_final;
    private int id_prod;

    //Constructor

    public Oferta(int id_oferta, String descripcion, int stock_oferta, String fecha_inicio, String fecha_final, int id_prod) {
        this.id_oferta = id_oferta;
        this.descripcion = descripcion;
        this.stock_oferta = stock_oferta;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.id_prod = id_prod;
    }

    //Getters

    public int getId_oferta() {
        return id_oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock_oferta() {
        return stock_oferta;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public int getId_prod() {
        return id_prod;
    }

    //Setters

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock_oferta(int stock_oferta) {
        this.stock_oferta = stock_oferta;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
}

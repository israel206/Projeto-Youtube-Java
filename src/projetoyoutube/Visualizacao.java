/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Mr-Robot
 */
public class Visualizacao {
    //Agregação usuario
    private Usuarios espectador;
    //Agregação video
    private Video filme;

    public Visualizacao(Usuarios espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        //adicionando atributos
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    //3 métodos com assinatura diferentes
    //isto é uma sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    public Usuarios getEspectador() {
        return espectador;
    }
    public void setEspectador(Usuarios espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}

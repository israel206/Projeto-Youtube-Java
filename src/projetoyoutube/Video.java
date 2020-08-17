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
//Class de implementação da interface
//class das ações
public class Video implements AcoesVideos{
    //Visibilidade
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidas ++;
    }
    //Gerando dados automatico
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao =1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    //Com as implementações dos Getter e Setter, fiz o encapsulamento
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    //no que chama polimorfismo
    //toString sobreposição
    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " 
                + views + ", curtidas = " + curtidas + ", reproduzindo = " + reproduzindo + '}';
    }
    
}

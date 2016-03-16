package model;

import java.math.BigDecimal;

/**
 *
 * @author Luiz Fernando de Souza Matricula: 225272 Hamburguer, CheeseBurguer,
 * X-Calabresa, Podrão Especial ADS - EAD SOROCABA
 */
public class Lanche {

    private BigDecimal hamburguer;
    private BigDecimal cheeseBurguer;
    private BigDecimal xCalabresa;
    private BigDecimal podraoEspecial;

    private BigDecimal batataPequena;
    private BigDecimal batataMedia;
    private BigDecimal batataGrande;

    public Lanche() {

        this(new BigDecimal("3.00"), new BigDecimal("3.50"), new BigDecimal("4.00"),
                new BigDecimal("5.00"), new BigDecimal("1.00"), new BigDecimal("1.50"),
                new BigDecimal("2.00"));

    }

    public Lanche(BigDecimal hamburguer, BigDecimal cheeseBurguer,
            BigDecimal xCalabresa, BigDecimal podraoEspecial,
            BigDecimal batataPequena, BigDecimal batataMedia,
            BigDecimal batataGrande) {

        this.hamburguer = hamburguer;
        this.cheeseBurguer = cheeseBurguer;
        this.xCalabresa = xCalabresa;
        this.podraoEspecial = podraoEspecial;
        this.batataPequena = batataPequena;
        this.batataMedia = batataMedia;
        this.batataGrande = batataGrande;
    }

    public BigDecimal getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(BigDecimal hamburguer) {
        this.hamburguer = hamburguer;
    }

    public BigDecimal getCheeseBurguer() {
        return cheeseBurguer;
    }

    public void setCheeseBurguer(BigDecimal cheeseBurguer) {
        this.cheeseBurguer = cheeseBurguer;
    }

    public BigDecimal getxCalabresa() {
        return xCalabresa;
    }

    public void setxCalabresa(BigDecimal xCalabresa) {
        this.xCalabresa = xCalabresa;
    }

    public BigDecimal getPodraoEspecial() {
        return podraoEspecial;
    }

    public void setPodraoEspecial(BigDecimal podraoEspecial) {
        this.podraoEspecial = podraoEspecial;
    }

    public BigDecimal getBatataPequena() {
        return batataPequena;
    }

    public void setBatataPequena(BigDecimal batataPequena) {
        this.batataPequena = batataPequena;
    }

    public BigDecimal getBatataMedia() {
        return batataMedia;
    }

    public void setBatataMedia(BigDecimal batataMedia) {
        this.batataMedia = batataMedia;
    }

    public BigDecimal getBatataGrande() {
        return batataGrande;
    }

    public void setBatataGrande(BigDecimal batataGrande) {
        this.batataGrande = batataGrande;
    }

}

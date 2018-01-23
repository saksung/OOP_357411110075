package oop_lab7;
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5.country of origin
public class Supercar {
    public String toString() {
        return "Supercar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }
    private String carbrand;
    private  String carcolor;
    private  String carenginesize;
    private String maxspeed;
    private String countryoforigin;
    public Supercar() { }
    public Supercar(String carbrand,String carcolor,String carenginesize,String maxspeed,String countryoforigin ){

        this.carbrand = carbrand ;
        this.carcolor = carcolor ;
        this.carenginesize =carenginesize;
        this.maxspeed = maxspeed;
        this.countryoforigin = countryoforigin;
    public String getcarbrand() {
        return carbrand;
}
    public String getCarbrand() {
        return carbrand;
    }
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }
    public String getCarcolor() {
        return carcolor;
    }
    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }
    public String getCarenginesize() {
        return carenginesize;
    }
    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }
    public String getMaxspeed() {
        return maxspeed;
    }
    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }
    public String getCountryoforigin() {
        return countryoforigin;
    }
    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }//mail
}//class

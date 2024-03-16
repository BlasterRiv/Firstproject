public class Feature {
    private String title;
    private Effect effect;
    private String discription;

    public String getTitle() {return title;}
    public Effect getEffect(){return effect;}
    public String getDiscription() {return discription;}


    public Feature(String ti, Effect ef, String discrip) {
        title = ti;
        effect = ef;
        discription = discrip;
    }
}

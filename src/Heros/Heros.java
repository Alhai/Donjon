public abstract class Heros {
    private String name;
    private int hp;
    private int lvlAttack;

    private int maxHp;

    private int maxAttack;

    /* Constructors */
    public Heros(String pName, int pHp, int plvlAttack, int pmaxHp, int pmaxAttack){
        this.name = pName;
        this.hp = pHp;
        this.lvlAttack = plvlAttack;
        this.maxHp = pmaxHp;
        this.maxAttack = pmaxAttack;
    }

    public Heros(String pName){
        this(pName, 8, 7,10,10);
    }

    public Heros(){
//
    }

    // Methods
    public abstract String criDeGuerre();

    // Accessors
    public int getHp(){
        return this.hp;
    }
    public String getName(){
        return this.name;
    }
    public int getLvlAttack(){
        return this.lvlAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLvlAttack(int lvlAttack) {
        this.lvlAttack = lvlAttack;

    }
}

package org.kavus.one.ntt;

public class Verb {
    protected long id;
    private String infinitive;
    private String gerund;
    public Verb(){
        super();
    }

    public Verb(String infinitive, String gerund) {
        this.infinitive = infinitive;
        this.gerund = gerund;
    }
    public String toString(){
        return infinitive+","+gerund;
    }
}

package org.kavus.one.ntt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Verb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getGerund() {
        return gerund;
    }

    public void setGerund(String gerund) {
        this.gerund = gerund;
    }

    public String toString(){
        return infinitive+","+gerund;
    }
}

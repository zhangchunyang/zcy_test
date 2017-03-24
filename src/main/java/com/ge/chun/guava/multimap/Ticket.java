package com.ge.chun.guava.multimap;

/**
 * Created by 春哥 on 16/11/4.
 */
public class Ticket {

    private String candidate;
    private String voter;

    public Ticket() {

    }

    public Ticket(String candidate, String voter) {
        this.candidate = candidate;
        this.voter = voter;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }
}

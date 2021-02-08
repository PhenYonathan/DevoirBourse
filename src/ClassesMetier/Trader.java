/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> actions;
    
    public Trader(int unIdTrade, String unNomTrade)
    {
        idTrader = unIdTrade;
        nomTrader = unNomTrade;
        actions = new ArrayList<>();
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @return the actions
     */
    public ArrayList<Action> getActions() {
        return actions;
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
    
}

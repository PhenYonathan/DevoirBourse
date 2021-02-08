/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    
    private int idAction;
    private String nomAction;
    private double valeurAction;
    private double prixAchatAction;
    private int quantiteAchatAction;
    
    public Action(int unId, String uneAction, double laValeurAction, double lePrixAchat, int laQuantiteAchete)
    {
        idAction = unId;
        nomAction = uneAction;
        valeurAction = laValeurAction;
        prixAchatAction = lePrixAchat;
        quantiteAchatAction = laQuantiteAchete;
    }

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @return the valeurAction
     */
    public double getValeurAction() {
        return valeurAction;
    }

    /**
     * @param valeurAction the valeurAction to set
     */
    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }

    /**
     * @return the prixAchatAction
     */
    public double getPrixAchatAction() {
        return prixAchatAction;
    }

    /**
     * @return the quantiteAchatAction
     */
    public int getQuantiteAchatAction() {
        return quantiteAchatAction;
    }

    /**
     * @param quantiteAchatAction the quantiteAchatAction to set
     */
    public void setQuantiteAchatAction(int quantiteAchatAction) {
        this.quantiteAchatAction = quantiteAchatAction;
    }
    
    
}

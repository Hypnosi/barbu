/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbu;

/**
 *
 * @author Salmé
 */
public class ContratBarbu implements Contrat{
    
    public boolean fin(Jeu jeu){
        if (jeu.plateau.contains(new Carte("Coeur",14))){
            return true;
        }
        return false;
    }
    

}

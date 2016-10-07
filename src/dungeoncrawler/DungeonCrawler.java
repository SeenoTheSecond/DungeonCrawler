/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeoncrawler;

import byui.cit260.DungeonCrawler.model.knight;

/**
 *
 * @author Jeff
 */
public class DungeonCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
            knight playerOne = new knight();
            
            playerOne.setName("Black Knight");
            playerOne.setStats(4);
            
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
        }
    }
    


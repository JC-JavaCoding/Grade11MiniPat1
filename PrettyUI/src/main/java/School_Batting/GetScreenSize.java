/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School_Batting;

import java.awt.Toolkit;

/**
 *
 * @author janch
 */
public class GetScreenSize
{
    public static void main(String[] args)
    {
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        
        System.out.println("H: "+ height +"\nW: "+ width);
    }
}

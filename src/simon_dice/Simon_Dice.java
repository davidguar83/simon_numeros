/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_dice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Simon_Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rondaspuntos = 0;
        int puntos = 1;
        boolean z = false;
        int rondas = 5;
        int rondasjugador = 5;
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listajugador = new ArrayList<>();

        Random ale = new Random();
       /* Timer timer = new Timer();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {

            }
        };*/

        do {
            for (int i = 0; i < rondas; i++) {

                lista.add(ale.nextInt(3) + 1);

            }

            int[] mio = new int[lista.size()];

            int ind = 0;
            for (Integer value : lista) {

                mio[ind++] = value;

            }

            for (int i = 0; i < mio.length; i++) {

                if (mio[i] == 1) {

                    System.out.println("rojo");
                   // timer.schedule(tarea, 10000);
                } else if (mio[i] == 2) {

                    System.out.println("verde");
                  //  timer.schedule(tarea, 10000);
                } else {

                    System.out.println("azul");
                   // timer.schedule(tarea, 10000);
                }

            }

            System.out.println(lista);

            for (int i = 0; i < rondasjugador; i++) {

                int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));

                listajugador.add(a);

            }

            System.out.println(listajugador);

            if (lista.equals(listajugador)) {

                System.out.println("Hacertaste");
                puntos++;
                rondas++;
                rondasjugador++;
                rondaspuntos++;
                lista.clear();
                listajugador.clear();
            } else {

                System.out.println("Fallaste");
                z = true;

                int puntostotal = ((rondaspuntos * 10) * puntos);
                System.out.println("puntos = " + puntostotal);

            }

        } while (z == false);
    }

}

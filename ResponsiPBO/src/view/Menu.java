/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.Koneksi;
import model.Karyawann;


/**
 *
 * @author user
 */

public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel("Main Menu");

   public JButton btambah = new JButton("Tambah Karyawan");
   public JButton blihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
         setSize(200,120);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);
        
        ljudul.setBounds(70,5,200,20);
        
         
        btambah.setBounds(0,30,200,20);
        blihat.setBounds(0,60,200,20);
        
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);
       

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           Lihat lh = new Lihat();
           lh.dispose();
           dispose();
           Input ik = new Input();
           Edit ed = new Edit();
           ed.dispose();
           Karyawann md = new Karyawann();
           Control ct = new Control(lh, md,ik,ed);
          
        }
        if(e.getSource() == blihat){
            Lihat lh = new Lihat();
           Input ik = new Input();
           ik.dispose();
           Edit ed = new Edit();
           ed.dispose();
           Karyawann md = new Karyawann();
           Control ct = new Control(lh, md,ik,ed);
        }

    }

}


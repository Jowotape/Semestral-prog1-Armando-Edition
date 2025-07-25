package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class todalamierdavaairaqui extends JFrame implements ActionListener {
    JButton ralseiButt;
    JButton tiendaB1;
    JButton tiendaB2;
    JButton tiendaB3;
    JLabel mensaje;
    JLabel puntos;
    JLabel mentiEstosSonLosPuntosReales;
    JLabel tiendaL1;
    JLabel tiendaL2;
    JLabel tiendaL3;
    JLabel ralseiLabel;
    JLabel borde;
    JLabel bgCastleTown;
    JLabel ribbonShow;
    JLabel ribbonShow2;
    JLabel ribbonShow3;
    JLabel ribbonShow4;
    JLabel ribbonShow5;
    JLabel ribbonShow6;
    JLabel ribbonShow7;
    JLabel ribbonShow8;
    JLabel ribbonShow9;
    JLabel ribbonShow10;
    JLabel jevilstailShow;
    JLabel dealmakerShow;
    JLabel info;
    JLabel info2;
    JLabel tiendaTitulo;
    JLabel wdArmando;
    int armando;
    int points;
    int ribbon;
    int jevilstail;
    int dealmaker;

    String funcionPeak(){
        return "peak";
    }

    public todalamierdavaairaqui(){
        setTitle(funcionPeak());
        setSize(975,720);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setBackground(Color.black);
        setForeground(Color.WHITE);

        mensaje = new JLabel("");
        puntos = new JLabel("puntos:");
        mentiEstosSonLosPuntosReales = new JLabel("0");
        tiendaL1 = new JLabel("Ribbon             50 pt");
        tiendaL2 = new JLabel("Jevilstail  200 pt");
        tiendaL3 = new JLabel("Dealmaker  1000 pt");
        ralseiLabel = new JLabel("");
        borde = new JLabel("");
        bgCastleTown = new JLabel("");
        wdArmando = new JLabel("");
        armando = 0;
        ribbonShow = new JLabel("");
        ribbonShow2 = new JLabel("");
        ribbonShow3 = new JLabel("");
        ribbonShow4 = new JLabel("");
        ribbonShow5 = new JLabel("");
        ribbonShow6 = new JLabel("");
        ribbonShow7 = new JLabel("");
        ribbonShow8 = new JLabel("");
        ribbonShow9 = new JLabel("");
        ribbonShow10 = new JLabel("");
        jevilstailShow = new JLabel("");
        dealmakerShow = new JLabel("");
        info = new JLabel("*");
        info2 = new JLabel("");
        tiendaTitulo = new JLabel("Tienda");
        ralseiButt = new JButton("");
        ralseiButt.addActionListener(this);
        ralseiButt.setRolloverEnabled(false);
        ralseiButt.setContentAreaFilled(false);
        tiendaB1 = new JButton("");
        tiendaB1.addActionListener(this);
        tiendaB1.setRolloverEnabled(false);
        tiendaB1.setContentAreaFilled(false);
        tiendaB2 = new JButton("");
        tiendaB2.addActionListener(this);
        tiendaB2.setRolloverEnabled(false);
        tiendaB2.setContentAreaFilled(false);
        tiendaB3 = new JButton("");
        tiendaB3.addActionListener(this);
        tiendaB3.setRolloverEnabled(false);
        tiendaB3.setContentAreaFilled(false);
        points = 0;
        ribbon = 0;
        jevilstail = 1;
        dealmaker = 1;

        tiendaB1.addMouseListener(new java.awt.event.MouseAdapter() { //estos son los hovers, no hago idea como iríann en una función
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                info.setText("*Un lindo moño rosado");
                info2.setText("(+1 punto por clic)");
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                info.setText("*");
                info2.setText("");
            }
        });

        tiendaB2.addMouseListener(new java.awt.event.MouseAdapter() { //otro on-hover, esta vez de jevil
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(jevilstail == 1){
                    info.setText("*Una cola con forma de J");
                    info2.setText("(chance de x4 pts/clic)");
                } else {
                    info.setText("*");
                    info2.setText("(+1 punto por clic)");
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(jevilstail == 1) {
                    info.setText("*");
                    info2.setText("");
                } else{
                    info.setText("*");
                    info2.setText("");
                }
            }
        });

        tiendaB3.addMouseListener(new java.awt.event.MouseAdapter() { //Spamton on-hover
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(dealmaker == 1) {
                    info.setText("*Un estiloso par de lentes");
                    info2.setText("(x2 puntos por clic)");
                } else {
                    info.setText("*");
                    info2.setText("");
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(dealmaker == 1) {
                    info.setText("*");
                    info2.setText("");
                } else {
                    info.setText("*");
                    info2.setText("");
                }
            }
        });

        String localDir = System.getProperty("user.dir"); //esto obtiene la localización del ejecutable dentro de la pc
        File fileFuente = new File(localDir + "\\src\\resources\\determination.ttf");

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT,
                    new File(String.valueOf(fileFuente)));
            font = font.deriveFont(Font.PLAIN, 40); //Establece la fuente para todos los labels con letras
            tiendaL1.setFont(font);
            tiendaL2.setFont(font);
            tiendaL3.setFont(font);
            mensaje.setFont(font);
            puntos.setFont(font);
            info.setFont(font);
            info2.setFont(font);
            tiendaTitulo.setFont(font);
            mentiEstosSonLosPuntosReales.setFont(font);
            tiendaL1.setForeground(Color.white);
            tiendaL2.setForeground(Color.white);
            tiendaL3.setForeground(Color.white);
            mensaje.setForeground(Color.white);
            puntos.setForeground(Color.white);
            info.setForeground(Color.white);
            info2.setForeground(Color.white);
            tiendaTitulo.setForeground(Color.white);
            mentiEstosSonLosPuntosReales.setForeground(Color.white);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(true){ //ESTE LOOP ES MUY MUY MUY MUY IMPORTANTE, LO JURO, PORFAAVOOOR NO LO BORREN PLEASE PLEASE PLEASE
            armando++;
            if(armando > 99){
                break;
            }
        }

        File bord = new File(localDir + "\\src\\resources\\borde.png"); //Acá comienza mi verguero de imágenes
        ImageIcon borda = new ImageIcon(String.valueOf(bord));
        borde.setIcon(borda);
        borde.setBounds(0, 152, borda.getIconWidth(), borda.getIconHeight());

        File armandoFile = new File(localDir + "\\src\\resources\\armando.png"); //Acá comienza mi verguero de imágenes
        ImageIcon armandoImage = new ImageIcon(String.valueOf(armandoFile));
        wdArmando.setIcon(armandoImage);
        wdArmando.setBounds(0, 152, armandoImage.getIconWidth(), armandoImage.getIconHeight());

        File bgFile = new File(localDir + "\\src\\resources\\battbg.gif");
        ImageIcon bgIcon = new ImageIcon(String.valueOf(bgFile));
        bgCastleTown.setIcon(bgIcon);
        bgCastleTown.setBounds(0, 0, bgIcon.getIconWidth(), bgIcon.getIconHeight());

        File fileRales = new File(localDir + "\\src\\resources\\ralsei.png");
        ImageIcon ralesImagen = new ImageIcon(String.valueOf(fileRales));
        ralseiLabel.setIcon(ralesImagen);
        ralseiLabel.setBounds(130,120, ralesImagen.getIconWidth(), ralesImagen.getIconHeight());

        File fileRibbon = new File(localDir + "\\src\\resources\\ribbon.png"); //mi crimen de guerra parte 1
        ImageIcon ribbonImagen = new ImageIcon(String.valueOf(fileRibbon));
        ribbonShow.setIcon(ribbonImagen);
        ribbonShow.setBounds(130,110, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow2.setIcon(ribbonImagen);
        ribbonShow2.setBounds(120,85, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow3.setIcon(ribbonImagen);
        ribbonShow3.setBounds(110,60, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow4.setIcon(ribbonImagen);
        ribbonShow4.setBounds(100,35, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow5.setIcon(ribbonImagen);
        ribbonShow5.setBounds(90,10, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow6.setIcon(ribbonImagen);
        ribbonShow6.setBounds(80,-15,ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow7.setIcon(ribbonImagen);
        ribbonShow7.setBounds(70,-40, ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow8.setIcon(ribbonImagen);
        ribbonShow8.setBounds(60,-65,ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow9.setIcon(ribbonImagen);
        ribbonShow9.setBounds(50,-90,ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());
        ribbonShow10.setIcon(ribbonImagen);
        ribbonShow10.setBounds(40,-115,ribbonImagen.getIconWidth(), ribbonImagen.getIconHeight());

        File fileJevil = new File(localDir + "\\src\\resources\\jevilstail.png");
        ImageIcon jevilImagen = new ImageIcon(String.valueOf(fileJevil));
        jevilstailShow.setIcon(jevilImagen);
        jevilstailShow.setBounds(365,330, jevilImagen.getIconWidth(), jevilImagen.getIconHeight());

        File fileDeal = new File(localDir + "\\src\\resources\\ralseidealmaker.png");
        ImageIcon dealImagen = new ImageIcon(String.valueOf(fileDeal));
        dealmakerShow.setIcon(dealImagen);
        dealmakerShow.setBounds(130,120, dealImagen.getIconWidth(), dealImagen.getIconHeight());

        tiendaL1.setBounds(640,270,300,50);
        tiendaB1.setBounds(640,270,300,50);
        tiendaL2.setBounds(640,340,300,50);
        tiendaB2.setBounds(640,340,300,50);
        tiendaL3.setBounds(640,410,300,50);
        tiendaB3.setBounds(640,410,300,50);
        tiendaTitulo.setBounds(725,200,300,50);

        info.setBounds(50,520,500,50);
        info2.setBounds(70,570,500,50);

        puntos.setBounds(640,520,300,50);
        mentiEstosSonLosPuntosReales.setBounds(640,580,300,50);
        ralseiButt.setBounds(130,120, ralesImagen.getIconWidth(), ralesImagen.getIconHeight());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        render();
        if(armando != 100){
            System.exit(0);
        }
        System.out.println("iniciado correctamente");
    }

    public void render(){ //carga todos los labels
        System.out.println("renderizando...");
        this.setVisible(true);
        this.add(tiendaL1);
        this.add(tiendaL2);
        this.add(tiendaL3);
        this.add(tiendaTitulo);
        this.add(info);
        this.add(info2);
        this.add(puntos);
        this.add(mentiEstosSonLosPuntosReales);
        if(ribbon > 0){ //mi crimen de guerra parte 2
            if(ribbon > 1){
                if(ribbon > 2){
                    if(ribbon > 3){
                        if(ribbon > 4){
                            if(ribbon > 5){
                                if(ribbon > 6){
                                    if(ribbon > 7){
                                        if(ribbon > 8){
                                            if(ribbon > 9){
                                                this.add(ribbonShow10);
                                                }
                                            this.add(ribbonShow9);
                                            }
                                        this.add(ribbonShow8);
                                        }
                                    this.add(ribbonShow7);
                                    }
                                this.add(ribbonShow6);
                                }
                            this.add(ribbonShow5);
                            }
                        this.add(ribbonShow4);
                        }
                    this.add(ribbonShow3);
                    }
                this.add(ribbonShow2);
                }
            this.add(ribbonShow);
            }
        if(dealmaker > 1){
            this.add(dealmakerShow);
        }
        this.add(ralseiLabel);
        if(jevilstail > 1){
            this.add(jevilstailShow);
        }
        this.add(borde);
        this.add(bgCastleTown);
        this.add(ralseiButt);
        this.add(tiendaB1);
        this.add(tiendaB2);
        this.add(tiendaB3);
        this.add(wdArmando);
    }

    public void clear(){ //elimina todos los labels para refrescar correctamente
        System.out.println("limpiando...");
        this.remove(tiendaL1);
        this.remove(tiendaL2);
        this.remove(tiendaL3);
        this.remove(info);
        this.remove(info2);
        this.remove(puntos);
        this.remove(mentiEstosSonLosPuntosReales);
        this.remove(ribbonShow);
        this.remove(ribbonShow2);
        this.remove(ribbonShow3);
        this.remove(ribbonShow4);
        this.remove(ribbonShow5);
        this.remove(ribbonShow6);
        this.remove(ribbonShow7);
        this.remove(ribbonShow8);
        this.remove(ribbonShow9);
        this.remove(ribbonShow10);
        this.remove(dealmakerShow);
        this.remove(ralseiLabel);
        this.remove(jevilstailShow);
        this.remove(borde);
        this.remove(bgCastleTown);
        this.remove(ribbonShow);
        this.remove(tiendaB1);
        this.remove(tiendaB2);
        this.remove(tiendaB3);
        this.remove(wdArmando);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //reacciones de cada botón al clic
        Random rand = new Random();
        if(e.getSource()==ralseiButt){
            if(rand.nextInt(10) == 1) { //chance de Jevil
                points = points + ((1 + ribbon) * jevilstail * dealmaker);
                System.out.println(points);
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points));
                info.setText("* kapow!!!");
            } else {
                points = points + ((100 + ribbon) * dealmaker);
                System.out.println(points);
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points));
                int randmess = rand.nextInt(5);
                if(randmess == 0){
                    info.setText("* squish!"); //mensajes
                } else if(randmess == 1){
                    info.setText("* squeak!");
                } else if(randmess == 2){
                    info.setText("* sploosh!");
                } else if(randmess == 3){
                    info.setText("* squash!");
                } else {
                    info.setText("* purr!");
                }
            }
        }
        if(e.getSource()==tiendaB1){ //boton de comprar ribbon
            if(points > 49){
                ribbon++;
                points -= 50;
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points));
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
        if(e.getSource()==tiendaB2){ //boton de comprar jevil
            if(points > 199){
                jevilstail = 4;
                tiendaB2.setEnabled(false);
                tiendaB2.setVisible(false);
                points -= 200;
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza los puntos
                tiendaL2.setText("");
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
        if(e.getSource()==tiendaB3){ //boton de spamtonear
            if(points > 999){
                dealmaker = 2;
                tiendaB3.setEnabled(false);
                points -= 1000;
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points));
                tiendaL3.setText("");
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
    }
}
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class todalamierdavaairaqui extends JFrame implements ActionListener {
    JButton ralseiButt; //botón para hacer clic en Ralsei
    JButton tiendaB1; //botón del primer item de la tienda (ribbon)
    JButton tiendaB2; //botón del segundo item de la tienda (jevilstail)
    JButton tiendaB3; //botón del tercer item de la tienda (dealmaker)
    JLabel puntos; //la parte del label que dice "puntos:"
    JLabel mentiEstosSonLosPuntosReales; //la parte del label que en realidad enseña los puntos
    JLabel tiendaL1; //label del primer item de la tienda (ribbon)
    JLabel tiendaL2; //label del segundo item de la tienda (jevilstail)
    JLabel tiendaL3; //label del tercer item de la tienda (dealmaker)
    JLabel ralseiLabel; //label de ralsei, hace que se eneseñe el peluche
    JLabel borde; //label de los marcos del texto
    JLabel bgCastleTown; //se llama castletown pero realmente es el fondo del juego (por eso "bg", de "BackGround")
    JLabel ribbonShow; //todos estos son labels que hacen al item ribbon visible
    JLabel ribbonShow2;
    JLabel ribbonShow3;
    JLabel ribbonShow4;
    JLabel ribbonShow5;
    JLabel ribbonShow6;
    JLabel ribbonShow7;
    JLabel ribbonShow8;
    JLabel ribbonShow9;
    JLabel ribbonShow10;
    JLabel jevilstailShow; //label que hace el item jevilstail visible
    JLabel dealmakerShow; //label que hace el item dealmaker visible
    JLabel info; //label que presenta la primera línea de texto de la caja de información
    JLabel info2; //label que presenta la segunda linea de texto de la caja de información
    JLabel tiendaTitulo; // label que solo dice "tienda" en la parte superior de la tienda
    JLabel wdArmando; //👆🏻👇🏻👈🏻👉🏻👆🏻☝🏻🤙🏻🏻👉🏻👆🏻☝🏻🤙🏻🖐🏻🖖🏻👉🏻
    int armando; //👆🏻👇🏻👉🏻👈🏻👈🏻☝🏻👇🏻👈🏻🏻☝🏻👇🏻👈🏻👉🏻👆🏻☝🏻🤙
    int points; //seguimiento de los puntos con una variable
    int ribbon; //indica si el ribbon está habilitado o no
    int jevilstail; //indica si el jevilstail está habilitado o no
    int dealmaker; //indica si el dealmaker está habilitado o no

    String funcionPeak(){ //esencia
        return "peak";
    }

    public todalamierdavaairaqui(){
        setTitle(funcionPeak()); //establece el titulo de la ventana
        setSize(975,720); //establece el tamaño de la ventana
        this.setResizable(false); //impide la ventana de tener su tamaño cambiable
        setLocationRelativeTo(null); //crea la ventana en el medio
        setBackground(Color.black); //background negro por si acaso
        setForeground(Color.WHITE); //letras blancas por default... esto no funcionó though

        puntos = new JLabel("puntos:"); //inicar el label que dice "puntos: "
        mentiEstosSonLosPuntosReales = new JLabel("0"); //iniciar el label que presenta el seguimiento de cantidad de puntos
        tiendaL1 = new JLabel("Ribbon             50 pt"); //iniciar el label que presenta el item 1 de la tienda
        tiendaL2 = new JLabel("Jevilstail  200 pt"); //iniciar el label que presenta el item 2 de la tienda
        tiendaL3 = new JLabel("Dealmaker  1000 pt"); //iniciar el label que presenta el item 3 de la tienda
        ralseiLabel = new JLabel(""); //iniciar el label del peluche Ralsei
        borde = new JLabel(""); //iniciar el label del marco de texto
        bgCastleTown = new JLabel(""); //iniciar el label del fondo
        wdArmando = new JLabel(""); //👈🏻👉🏻👆🏻☝🏻🤙🏻🏻👉👇🏻👈🏻🏻☝🏻👇🏻👈🏻👉🏻👆
        armando = 0; // 👉🏻👆🏻☝🏻🤙🏻🖐🏻🖖🏻👉🏻☝🏻👇🏻👈🏻🏻☝🏻👇🏻
        ribbonShow = new JLabel(""); //iniciar el label que hace a los ribbons visibles
        ribbonShow2 = new JLabel("");
        ribbonShow3 = new JLabel("");
        ribbonShow4 = new JLabel("");
        ribbonShow5 = new JLabel("");
        ribbonShow6 = new JLabel("");
        ribbonShow7 = new JLabel("");
        ribbonShow8 = new JLabel("");
        ribbonShow9 = new JLabel("");
        ribbonShow10 = new JLabel("");
        jevilstailShow = new JLabel(""); //iniciar el label que hace el jebilstail visible
        dealmakerShow = new JLabel(""); //iniciar el label que hace el dealmaker visible
        info = new JLabel("*"); //iniciar el label de texto informativo fila 1
        info2 = new JLabel(""); //iniciar el label de texto informativo fila 2
        tiendaTitulo = new JLabel("Tienda"); //iniciar el label que literalmente dice solo "tienda" en la cima de la tienda
        ralseiButt = new JButton(""); //iniciar el botón de clic a Ralsei (ES RALSEI "BUTTON", NO RALSEI "BUTT")
        ralseiButt.addActionListener(this); //darle un listener al botón de ralsei
        ralseiButt.setRolloverEnabled(false); //desactivar el parpadeo de cuando pasas el mouse sobre el botón
        ralseiButt.setContentAreaFilled(false); //desactivar el parpadeo de cuando cliqueas el botón
        tiendaB1 = new JButton(""); //iniciar el botón que permite darle clic al item 1 de la tienda
        tiendaB1.addActionListener(this); //darle un listener al botón de item 1 de la tienda 
        tiendaB1.setRolloverEnabled(false); //desactivar el parpadeo de cuando pasas el mouse sobre el botón
        tiendaB1.setContentAreaFilled(false); //desactivar el parpadeo de cuando cliqueas el botón
        tiendaB2 = new JButton("");//iniciar el botón que permite darle clic al item 2 de la tienda
        tiendaB2.addActionListener(this); //darle un listener al botón de item 2 de la tienda 
        tiendaB2.setRolloverEnabled(false); //desactivar el parpadeo de cuando pasas el mouse sobre el botón
        tiendaB2.setContentAreaFilled(false); //desactivar el parpadeo de cuando cliqueas el botón
        tiendaB3 = new JButton(""); //iniciar el botón que permite darle clic al item 3 de la tienda
        tiendaB3.addActionListener(this); //darle un listener al botón de item 3 de la tienda
        tiendaB3.setRolloverEnabled(false); //desactivar el parpadeo de cuando pasas el mouse sobre el botón
        tiendaB3.setContentAreaFilled(false); //desactivar el parpadeo de cuando cliqueas el botón
        points = 0; //iniciar el seuguimiento de puntos en variable int
        ribbon = 0; //iniciar la variable que habilita el ribbon
        jevilstail = 1; //iniciar la variable que habilita el jevilstail
        dealmaker = 1; //iniciar la variable que habilita el dealmaker

        tiendaB1.addMouseListener(new java.awt.event.MouseAdapter() { //estos son los hovers, no hago idea como irían en una función
            public void mouseEntered(java.awt.event.MouseEvent evt) { //esto hace que cuando pasas el mouse por encima del item 1, te da info sobre él
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

        tiendaB3.addMouseListener(new java.awt.event.MouseAdapter() { //dealmaker on-hover
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

        String localDir = System.getProperty("user.dir"); //esto obtiene la localización del proyecto dentro de la pc
        File fileFuente = new File(localDir + "\\src\\resources\\determination.ttf"); //esto obtiene la fuente dentro de la pc

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT,
                    new File(String.valueOf(fileFuente)));
            font = font.deriveFont(Font.PLAIN, 40); //Establece la fuente y color para todos los labels con letras
            tiendaL1.setFont(font);
            tiendaL2.setFont(font);
            tiendaL3.setFont(font);
            puntos.setFont(font);
            info.setFont(font);
            info2.setFont(font);
            tiendaTitulo.setFont(font);
            mentiEstosSonLosPuntosReales.setFont(font);
            tiendaL1.setForeground(Color.white);
            tiendaL2.setForeground(Color.white);
            tiendaL3.setForeground(Color.white);
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
        borde.setBounds(0, 152, borda.getIconWidth(), borda.getIconHeight()); //esta es la imagen del marco

        File armandoFile = new File(localDir + "\\src\\resources\\armando.png"); //👆🏻👇🏻👉🏻👈🏻☝🏻👇🏻👈🏻👉🏻👆🏻☝🏻🤙🏻🖐🏻🖖🏻👉🏻
        ImageIcon armandoImage = new ImageIcon(String.valueOf(armandoFile));
        wdArmando.setIcon(armandoImage);
        wdArmando.setBounds(0, 152, armandoImage.getIconWidth(), armandoImage.getIconHeight());

        File bgFile = new File(localDir + "\\src\\resources\\battbg.gif"); //imagen del fondo
        ImageIcon bgIcon = new ImageIcon(String.valueOf(bgFile));
        bgCastleTown.setIcon(bgIcon);
        bgCastleTown.setBounds(0, 0, bgIcon.getIconWidth(), bgIcon.getIconHeight());

        File fileRales = new File(localDir + "\\src\\resources\\ralsei.png"); //imagen de ralsei peluche
        ImageIcon ralesImagen = new ImageIcon(String.valueOf(fileRales));
        ralseiLabel.setIcon(ralesImagen);
        ralseiLabel.setBounds(130,120, ralesImagen.getIconWidth(), ralesImagen.getIconHeight());

        File fileRibbon = new File(localDir + "\\src\\resources\\ribbon.png"); //mi crimen de guerra parte 1 (IMAGEN DE TODOS LOS RIBBONS)
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

        File fileJevil = new File(localDir + "\\src\\resources\\jevilstail.png"); //imagen del jevilstail
        ImageIcon jevilImagen = new ImageIcon(String.valueOf(fileJevil));
        jevilstailShow.setIcon(jevilImagen);
        jevilstailShow.setBounds(365,330, jevilImagen.getIconWidth(), jevilImagen.getIconHeight());

        File fileDeal = new File(localDir + "\\src\\resources\\ralseidealmaker.png"); //imagen del dealmaker
        ImageIcon dealImagen = new ImageIcon(String.valueOf(fileDeal));
        dealmakerShow.setIcon(dealImagen);
        dealmakerShow.setBounds(130,120, dealImagen.getIconWidth(), dealImagen.getIconHeight());

        tiendaL1.setBounds(640,270,300,50); //establezco las posiciones y tamaños de los labels y botones de tienda
        tiendaB1.setBounds(640,270,300,50);
        tiendaL2.setBounds(640,340,300,50);
        tiendaB2.setBounds(640,340,300,50);
        tiendaL3.setBounds(640,410,300,50);
        tiendaB3.setBounds(640,410,300,50);
        tiendaTitulo.setBounds(725,200,300,50);

        info.setBounds(50,520,500,50); //establezco las posiciones y tamaños de los labels de información
        info2.setBounds(70,570,500,50);

        puntos.setBounds(640,520,300,50); //establezco las posiciones y tamaños de los labels de puntos
        mentiEstosSonLosPuntosReales.setBounds(640,580,300,50);
        ralseiButt.setBounds(130,120, ralesImagen.getIconWidth(), ralesImagen.getIconHeight()); //tamaño y posición del botón de Ralsei peluche

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        render(); //llamo la función render, que hace visible todas las imágenes y labels
        if(armando != 100){ //👈🏻☝🏻👇🏻👈🏻!!!
            System.exit(0);
        }
        System.out.println("iniciado correctamente");
    }

    public void render(){ //carga todos los labels (y botones, aunque estén ocultos)
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

    public void clear(){ //elimina todos los labels para refrescar correctamente cuando se agrega un item nuevo
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
        if(e.getSource()==ralseiButt){ //esta es la función normal de cuando haces clic, para darte puntos
            if(rand.nextInt(10) == 1) { //chance de Jevil
                points = points + ((1 + ribbon) * jevilstail * dealmaker); //esta es la fórmula que te da clics según los upgrades que tengas desbloqueados (incluye jevil)
                System.out.println(points);
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza el label que enseña el puntaje
                info.setText("* kapow!!!"); //texto para cuando haces clic
            } else {
                points = points + ((1 + ribbon) * dealmaker); //esta es la fórmula que te da clics según los upgrades que tengas desbloqueados
                System.out.println(points);
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza el bale que enseña el puntaje
                int randmess = rand.nextInt(5);
                if(randmess == 0){
                    info.setText("* squish!"); //texto para cuando haces clic
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
        if(e.getSource()==tiendaB1){ //botón de comprar ribbon
            if(points > 49){
                ribbon++; //agrega un ribbon
                points -= 50; //resta tus puntos luego de la compra
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza el label que enseña el puntaje
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
        if(e.getSource()==tiendaB2){ //botón de comprar jevil
            if(points > 199){
                jevilstail = 4; //habilita jevil en la fórmula de clics
                tiendaB2.setEnabled(false); //deshabilita poder comprar a otro jevilstail
                tiendaB2.setVisible(false);
                points -= 200; //resta tus puntos luego de la compra
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza el label que enseña el puntaje
                tiendaL2.setText("");
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
        if(e.getSource()==tiendaB3){ //botón de spamtonear (comprar dealmaker)
            if(points > 999){
                dealmaker = 2; //habilita dealmaker en la fórmula de clics
                tiendaB3.setEnabled(false); //deshabilita poder comprar otro dealmaker
                points -= 1000; //resta puntos luego de la compra
                mentiEstosSonLosPuntosReales.setText(String.valueOf(points)); //actualiza el label que enseña el puntaje
                tiendaL3.setText("");
                clear(); //vuelve a renderizar
                this.revalidate();
                this.repaint();
                render();
            }
        }
    }
}
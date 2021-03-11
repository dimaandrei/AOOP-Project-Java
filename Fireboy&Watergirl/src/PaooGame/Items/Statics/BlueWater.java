package PaooGame.Items.Statics;

import PaooGame.Graphics.Assets;
import PaooGame.RefLinks;
import PaooGame.Tiles.Tile;

import java.awt.*;
    /*! \class public class BlueWater extends StaticEntity
        \brief Defineste notiunea de apa albastra.
     */
public class BlueWater extends StaticEntity {
    public int id = 13; /*!< Referinta catre id.*/

    /*! \fn public BlueWater (RefLinks handler, float x, float y)
        \brief Constructor de initializare a unei entitati Statice de tip apa albastra.

        \param handler Un obiect de tip Handler.
        \param x Coordonata pe orizontala.
        \param y Coordonata pe verticala.
     */
    public BlueWater (RefLinks handler, float x, float y) {
        super(handler, x, y, 96, 20);
        bounds.x=0;
        bounds.y=0;
        bounds.width=96;
        bounds.height=20;
    }
    /*! \fn  public void die()
       \brief Functie ce defineste o actiune atunci cand o entitate statica "moare".
        Momentan aceasta functie nu este utila in program.
     */
    @Override
    public void die() {

    }
    /*! \fn public void Update()
        \brief Actualizeaza starea entitatii de tip apa din joc.
        Momentan aceasta functie nu este utila in program.
     */
    @Override
    public void Update() {

    }
    /*! \fn public void Draw(Graphics g)
        \brief  Deseneaza apa pe ecran.
        \param g Contextul grafic in care trebuie sa deseneze enitatea  pe ecran.
     */
    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.obstacle[0],(int) x,(int) y,width,height,null);
    }

    /*! \fn public int getId()
        \brief  Returneaza id-ul.
     */
    public int getId() {
        return id;
    }

    /*! \fn public void setId(int id)
        \brief  Seteaza id-ul.
        \param id ID-ul entitatii.
     */
    public void setId(int id) {
        this.id = id;
    }
}

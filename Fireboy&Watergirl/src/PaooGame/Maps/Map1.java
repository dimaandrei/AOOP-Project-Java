package PaooGame.Maps;

    /*! \class public class Map1 extends LevelMap
        \brief Implementeaza notiunea de harta a jocului pentru nivelul 1.
    */
public class Map1 extends LevelMap {
    /*! \fn public Map1()
        \brief Constructorul de initializare al clasei.
     */
    public Map1(){
        this.map = new int[][]{
                {0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 5, 0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 5, 0, 0, 1, 5, 0, 0, 0, 4, 4, 0, 0, 4, 0, 0, 0, 0},
                {5, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 0},
                {0, 0, 1, 5, 0, 0, 0, 0, 1, 5, 0, 0, 0, 4, 4, 4, 4, 0, 0, 0},
                {0, 1, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 4, 0, 0},
                {0, 0, 1, 5, 0, 1, 5, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0},
                {5, 0, 3, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 4, 0, 0, 0, 0, 4},
                {0, 0, 1, 5, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4},
                {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}};
    }
}

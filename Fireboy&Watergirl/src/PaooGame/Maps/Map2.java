package PaooGame.Maps;


    /*! \class public class Map1 extends LevelMap
        \brief Implementeaza notiunea de harta a jocului pentru nivelul 2.
     */
public class Map2 extends LevelMap {
    /*! \fn public Map2()
            \brief Constructorul de initializare al clasei.
     */
    public Map2() {
        this.map = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 4, 4, 0, 0, 4, 5, 0, 0, 0, 0, 4, 4, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 4, 4, 2, 3, 4, 0, 0, 0, 4, 0, 4, 4, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 4, 0, 0},
                {4, 4, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 4, 4, 5},
                {0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 5, 0, 0, 0, 1, 4, 5, 0, 0, 1, 4, 4, 4, 0, 0, 0, 0, 0},
                {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 1, 4, 4},
                {4, 0, 3, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 4, 0, 0, 0, 3},
                {4, 0, 0, 0, 0, 0, 0, 1, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}};
    }

}
// xo with ai tool.cpp :
// Ai tool can not 
#include <bits/stdc++.h>
using namespace std;
class XOBoard{
protected:
   char board[3][3] = {{0}};
   int  n_moves = 0;

public:
    /**
 * @brief Updates the board with the given symbol at the given position.
 * @param x The x coordinate of the position.
 * @param y The y coordinate of the position.
 * @param symbol The symbol to be placed at the given position.
 * @return True if the board was updated successfully, false otherwise.
 */
    bool update_board(int x, int y, char symbol) {
        if (x > 2 || x < 0 || y > 2 || y < 0) {
            return false;
        }
        else {
            if (board[x][y] != 0) {
                return false;
            }
            else {
                board[x][y] = toupper(symbol);
                n_moves++;
                return true;
            }
        }
    }
    /**
    * @brief Checks if the current player has won the game.
    * @return True if the current player has won the game, false otherwise.
    */
    bool is_winner()
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] )
            {
                if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                    return true;
                }
                else if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                    return true;
                }
                else {
                    return false;
                }
                
            }
        }

        // check columns
        for (int i = 0; i < 3; i++)
        {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                    return true;
                }
                else if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                    return true;
                }
                else {
                    return false;
                }

            }
        }

        // check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                return true;
            }
            else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                return true;
            }
            else {
                return false;
            } 
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                return true;
            }
            else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                return true;
            }
            else {
                return false;
            }
            
        }
        return false;

    }
    /**
 * @brief Checks if the game is a draw.
 * @return True if the game is a draw, false otherwise.
 */
    bool is_draw() {
        return (n_moves == 9 && !is_winner());
    }
    //@brief Displays the board
    //@details Displays the board in a 3x3 grid
    void display_board() {
        for (int i = 0; i < 3; i++)
        {
            cout << "\n| ";
            for (int j = 0; j < 3; j++)
            {
                cout << "(" << i << "," << j << ")";
                cout << board[i][j] << " |";
            }
            cout << "\n-----------------------------";
        }
        cout << endl;
    }
};

class XOPlayer {
protected:
    string name;
    char symbol;
public:
    int x, y;
    // Constructor to initiate player with name and symbol
    XOPlayer(string name, char symbol) {
        this->name = name;
        this->symbol = symbol;
    }
    /**
 * @brief Get the move from the user.
 *
 * @param x The x coordinate of the move.
 * @param y The y coordinate of the move.
 */
    void get_move() {
        cout << "\nPlease enter your move x and y (0 to 2) separated by spaces: ";
        cin >> x >> y;
    }
    //Returns a string representation of the player.
    string get_name() {
        string str;
        str = "Player: " + name;
        return str;
    }
    // Returns a string symbol of the player.
    char get_symbol() {
        return symbol;
    }
};


class XOGameManager {
public:
    /**
     * @brief this function to run the game by take objects from class player and class board and 
     * generate the process on the game 
    */
    void run() {
        XOBoard x_o;
        int x, y, choice;
        string str,str2;
        cout << "Player 1 Enter your name : ";
        cin >> str;
        XOPlayer p1(str, 'X');
        cout << "Player 2 Enter your name : ";
        cin >> str2;
        XOPlayer p2(str2, 'O');
        x_o.display_board();
        int z = 1;
        bool tie = false;
        while (z < 10) {
            if (z % 2 == 1) {
                p1.get_move();
                x_o.update_board(p1.x, p1.y, 'X');
                if (x_o.is_winner()) {
                    x_o.display_board();
                    cout<<p1.get_name() + " wins\n";
                    tie = true;
                    break;
                }
                x_o.display_board();
                z++;
            }
            else {
                p2.get_move();
                x_o.update_board(p2.x, p2.y, 'O');
                if (x_o.is_winner()) {
                    x_o.display_board();
                    cout<<p2.get_name() + " wins\n";
                    tie = true;
                    break;
                }
                x_o.display_board();
                z++;
            }

        }
        if (tie == false) {
            cout<<"Draw\n";
        }
        cout<<"This The End of Game\n";

    }
       
};

int main()
{
    XOGameManager x_o_game;
    x_o_game.run();
    system("pause");
}


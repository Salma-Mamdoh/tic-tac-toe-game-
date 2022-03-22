# first creating the board
board=["_","_","_","_","_","_","_","_","_"]

# second how to form the board

def dis():
    print("|"+board[0]+"|"+board[1]+"|"+board[2]+"|")
    print("|"+board[3]+"|"+board[4]+"|"+board[5]+"|")
    print("|"+board[6]+"|"+board[7]+"|"+board[8]+"|")

# then we should check the cases of wining
p1="x"
p2="o"
def check(board):
    if board[0]==board[1]==board[2]==p1:
        return True
    elif board[0]==board[1]==board[2]==p2:
        return True
    elif board[3]==board[4]==board[5]==p1:
        return True
    elif board[3]==board[4]==board[5]==p2:
        return True
    elif board[6]==board[7]==board[8]==p1:
        return True
    elif board[6]==board[7]==board[8]==p2:
        return True
    elif board[0]==board[3]==board[6]==p1:
        return True
    elif board[0]==board[3]==board[6]==p2:
        return True
    elif board[1]==board[4]==board[7]==p1:
        return True
    elif board[1]==board[4]==board[7]==p2:
        return True
    elif board[2]==board[5]==board[8]==p1:
        return True
    elif board[2]==board[5]==board[8]==p2:
        return True
    elif board[0]==board[4]==board[8]==p1:
        return True
    elif board[0]==board[4]==board[8]==p2:
        return True
    elif board[2]==board[4]==board[6]==p1:
        return True
    elif board[2]==board[4]==board[6]==p2:
        return True
    else:
        return False  


# then we should take the position of x or o
num=[]
def inp(board):
    n=int(input("player1 enter(1,3,5,7,9) ,player2 enter(2,4,6,8):"))
    num.append(n)
    if board[n-1]!="_":
        return("this position is exist plz enter another position")
        return inp(board)
        
    else:
        return n
# check the points
def check_points(num):
    if(num[0]+num[2]+num[4])>=15:
        return True
    elif(num[0]+num[2]+num[4]+num[6])>=15:
         return True
    elif(num[0]+num[2]+num[4]+num[6]+num[8])>=15:
        return True
    elif(num[1]+num[3]+num[5])>=15:
        return True
    elif(num[1]+num[3]+num[5]+num[7])>=15:
        return True 
    else:
        return False
    


# then check who is the winner
dis()
for i in range(10):
    if i%2!=0:
         n=inp(board)
         board[n-1]="o"
         dis()
         if check(board)and check_points(num):
             print ("player 2 is winner :)")
             break
    elif i%2==0:
        n=inp(board)
        board[n-1]="x"
        dis()
        if check(board)and check_points(num):
            print("player 1 is the winner :)")
            break 
    else:
        print("no one win :) you can play again")
     

print("the end")
     
    

    
    
    
    
    
    
    






        

    


    

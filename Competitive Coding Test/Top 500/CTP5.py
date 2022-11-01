import sys
score=int(sys.argv[1])
def isWinningScore(score):
    if score%7==0:
        return True
    return False
print("true" if isWinningScore(score) else "false");
  

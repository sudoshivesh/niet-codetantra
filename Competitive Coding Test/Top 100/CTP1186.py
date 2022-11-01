#This quetion is asked in the 2nd round of competitive coding which held to sort out  100 among 500




def solution(str,d):
    #Write code here
    def num(w):
        l,r=0,len(w)-1
        cnt=0
        while l<r:
            if w[l]!=w[r]:
                cnt+=1
            l+=1
            r-=1
        return cnt
    def dp(i,d):
        if(i,d) not in memo:
            if d==1:
                memo[i,d]=num(str[:i+1])
            else:
                memo[i,d]=min((dp(j,d-1))
                for j in range(d-2,i))
        return memo[i,d]
    memo={}
    n=len(str)
    return dp(n-1,d)
  

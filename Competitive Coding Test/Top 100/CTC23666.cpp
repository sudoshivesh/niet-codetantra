#include<iostream>
using namespace std;
#include<string>
#include<vector>
string construct2(int cold,int warm){
  int n=cold+1;
  vector<int> days(n);
  int i=0;
  while(warm>0){
    days[i]++;
    warm--;
    i=(i+1)%n;
  }
  string ans;
  sort(days.begin(),days.end());
  for(int i=0;i<n;i++){
    for(int j=1;j<=days[i];j++) ans+='W';
    if(cold>0){
      ans+='C';
      cold--;
    }
  }
  return ans;
}
string lowestWeatherQualityDays(int nDays, int nColdDays){
    //Write code here
    string ans ="";
    if(nColdDays==0){
        for(int i=0;i<nDays;i++) ans+='W';
        return ans;
    }
    if(nColdDays==nDays){
        for(int i=0;i<nDays;i++) ans+='C';
        return ans;
    }
    int n=nDays-nColdDays;
    if(nColdDays>=n){
        while(n>0 or nColdDays>0){
            if(n>0){
                ans+='W';
                n--;
            }
            if(nColdDays>0){
                ans+='C';
                nColdDays--;
            }
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
    else{
        return construct2(nColdDays,n);
    }
}
int main(int argc,char *argv[]){
    int nDays=atoi(argv[1]);
    int nColdDays=atoi(argv[2]);
    cout << lowestWeatherQualityDays(nDays,nColdDays)<<"is";
    return 0;
}

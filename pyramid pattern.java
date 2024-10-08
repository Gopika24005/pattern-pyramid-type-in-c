#include<stdio.h>
int main(){
    int n,i,j,temp;
    scanf("%d",&n);
    temp=n;
    for(i=1;i<=n;i++){
        for(j=i;j<=n;j++)
          printf(  " ");
        for(j=1;j<=i;j++){
            if(i%2)
              printf(" * ");
        }
     n=temp*2;  
     printf("\n");
    }
    return 0;
}

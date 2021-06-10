#include<iostream>
using namespace std;
int main(){
    int rows,cols;
    cout<<"Enter the no. of rows : ";
    cin>>rows;
    cout<<"Enter the no. of cols : ";
    cin>>cols;

    //Normal Rectangle
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=cols;j++){
            cout<<"* ";
        }
        cout<<endl;
    }

    //For Hollow Rectangle
    cout<<"==============================================\n";
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=cols;j++){
            if(i==1||i==rows||j==1||j==cols)
            cout<<"* ";
            else
            cout<<"  ";
        }
        cout<<endl;
    }   
}
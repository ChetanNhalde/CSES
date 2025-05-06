#include <bits/stdc++.h>

using namespace std;

int main() {

    int n;
    cin >> n;

    queue<int> children;

    for(int i=1;i<=n;i++) {
        children.push(i);
    }

    bool flag = false;
    while(!children.empty()) {
        int ele = children.front();
        children.pop();
        if(flag) {
            cout << ele << " ";
        }else 
            children.push(ele);

        flag = !flag;
    }

    return 0;
}
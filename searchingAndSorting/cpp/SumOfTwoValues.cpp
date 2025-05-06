#include <bits/stdc++.h>

using namespace std;

int main() {

    int n,x;
    cin >> n >> x;

    if(n == 1) {
        cout << "IMPOSSIBLE" << endl;
        return 0;
    }

    vector<pair<int, int>> a;
    for(int i = 0; i < n; i++) {
        int k;
        cin >> k;
        a.push_back({k, i+1});
    }

    sort(a.begin(), a.end());

    int left = 0;
    int right = n - 1;
    while(left < right) {
        if(a[left].first + a[right].first > x) {
            right--;
        }else if(a[left].first + a[right].first < x) {
            left++;
        }else if(a[left].first + a[right].first == x) {
            cout << a[left].second << " " << a[right].second << endl;
            return 0;
        }
    }

    cout << "IMPOSSIBLE" << endl;

}
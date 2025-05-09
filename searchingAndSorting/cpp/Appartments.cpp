#include <bits/stdc++.h>

using namespace std;

int main() {


    int n,m,k;
    cin >> n >> m >> k;
    vector<int> a(n);
    vector<int> b(m);

    for(int i=0;i<n;i++) {
        cin >> a[i];
    }

    for(int i=0;i<m;i++) {
        cin >> b[i];
    }
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    int i = 0, j = 0;
    int ans = 0;
    while(i < n && j < m) {
        if(a[i] + k >= b[j] && a[i] - k <= b[j]) {
            ans++;
            i++;
            j++;
        } else if(a[i] < b[j]) {
            i++;
        } else {
            j++;
        }
    }

    cout << ans << endl;
    return 0;
}

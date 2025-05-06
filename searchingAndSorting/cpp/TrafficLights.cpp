#include <bits/stdc++.h>

using namespace std;


int main() {

    int x,n;
    cin >> x >> n;
    
    set<int> lightsPos = {0,x};
    multiset<int> segments = {x};
    while(n--) {
        int pos;
        cin >> pos;

        auto it = lightsPos.upper_bound(pos);

        int left = *prev(it);
        int right = *it;

        segments.erase(segments.find(right - left));
        segments.insert(pos - left);
        segments.insert(right - pos);

        lightsPos.insert(it, pos);

        cout << *segments.rbegin() << " ";

    }

    return 0;
}
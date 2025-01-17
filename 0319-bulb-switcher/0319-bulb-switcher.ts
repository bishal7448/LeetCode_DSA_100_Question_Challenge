function bulbSwitch(n: number): number {
    let ans = 0;
    let i = 1;

    while (i * i <= n) {
        ans++;
        i++;
    }

    return ans;
};
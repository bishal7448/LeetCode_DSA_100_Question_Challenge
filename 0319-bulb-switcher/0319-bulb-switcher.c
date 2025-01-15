int bulbSwitch(int n) {
    int count = 0; //Number of bulbs that are on after n rounds
    int i = 1; //Initial value

    while(i * i <= n) {
        count++;
        i++;
    }

    return count;
}
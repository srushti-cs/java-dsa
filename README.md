//SUBNET
#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int ip[4], prefix;

    cout << "Enter IP Address: ";
    cin >> ip[0] >> ip[1] >> ip[2] >> ip[3];

    cout << "Enter CIDR prefix: ";
    cin >> prefix;

    int mask[4], network[4], broadcast[4];

    int bits = prefix;

    // Calculate Subnet Mask
    for (int i = 0; i < 4; i++) {

        if (bits >= 8) {
            mask[i] = 255;
            bits -= 8;
        }
        else if (bits > 0) {
            mask[i] = 256 - pow(2, 8 - bits);
            bits = 0;
        }
        else {
            mask[i] = 0;
        }

        // Calculate Network ID
        network[i] = ip[i] & mask[i];

        // Calculate Broadcast ID
        broadcast[i] = network[i] | (255 - mask[i]);
    }

    // Display Subnet Mask
    cout << "\nSubnet Mask: ";
    for (int i = 0; i < 4; i++) {
        cout << mask[i];
        if (i < 3) cout << ".";
    }

    // Display Network ID
    cout << "\nNetwork ID: ";
    for (int i = 0; i < 4; i++) {
        cout << network[i];
        if (i < 3) cout << ".";
    }

    // Display Broadcast ID
    cout << "\nBroadcast ID: ";
    for (int i = 0; i < 4; i++) {
        cout << broadcast[i];
        if (i < 3) cout << ".";
    }

    // Display First Usable IP
    cout << "\nFirst Usable IP: ";
    for (int i = 0; i < 4; i++) {
        cout << network[i] + (i == 3 ? 1 : 0);
        if (i < 3) cout << ".";
    }

    // Display Last Usable IP
    cout << "\nLast Usable IP: ";
    for (int i = 0; i < 4; i++) {
        cout << broadcast[i] - (i == 3 ? 1 : 0);
        if (i < 3) cout << ".";
    }

    // Calculate Total IP Addresses
    int total = pow(2, 32 - prefix);

    cout << "\nTotal IP Addresses: " << total;

    // Calculate Usable Hosts
    cout << "\nUsable Hosts: "
         << (prefix >= 31 ? 0 : total - 2);

    return 0;
}

//STOP AND WAIT

#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter number of frames: ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        cout << "\nSender: Sending frame " << i << endl;
        cout << "Receiver: Frame " << i << " received" << endl;
        cout << "Receiver: Sending ACK " << i << endl;
        cout << "Sender: ACK " << i << " received" << endl;
    }

    cout << "\nAll frames transmitted successfully." << endl;

    return 0;
}

// Go back


#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n, window, lost;

    cout << "Enter number of frames: ";
    cin >> n;

    cout << "Enter sender window size: ";
    cin >> window;

    cout << "Enter frame number to simulate loss (0 for none): ";
    cin >> lost;

    if (n <= 0 || window <= 0 || lost < 0 || lost > n) {
        cout << "Invalid input." << endl;
        return 0;
    }

    int base = 1;

    while (base <= n) {
        int end = min(base + window - 1, n);

        cout << "\nSending window: " << base
             << " to " << end << endl;

        if (lost >= base && lost <= end) {

            for (int i = base; i < lost; i++) {
                cout << "Frame " << i
                     << " received; ACK " << i << endl;
            }

            cout << "Frame " << lost << " is lost." << endl;

            for (int i = lost + 1; i <= end; i++) {
                cout << "Receiver discards frame "
                     << i << endl;
            }

            cout << "Retransmitting from frame "
                 << lost << endl;

            for (int i = lost; i <= end; i++) {
                cout << "Retransmitting frame " << i
                     << "; ACK " << i << " received" << endl;
            }

            lost = 0;
        }
        else {
            for (int i = base; i <= end; i++) {
                cout << "Frame " << i
                     << " received; ACK " << i << endl;
            }
        }

        base = end + 1;
    }

    cout << "\nAll frames transmitted successfully." << endl;

    return 0;
}

//selective

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n, window, lost;

    cout << "Enter number of frames: ";
    cin >> n;

    cout << "Enter sender window size: ";
    cin >> window;

    cout << "Enter frame number to simulate loss (0 for none): ";
    cin >> lost;

    if (n <= 0 || window <= 0 || lost < 0 || lost > n) {
        cout << "Invalid input." << endl;
        return 0;
    }

    int base = 1;
    bool lossHandled = false;

    while (base <= n) {
        int end = min(base + window - 1, n);

        cout << "\nSending window: " << base
             << " to " << end << endl;

        for (int i = base; i <= end; i++) {

            if (i == lost && !lossHandled) {
                cout << "Frame " << i
                     << " is lost; no ACK received." << endl;
            }
            else {
                cout << "Frame " << i
                     << " received; ACK " << i << endl;
            }
        }

        if (lost >= base && lost <= end && !lossHandled) {

            cout << "Retransmitting only frame "
                 << lost << endl;

            cout << "Frame " << lost
                 << " received; ACK " << lost << endl;

            lossHandled = true;
        }

        base = end + 1;
    }

    cout << "\nAll frames transmitted successfully." << endl;

    return 0;
}

//distance


#include <iostream>
using namespace std;

const int MAX = 10;
const int INF = 999;

int main() {
    int n;
    int cost[MAX][MAX];
    int dist[MAX][MAX];
    int nextHop[MAX][MAX];

    cout << "Enter number of routers: ";
    cin >> n;

    cout << "Enter cost matrix (999 for no link):\n";

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> cost[i][j];

            dist[i][j] = cost[i][j];

            nextHop[i][j] =
                (i != j && cost[i][j] < INF) ? j : -1;
        }
    }

    // Distance Vector Updates
    bool updated;
    int rounds = 0;

    do {
        updated = false;
        rounds++;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {

                if (i == k || cost[i][k] >= INF)
                    continue;

                for (int j = 0; j < n; j++) {

                    if (dist[k][j] >= INF)
                        continue;

                    int newCost = cost[i][k] + dist[k][j];

                    if (newCost < dist[i][j]) {
                        dist[i][j] = newCost;
                        nextHop[i][j] = k;
                        updated = true;
                    }
                }
            }
        }

    } while (updated && rounds < n);

    cout << "\nDistance Vector Routing Tables\n";

    for (int i = 0; i < n; i++) {

        cout << "\nRouter " << char('A' + i) << "\n";

        cout << "Destination\tCost\tNext Hop\n";

        for (int j = 0; j < n; j++) {

            cout << char('A' + j) << "\t\t";

            if (dist[i][j] >= INF) {
                cout << "INF\t-\n";
            }
            else {
                cout << dist[i][j] << "\t";

                if (i == j)
                    cout << "-\n";
                else
                    cout << char('A' + nextHop[i][j]) << "\n";
            }
        }
    }

    return 0;
}

//link state


#include <iostream>
using namespace std;

const int MAX = 10;
const int INF = 999;

void dijkstra(int n, int graph[MAX][MAX], int src) {
    int dist[MAX], parent[MAX];
    bool visited[MAX] = {false};

    for (int i = 0; i < n; i++) {
        dist[i] = INF;
        parent[i] = -1;
    }

    dist[src] = 0;

    for (int count = 0; count < n - 1; count++) {
        int u = -1;
        int best = INF;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && dist[i] < best) {
                best = dist[i];
                u = i;
            }
        }

        if (u == -1)
            break;

        visited[u] = true;

        for (int v = 0; v < n; v++) {
            if (!visited[v] &&
                graph[u][v] < INF &&
                dist[u] + graph[u][v] < dist[v]) {

                dist[v] = dist[u] + graph[u][v];
                parent[v] = u;
            }
        }
    }

    cout << "\nRouting table for Router "
         << char('A' + src) << "\n";

    cout << "Destination\tCost\tNext Hop\n";

    for (int dest = 0; dest < n; dest++) {
        cout << char('A' + dest) << "\t\t";

        if (dist[dest] == INF) {
            cout << "INF\t-\n";
        }
        else if (dest == src) {
            cout << "0\t-\n";
        }
        else {
            int hop = dest;

            while (parent[hop] != -1 &&
                   parent[hop] != src) {
                hop = parent[hop];
            }

            cout << dist[dest] << "\t"
                 << char('A' + hop) << "\n";
        }
    }
}

int main() {
    int n;
    int graph[MAX][MAX];

    cout << "Enter number of routers: ";
    cin >> n;

    cout << "Enter cost matrix (999 for no link):\n";

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> graph[i][j];
        }
    }

    for (int source = 0; source < n; source++) {
        dijkstra(n, graph, source);
    }

    return 0;
}

//parity


#include <stdio.h>
#include <string.h>

int main()
{
    char data[100];
    int ones = 0, i, parity;

    printf("Enter binary data: ");
    scanf("%s", data);

    for(i = 0; i < strlen(data); i++)
    {
        if(data[i] == '1')
            ones++;
    }

    printf("\nChoose Parity Type:\n");
    printf("1. Even Parity\n");
    printf("2. Odd Parity\n");
    printf("Enter choice: ");
    scanf("%d", &parity);

    if(parity == 1)
    {
        if(ones % 2 == 0)
            printf("\nParity bit = 0");
        else
            printf("\nParity bit = 1");

        printf("\nEven parity condition satisfied.");
    }
    else if(parity == 2)
    {
        if(ones % 2 == 0)
            printf("\nParity bit = 1");
        else
            printf("\nParity bit = 0");

        printf("\nOdd parity condition satisfied.");
    }
    else
    {
        printf("\nInvalid choice.");
    }

    return 0;
}

//
crc


#include <stdio.h>
#include <string.h>

void xorOperation(char *a, char *b, int pos, int n)
{
    int i;

    for(i = 0; i < n; i++)
    {
        a[pos + i] = (a[pos + i] == b[i]) ? '0' : '1';
    }
}

int main()
{
    char data[100], generator[100], temp[200];
    int dataLen, genLen, i;

    printf("Enter data bits: ");
    scanf("%s", data);

    printf("Enter generator: ");
    scanf("%s", generator);

    dataLen = strlen(data);
    genLen = strlen(generator);

    strcpy(temp, data);

    for(i = 0; i < genLen - 1; i++)
        strcat(temp, "0");

    printf("\nData after appending zeros: %s\n", temp);

    for(i = 0; i <= strlen(temp) - genLen; i++)
    {
        if(temp[i] == '1')
            xorOperation(temp, generator, i, genLen);
    }

    printf("CRC Remainder: ");

    for(i = dataLen; i < strlen(temp); i++)
        printf("%c", temp[i]);

    printf("\n");

    printf("Transmitted Codeword: %s", data);

    for(i = dataLen; i < strlen(temp); i++)
        printf("%c", temp[i]);

    printf("\n");

    return 0;
}

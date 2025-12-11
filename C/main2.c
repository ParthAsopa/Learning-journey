#include <stdio.h>

void printArr(int n, int arr[n][n])
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}
int main()
{
    int arr[4][4] = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}, {13, 14, 15, 16}};
    int i, j;
    int ans[4][4];
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 4; j++)
        {
            ans[j][4 - i - 1]=arr[i][j];
        }
    }
    printf("\n\n\n");
    printArr(4, arr);
    printf("\n\n\n");
    printArr(4, ans);
    return 0;
}

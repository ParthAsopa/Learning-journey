#include <stdio.h>

int main()
{
    char i[] = {'A', 'B', 'C'};
    char *j = i;
    int arr[3];
    for (int i = 0; i < 3; i++)
    {
        arr[i] = *(j++);
    }
    for (int i = 0; i < 3; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
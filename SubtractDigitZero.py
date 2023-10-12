# Given a number N, the task is to find the minimum number of operations required to 
# reduce the number N to zero by subtracting the given number by any digit present in it.

def subtractDigitZero(N):
    dp = [1e9 for i in range(N + 1)]
    dp[0] = 0
    for i in range(N + 1):
        for c in str(i):
            dp[i] = min(dp[i], dp[i - (ord(c) - 48)] + 1)
    return dp[N]


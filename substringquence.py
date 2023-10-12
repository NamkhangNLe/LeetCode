def substringquence(A, B):
    dp = [[0 for i in range(len(B) + 1)] 
              for j in range(len(A) + 1)]
               
    for i in range(0, len(A) + 1):
        for j in range(0, len(B) + 1):
            if (i == 0 or j == 0):
                dp[i][j] = 0
              
    for i in range(1, len(A) + 1):
        for j in range(1, len(B) + 1):

            if (A[i - 1] == B[j - 1]):
                dp[i][j] = 1 + dp[i - 1][j - 1]
            else:
                dp[i][j] = dp[i - 1][j]
    len1 = 0
    col = 0
    for i in range(0, len(B) + 1):
        if (dp[len(A)][i] > len1):
            len1 = dp[len(X)][i]
            col = i
    result = ""
    i = n
    j = col
    while (len1 > 0):
        if (A[i - 1] == B[j - 1]):
            res = A[i - 1] + result
            i -= 1
            j -= 1
            len1 -= 1
        else:
            i -= 1
    return result

class Node:
    def get_number_of_islands(self,binaryMatrix):
      M = len(binaryMatrix)
      N = len(binaryMatrix[0])

      print("M=%d, N=%d"% (M,N))
      count = 0

      for i in xrange(M):
        for j in xrange(N):
          if binaryMatrix[i][j] == 1:
            print("yes")
            self.dfs(binaryMatrix, i, j, M, N)

      return count


    def dfs(self, binaryMatrix, i, j, M, N):
        print("hi")
        binaryMatrix[i][j] = -1

      for di, dj in ((1, 0), (0, 1), (-1, 0), (0, -1)):
        nextRow = i + di
        nextCol = j + dj

        if 0 <= nextRow < M and 0 <= nextCol < N and binaryMatrix[nextRow][nextCol] == 1:
          self.dfs(binaryMatrix, nextRow, nextCol, M, N)


a = [[1,1,1,1,0], [1,1,0,1,0], [1,1,0,0,0], [0,0,0,0,0]]

c = Node()
print(Node.get_number_of_islands(c, a));

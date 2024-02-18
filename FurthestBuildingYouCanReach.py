class FurthestBuildingYouCanReach:
    def furthestBuilding(self, heights: List[int], bricks: int, ladders: int) -> int:
        heap = []
        for i in range(len(heights) - 1):
            heightToClimb = heights[i + 1] - heights[i]
            if heightToClimb > 0: ## If next building is taller
                heapq.heappush(heap, heightToClimb) ## Use a ladder and record brick cost
            if len(heap) > ladders:  # if the number of climbs is more than ladders
                bricks -= heapq.heappop(heap)  # use bricks for the smallest climb
            if bricks < 0:  # if bricks are not enough
                return i  # return the last successfully climbed building
        return len(heights) - 1  # if all buildings can be climbed

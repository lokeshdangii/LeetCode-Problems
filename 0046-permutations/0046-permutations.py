'''
public static void intPermutation2(int n){
        String str = Integer.toString(n);
        String ans = "";
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1); 
            findPermutation(Newstr, ans+curr);
        } 

    }
'''

class Solution:
    def __init__(self):
        self.res = []
        self.track = []
        self.used =  []
    
    def permute(self, nums):
        self.used = [False] * len(nums)
        self.backtracking(nums)
        return self.res
    
    def backtracking(self, nums):
        # consider: 1.path 2.options, 3.ending condition
        # ending
        if len(self.track) == len(nums):
            self.res.append(self.track.copy())
            return
        
        for i in range(len(nums)):
            if self.used[i]:
                continue
            self.track.append(nums[i])
            self.used[i] = True
            self.backtracking(nums)
            # post order
            self.used[i] = False
            self.track.pop()
            
        


























# class Solution:
#     def __init__(self):
#         # record the res: List[paths]
#         self.res = []
    
#     def permute(self, nums: List[int]) -> List[List[int]]:
#         # record the path (single)
#         track = []

#         # used to track if a num is used or not, whether we should include it in the options 
#         used = [False] * len(nums)
#         self.backtracking(nums, track, used)

#         return self.res

#     # the framework of backtracking:
#     # 1.path: recorded in track
#     # 2.options: the elements in nums which are not used (used[i] == False)
#     # 3.endig condition: all the elements in nums appears in the track, (lengths are equal)

#     def backtracking(self, nums: List[int], track: List[int], used: List[bool]):
#         # trigger the ending condition
#         if len(track) == len(nums):
#             # add the track into the res
#             self.res.append(track.copy()) # remember to add the copy, not the pointer!
#             return 

#         for i in range(len(nums)):
#             # rule out illegal elements (which are used)
#             if used[i] == True:
#                 continue
            
#             # append the unused num to the track
#             track.append(nums[i])
#             used[i] = True # change the status

#             # recurse into next backtracking
#             self.backtracking(nums, track, used)

#             # after the two lengths are equal, the backtracking ends, we need to pop the last
#             # consider other options
#             track.pop()
#             used[i] = False
#             # O(n * n!)
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def find_permutation(lst, ans):
            if len(lst) == 0:
                result.append(ans[:])  # Append a copy of 'ans' to 'result'
                return

            for i in range(len(lst)):
                curr_num = lst[i]
                new_lst = lst[:i] + lst[i+1:]  # Create a new list without the current element
                ans.append(curr_num)
                find_permutation(new_lst, ans)
                ans.pop()  # Backtrack by removing the last element

        result = []
        ans = []
        find_permutation(nums, ans)
        return result
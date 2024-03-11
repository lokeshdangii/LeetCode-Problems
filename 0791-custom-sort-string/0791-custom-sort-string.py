class Solution:
    def customSortString(self, order: str, s: str) -> str:
        result =""
        for char in order:
            if char in s:
                cnt = s.count(char)
                s = s.replace(char, "")
                
                for i in range(cnt):
                    result += char
                    
        result+= s
        return result
                    
                
        
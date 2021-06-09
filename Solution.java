import java.util.*;

//class Solution{


    /*public int getResult(int n) {
        if (n<1){
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int count= 2 ,i,curr=0;
        for (i = 1; i <=n ; i++) {
            list.add(i);
        }

        while(list.size()>1){
            curr = (curr+1)%count;
            if (curr!=1){
                list.remove(i);
            }else{
                i++;
            }

        }
        count++;
        curr = 0;
if (list.size()>1){
    int last = list.removeLast();
    list.addFirst(last);
}*/

/*class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(;k>0;k--){
            int [] [] newGrid = new int [grid.length][grid[0].length];
            for(int a= 0;a<grid.length;a++){
                for(int b = 0;b<grid[0].length-1;b++){
                    newGrid[a][b+1] = grid[a][b];
                }
            }
            for(int a = 0;a<grid.length-1;a++){
                newGrid[a+1][0] = grid[a][grid[0].length-1];
            }
            newGrid[0][0] = grid[grid.length-1][grid[0].length-1];
            grid = newGrid;
        }
        List<List<Integer>> ret = new ArrayList<>();
        for(int [] a : grid){
            List<Integer> ListRow = new ArrayList<>();
            ret.add(ListRow);
            for(int b : a)
                ListRow.add(b);
        }
        return ret;
    }
}*/
/*
class Solution{


    public int getResult(int n) {
        if (n < 1)
            return -1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int round = 2, i, curr = 0;
        for (i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            i = 0;
            while (list.size() > 1 && i < list.size()) {
                curr = (curr + 1) % round;
                if (curr != 1) {
                    list.remove(i);
                } else {
                    i++;
                }
            }
            round++;// 下一轮的最大报数
            curr = 0;// 表示还未开始报数
            if (list.size() > 1) {// 将最后报数的元素移动到链表首部，即确保每次报数从链表首部开始。
                int last = list.removeLast();
                list.addFirst(last);
            }
        }
        return list.pop();// 返回最后一个元素
    }}*/
/*class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String str) {
        StringBuffer ret = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            char ch = str.charAt(i);
            if (ch != '#') {
                ret.append(ch);
            } else {
                if (ret.length() > 0) {
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }
}*/
//有效括号
/*class Solution {
    public boolean KuoHao(String s) {
        Stack<Character> stack  = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(stack.empty()) {
                System.out.println("右括号多！");
                return false;
            }
             else{
                 char top = stack.peek();
                 if (top=='(' && ch ==')' ||top=='{' && ch =='}' || top=='[' && ch ==']') {
                     stack.pop();
                 }else{
                     System.out.println("左右括号不匹配！");
                     return false;
                 }
            }
        }
        return true;
    }
}*/
class Solution {
    /*public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }
        if (p==null&&p!=null){
            return false;
        }
        if ( p!=null && q== null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }*/
    /*public void tree2strChild(TreeNode root,StringBuilder sb){
        if (root==null){
            sb.append(root.val);
        }
        if (root.left==null){
            if (root.right==null){
                return;
            }else{
                sb.append("()");
            }
        }else{
            sb.append("(");
            tree2strChild(root.left,sb);
            sb.append(")");
        }
        if (root.right==null){
            return;
        }else{
            sb.append("(");
            tree2strChild(root.right,sb);
            sb.append(")");
        }
    }
    public String tree2str(TreeNode root){
StringBuilder sb = new StringBuilder();
if (root==null){
    return sb.toString();
}
tree2strChild(root,sb);
return sb.toString();
    }*/
    /*public boolean isSirChild(TreeNode leftTree,TreeNode rightTree){
if (leftTree==null&&rightTree!=null){
    return false;
}
if (leftTree!=null&&rightTree==null){
    return false;
}
if (leftTree==null && rightTree==null){
    return true;
}
if (leftTree.val != rightTree.val){
    return false;
}
return isSirChild(leftTree.left, rightTree.right)
        && isSirChild(leftTree.right,rightTree.left);
    }
    public  boolean isSir(TreeNode root){
        if (root == null){
            return true;
        }
return isSirChild(root.left,root.right);
    }*/
    //二叉搜索树转化为有序双向链表
    /*public void convertChild(TreeNode pCur){
        TreeNode prev = null;
        if (pCur==null){
            return;
        }
        convertChild(pCur.left);
        pCur.left = prev;
        if(prev !=null){
            pCur.right = pCur;
        }

        prev = pCur;
        convertChild(pCur.right);
    }
    public TreeNode Convert(TreeNode pRootTree){
        if (pRootTree==null){
            return null;
        }
        convertChild(pRootTree);
        TreeNode head = pRootTree;
        while (head.left!=null){
            head = head.left;
        }
        return head;
    }*/
    //字符串包含的数字集合
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            StringBuilder sb = new StringBuilder();//建一个字符串
            for (int i = 0; i < str.length(); i++) {
                char ch = sb.charAt(i);//遍历i下标的字符
                if (!sb.toString().contains(ch + "")) {//字符串里面是否包含i字符
                    sb.append(ch);//没有的话，将i字符放入该字符串
                }
            }
            System.out.println(sb);
        }
    }*/
    //合并两个有序数组
    /*public void merge(int []nums1,int m ,int []nums2,int n){
 int s1 = 0;
 int e1 = m-1;
 int s2 = 0;
 int e2 = n-1;
 int[] tmp = new int[m+n];
 int k = 0;
 while(s1<=e1&&s2<=e2){
     if (nums1[s1]<=nums2[s2]){
         tmp[k] = nums1[s1] ;
         s1++;
         k++;
     }else{
         tmp[k] = nums2[s2] ;
         s2++;
         k++;
     }
 }
 while(s1<=e1){
      tmp[k] =nums1[s1];
     s1++;
     k++;
 }
 while(s2<=e2){
       tmp[k]=nums2[s2];
     s2++;
     k++;
 }
        for (int i = 0; i < tmp.length; i++) {
            nums1[s1] = tmp[i];
        }
    }*/
    //给你一个数字，判断这个数字是不是2的K次方
    /*public static boolean isKTwo(int n){
        if ((n & (n-1))==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isKTwo(3));
        System.out.println(isKTwo(4));
        System.out.println(isKTwo(8));
    }*/
    //主串里面找子串
   /*public static int BF(String str, String sub){
       int i = 0;
       int j = 0;
       //遍历子串
       while(i<str.length()&&j<sub.length()){
         if (str.charAt(i) ==sub.charAt(j)) {
             i++;
             j++;
         }else{
          i = j-j+1;
          j=0;
         }
       }
       if (j>=sub.length()){
           return i-j;
       }
      return -1;
   }
    public static void main(String[] args) {
       System.out.println(BF("accabc","abc"));
    }*/
    //棒球比赛
    public int calPoints(String[] ops){
       Stack<Integer> stack = new Stack<>();
       for (String op : ops){
           if (op.equals("+")){
               int top = stack.pop();
               int newTop =top+stack.peek();
               stack.push(top);
               stack.push(newTop);
           }else if (op.equals("C")){
               stack.pop();
           }else if (op.equals("D")){
               stack.push(2*stack.peek());
           }else{
               stack.push(Integer.valueOf(op));
           }
       }
       int ans = 0;
       /*for (int score : stack) ans +=score;
       return ans;*/
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }

    //栈的压入，弹出序列
    public boolean IsPopOrder(int [] pushA,int [] popA) {
       if (pushA.length == 0||popA.length==0){
           return false;
       }
       Stack<Integer> stack = new Stack<>();
       int j = 0;
       //将pushA的元素放入栈
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            //当pushA[i]==popA[i],弹出栈顶元素
            while(!stack.isEmpty() && stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    //逆波兰表达式
    public int evalRPN(String[] tokens) {
Stack<Integer> stack = new Stack<>();
int left = 0;
int right = 0;
for (String sb : tokens){
    switch (sb){
        case"+":
            stack.push(stack.pop()+ stack.pop());
            break;
        case"-":
            right = stack.pop();
            left = stack.pop();
            stack.push(left-right);
            break;
        case"*":
            stack.push(stack.pop()*stack.pop());
            break;
        case"/":
            right = stack.pop();
            left = stack.pop();
            stack.push(left/right);
            break;
        default:
            stack.push(Integer.valueOf(sb));
    }
}
return stack.pop();
    }
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
    //两个数组的交集

        public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set  = new HashSet<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int i = 0;int j = 0;
       while(i<nums1.length&&j<nums2.length){
           if (nums1[i]==nums2[j]){
               set.add(nums1[i]);
               i++;
               j++;
           }else if(nums1[i]<nums2[j]){
               i++;
           }else{
               j++;
           }
       }
       int[] ret = new int[set.size()];
       int index = 0;
       for (int num:set){
           ret[index] = num;
           index++;
       }
       return ret;
        }
   //出现次数多的单词
            public String mostCommonWord (String paragraph, String[]banned){
                paragraph += ".";
                Set<String> set = new HashSet<>();
                Map<String, Integer> map = new HashMap<>();
                for (String word : banned) set.add(word);
                int count = 0;
                String ans = "";
                StringBuilder word = new StringBuilder();
                for (char c : paragraph.toCharArray()) {
                    if (Character.isLetter(c)) {
                        word.append(Character.toLowerCase(c));
                    } else if (word.length() > 0) {
                        String arr = word.toString();
                        if (!set.contains(arr)) {
                            map.put(arr, map.getOrDefault(arr, 0) + 1);
                            if (map.get(arr) > count) {
                                count = map.get(arr);
                                ans = arr;
                            }
                        }
                        word = new StringBuilder();
                    }
                }
                return ans;
            }
    //比较字符串最小字母出现频次
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
int[] querie = new int[queries.length];
int [] word = new int[words.length];
int index = 0;
            for (int i = 0; i < words.length; i++) {
                char[] ch = words[i].toCharArray();
                Arrays.sort(ch);
                int count = 1;
                for (int j = 0; j < ch.length-1; j++) {
                    if (ch[j]==ch[j+1]){
                        count++;
                    }else{
                        break;
                    }
                }
                word[index++] =count;
            }
            int index2 = 0;
            for (int i = 0; i < queries.length; i++) {
                char[] ch = queries[i].toCharArray();
                Arrays.sort(ch);
                int count  = 1;
                for (int j = 0; j < ch.length; j++) {
                    if (ch[j] == ch[j+1]){
                        count++;
                    }else{
                        break;
                    }
                }
                int recount = 0;
                for (int k = 0; k < word.length; k++) {
                    if (count<word[k]){
                        recount++;
                    }
                }
                querie[index2++] = count;
            }
            return querie;
    }
//判断是否有重复元素
        public boolean containsDuplicate(int[] nums) {
if (nums==null){
    return true;
}
Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])){
                    return true;
            }
            }
            return false;
    }
    //找不同
    public char findTheDifference(String s, String t) {
int n1 = 0;
int n2 = 0;
        for (int i = 0; i < s.length(); i++) {
            n1+=s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            n2+=t.charAt(i);
        }
return (char) (n1-n2);
    }
    //组队竞赛
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            int n =scan.nextInt();
            int[] array = new int[3*n];
            long sum = 0;
            for (int i = 0; i < 3*n; i++) {
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);
            for (int i = 0; i < n; i++) {
                sum+=array[array.length-2*(i+1)];
            }
            System.out.println(sum);
        }
        }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        int count = 0;
        while(i<n){
            if (array[i]<array[i+1]){
                while(array[i]>array[i+1]){
                   i++;
                }
                i++;
                count++;
            }else if (array[i]==array[i+1]){
                i++;
            }else{
                while(array[i]>array[i+1]){
                    i++;
                }
                i++;
                count++;
            }
        }
        System.out.println(count);
    }*/
//删除公共字符
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            if (map.get(str2.charAt(i))==null){
                map.put( str2.charAt(i),1);
            }else{
                map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
            }
        }
        String str = "";
        for (int i = 0; i < str1.length(); i++) {
            if (map.get(str1.charAt(i))==null){
                str+=str1.charAt(i);
            }
        }
        System.out.println(str);
    }*/
  //统计回文
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String str = "";
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                str+=str1.charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                   str.indexOf(str2.charAt(i));
                    char[] arr = str.toCharArray();
                    for (int k = 0; k < str.length(); k++) {
                        if (arr[0]!=arr[arr.length-1]){
                            return;
                        }
                        k++;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }*/
    //连续最大和
    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int j = 0;
        int sum = 0;
        int max = nums[0];
        for (  int i = 0; i <nums.length; i++) {
            sum+=nums[i];
            if (sum>max){
                max = sum;
                j = i;
            }
        }
        System.out.println(max);
    }*/
    //字符串转换为整数
    public int StrToInt(String str) {
        char[] ch = str.toCharArray();
        if (ch==null|| ch.length==0){
            return 0;
        }
        int flag = 1;
        if (ch[0] == '-'){
            flag = -1;
            ch[0] = '0';
        }else if (ch[0]=='+'){
            flag = 1;
            ch[0] = '0';
        }
        int len = str.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
if (ch[i]<'0'||ch[i]>'9'){
    sum = 0;
    break;
}
sum = sum*10+ch[i]-'0';
        }
        return   flag*sum;
    }

//合法括号序列判断
    public boolean chkParenthesis(String A, int n) {
        // write code here
       Stack<Character> stack = new Stack<>();
        char[] array = A.toCharArray();
        if (array.length / 2 != 0) {
            return false;
        }
        for (char ch:array){
            if (ch=='('){
                stack.push(ch);
            }else  if (ch==')'){
                if (stack.isEmpty()){
                    return false;
                }else if (stack.peek()=='('){
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    //另类加法
    public  int addAB(int A,int B){
        int sum = 0;
        int n = 0;
        sum = A^B;
        n = (A&B)<<1;
        A = sum;
        B = n;
        return sum;
    }

    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n==1&&m==1){
            return;
        }
        int [][] array = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j]==array[n][m]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }*/
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if (a>b){
                a = a/2;
            }else{
                b = b/2;
            }
        }
        return a;
    }
    //二进制插入
    public int binInsert(int n, int m, int j, int i) {
        // write code here
            m = m<<1;
            return n|m;
        }
//查找组成一个偶数最接近的两个素数
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
   int i = 0;
   int j = 0;
    for (; i < n; i++) {
        for (; j <n ; j++) {
            if (ret(i)&&ret(j)){
              if (i+j==n){
                  System.out.print(i);
                  System.out.print(j);
              }
            }
        }
    }

}
//判断素数
public static boolean ret(int a){
        if (a<2){
            return false;
        }
        if (a ==2){
            return true;
        }
    for (int i = 3; i <=a ; i+=2) {
        if (a%i==0){
           return false;
        }
    }
    return true;
}
    }


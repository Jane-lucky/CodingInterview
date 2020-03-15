package InterView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberSort {

    public static void main(String[] args) throws NumberFormatException, IOException {
      /*  // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        FindMinpart(arr,n);
    }

    private static void FindMinpart(int[] arr, int n) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<>();
        ArrayList<String> list =new ArrayList<>();
        for(int i=0;i<n;i++) {
            set.add(arr[i]);
        }
        if(set.size()==1) {
            for(int i=1;i<=n;i++) {
                list.add("["+i+","+i+"]");
            }
            System.out.println(1+" "+n);
            for(String str : list) {
                System.out.print(str+" ");
            }
            return;
        }
        int start = 0;
        int end = 0;
        int minsize = n;
        while(start<=end&&end<n) {
            if(set.size()==map.size()) {
                if(end-start<minsize) {
                    list = new ArrayList<>();
                    minsize = end-start;
                    list.add("["+(start+1)+","+end+"]");

                }
                else if(end-start==minsize) {
                    list.add("["+(start+1)+","+end+"]");
                }
                map.put(arr[start], map.get(arr[start])-1);
                if(map.get(arr[start])==0) {
                    map.remove(arr[start]);
                }
                start++;
            }
            else {
                if(map.containsKey(arr[end])) {
                    map.put(arr[end], map.get(arr[end])+1);
                }
                else {
                    map.put(arr[end], 1);
                }
                end++;
            }
        }
        if(minsize==n) {
            list.add("["+1+","+n+"]");
            System.out.println(minsize+" "+1);
            System.out.print(list.get(0));
            return;
        }
        System.out.println(minsize+" "+list.size());
        for(String str : list) {
            System.out.print(str+" ");
        }
    }*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        //添加数组
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            set.add(arr[i]);//使得不会出现重复
        }
        int num = set.size();//没有重复的数字
        int min = n;
        int i = 0, j = 0;
        HashMap<Integer, Integer> temp = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        while (i <= j && j <= n) {
            if (temp.size() == num) {
                if (j - i < min) {
                    min = j - i;
                    res = new ArrayList<>();
                    res.add("[" + (i + 1) + "," + j + "]");
                } else if (j - i == min)
                    res.add("[" + (i + 1) + "," + j + "]");
                if (temp.get(arr[i]) == 1) {
                    temp.remove(arr[i]);
                } else {
                    temp.put(arr[i], temp.get(arr[i]) - 1);
                }
                i++;
            } else {
                if (j < n) {
                    temp.put(arr[j], temp.getOrDefault(arr[j], 0) + 1);
                }
                j++;
            }
        }
        if (min == n) {
            System.out.println(min + " " + 1);
            System.out.println("[1," + n + "]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : res) {
            sb.append(s + " ");
        }
        sb.substring(0, sb.length() - 1);
        System.out.println(min + " " + res.size());
        System.out.println(sb.toString());
    }
}

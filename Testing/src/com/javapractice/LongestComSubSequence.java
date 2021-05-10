package com.javapractice;

public class LongestComSubSequence {

	public static void main(String[] args) {
		
		//ABCDE
		//BGDTE
		//Longest common subsequence is BDE
		//using dynamic programming
		String s1="DDABCSS";
		String s2="ABCHS";
		
		System.out.println("LCS is " + LCS(s1,s2));
		
		//Longest Common Substring
		//GABCFE
		//ABCHG
		//Out put is ABC
		String s3="DDABCSS";
		String s4="ABCHS";
		
		System.out.println("LCSubstring is " + LCSubString(s3,s4));

	}
	
	private static int LCSubString(String S1, String S2) {
		
		char[] s1Arr=S1.toCharArray();
		char[] s2Arr=S2.toCharArray();
		int m=s1Arr.length;
		int n=s2Arr.length;
		int[][] memo=new int[m+1][n+1];
		int result=0;
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j <=n; j++) {
				if(i==0 || j==0) {
					memo[i][j]=0;
				}else if(s1Arr[i-1]==s2Arr[j-1]) {
					memo[i][j]=1+memo[i-1][j-1];
					result=Math.max(result, memo[i][j]);
				}else {
					memo[i][j]=0;
					
				}
			}
			
		}
		return result;
	}

	public static int LCS(String S1,String S2) {
		
		char[] s1Arr=S1.toCharArray();
		char[] s2Arr=S2.toCharArray();
		int m=s1Arr.length;
		int n=s2Arr.length;
		int[][] memo=new int[m+1][n+1];
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j <=n; j++) {
				if(i==0 || j==0) {
					memo[i][j]=0;
				}else if(s1Arr[i-1]==s2Arr[j-1]) {
					memo[i][j]=1+memo[i-1][j-1];
					//System.out.println(memo[i][j]);
				}else {
					memo[i][j]=max(memo[i-1][j],memo[i][j-1]);
					
				}
			}
			
		}
		return memo[m][n];
	}
	
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	

}

package com.maven.test;

public class JunitTesting {
        public int square(int x)
        {
        	return x*x;
        }
        public int countA(String word)
        {
        	int count=0;
        	for(int i=0;i<word.length();i++){
        		count++;
        	}
        	return count;
        }
}

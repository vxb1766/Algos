package com.uta.stacks;

import java.util.Scanner;

public class TowersOfHanoi {

	   public void solve(int n, String source, String destination, String buffer) {
	       if (n == 1) {
	           System.out.println(n+":"+source + " -> " + destination);
	       } else {
	           solve(n - 1, source, buffer, destination);
	           System.out.println(n+":"+source + " -> " + destination);
	           solve(n - 1, buffer, destination, source);
	       }
	   }

	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       towersOfHanoi.solve(4, "Source", "Destination", "Buffer");
	   }
	}

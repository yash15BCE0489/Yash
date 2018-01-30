package com.internshala.javaapp;
import java.util.*;
public class PageRank {

	public static void calc(double totalNodes, int[][] path, double[] pagerank, int it){
		double InitialPageRank;
		double OutgoingLinks=0;
		double DampingFactor = 0.85;
		double TempPageRank[] = new double[pagerank.length];
		int i;
		int j;
		int k=1; // For Traversing
		int ITERATION_STEP=1;
		InitialPageRank = 1/totalNodes;
		System.out.printf(" Total Number of Nodes :"+totalNodes+"\t Initial PageRank  of All Nodes :"+InitialPageRank+"\n");

		// 0th ITERATION  _ OR _ INITIALIZATION PHASE
		for(k=1;k<=totalNodes;k++)
		{
			pagerank[k]=InitialPageRank;
		}
		System.out.printf("\n Initial PageRank Values , 0th Step \n");
		for(k=1;k<=totalNodes;k++)
		{
			System.out.printf(" Page Rank of "+k+" is :\t"+pagerank[k]+"\n");
		}
		while(ITERATION_STEP<it) // Iterations
		{
			// Store the PageRank for All Nodes in Temporary Array
			for(k=1;k<=totalNodes;k++)
			{
				TempPageRank[k]=pagerank[k]; //  saving previous page rank
				pagerank[k]=0;                  // initializing 0 again
			}

			for(j=1;j<=totalNodes;j++)
			{
				for(i=1;i<=totalNodes;i++)
				{
					if(path[i][j] == 1)
					{
						k=1;
						OutgoingLinks=0;  // Count the Number of Outgoing Links for each i = External node

						while(k<=totalNodes)
						{
							if(path[i][k] == 1 )
							{
								OutgoingLinks=OutgoingLinks+1; // Counter for Outgoing Links
							}
							k=k+1;
						}

						// Calculate PageRank PR(A) = PR(W1)/C(W1) + ... + PR(Wn)/C(Wn)
						pagerank[j]+=TempPageRank[i]*(1/OutgoingLinks);
					}
				}
			}


			System.out.printf("\n After "+ITERATION_STEP+"th Step \n");

			for(k=1;k<=totalNodes;k++)
				System.out.printf(" Page Rank of "+k+" is :\t"+pagerank[k]+"\n");

			ITERATION_STEP = ITERATION_STEP+1;
		}
		// Add the Damping Factor to PageRank
		for(k=1;k<=totalNodes;k++)
		{
			pagerank[k]=(1-DampingFactor)+ DampingFactor*pagerank[k];
		}
		// Display PageRank
		System.out.printf("\n Final Page Rank : \n");
		for(k=1;k<=totalNodes;k++)
		{
			System.out.printf(" Page Rank of "+k+" is :\t"+pagerank[k]+"\n");
		}
	}
	public static void main(String args[])
	{
		int nodes,i,j,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of WebPages ");
		nodes = in.nextInt();
		int n = nodes+1;
		int path[][] = new int[n][n];
		double pagerank[] = new double[n];
		System.out.println("Enter No. of Iterations");
		c = in.nextInt();
		System.out.println("Enter the Adjacency Matrix with 1->PATH & 0->NO PATH Between two WebPages: ");
		for(i=1;i<=nodes;i++)
			for(j=1;j<=nodes;j++)
			{
				path[i][j]=in.nextInt();
				if(j==i)
					path[i][j]=0;
			}
		calc(nodes,path,pagerank,c);
	}
}
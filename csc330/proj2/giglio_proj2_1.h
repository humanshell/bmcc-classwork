#ifndef GIGLIO_PROJ2_1_H
#define GIGLIO_PROJ2_1_H

#include <stdlib.h>
#include <stdio.h>

typedef struct node_s {
  int data;
  struct node_s *next;
  struct node_s *prev;
} node;

void printWelcome();
void printList(node*);
void deleteOne(int, node*);
//void deleteAll(int, node*);
//void sortAscending(node*);
//void sortDescending(node*);
//void makeEmpty(node*);

int printMenu();
int lengthOf(node*);
int isEmpty(node*);
int insertOne(int, node*);
//int insertAll(int[], node*);
//int find(int, node*);

#endif


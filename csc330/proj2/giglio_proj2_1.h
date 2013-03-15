#ifndef GIGLIO_PROJ2_1_H
#define GIGLIO_PROJ2_1_H

#include <stdlib.h>
#include <stdio.h>

typedef int elem;
typedef struct node_s {
  int data;
  struct node_s *next;
  struct node_s *prev;
} node;

int length(node*);

void printWelcome();
//void deleteOne(elem, node*);
//void deleteAll(elem, node*);
void insertOne(elem, node*);
//void insertAll(elem[], node*);
//void sortAscending(node*);
//void sortDescending(node*);
//void makeEmpty(node*);

// success == 1, failure == 0
//int isFull(node*);
int isEmpty(node*);
//int find(elem, node*);
int printMenu();

#endif


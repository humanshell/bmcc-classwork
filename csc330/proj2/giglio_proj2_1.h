#ifndef GIGLIO_PROJ2_1_H
#define GIGLIO_PROJ2_1_H

typedef int elem;

typedef struct node_s {
  elem data;
  struct node_s *next;
  struct node_s *prev;
} node;

elem length(node*);

void printWelcome();
void printMenu();
void deleteOne(elem, node*);
void deleteAll(elem, node*);
void insert(elem, node*);
void sortAscending(node*);
void sortDescending(node*);
void makeEmpty(node*);

// success == 1, failure == 0
int isFull(node*);
int isEmpty(node*);
int find(elem, node*);

#endif

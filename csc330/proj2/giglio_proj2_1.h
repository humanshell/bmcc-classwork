#ifndef GIGLIO_PROJ2_1_H
#define GIGLIO_PROJ2_1_H

typedef int elem;

typedef struct {
  elem data;
  node *next;
  node *prev;
} node;

elem length(node*);

void deleteOne(elem);
void deleteAll(elem);
void insert(elem);
void sortAscending(node*);
void sortDescending(node*);
void makeEmpty(node*);

bool isFull(node*);
bool isEmpty(node*);
bool find(elem);

#endif

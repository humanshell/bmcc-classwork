#ifndef GIGLIO_PROJ2_1_H
#define GIGLIO_PROJ2_1_H
struct node {
  int data;
  node *next;
  node *prev;
};

int length(node*);

void deleteOne(int);
void deleteAll(int);
void insert(int);
void sort(node*);
void makeEmpty(node*);

bool isFull(node*);
bool isEmpty(node*);
bool find(int);

#endif

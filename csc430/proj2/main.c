#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// XOR swap trick as a macro
#define swap(a, b) ((a)^=(b),(b)^=(a),(a)^=(b))

// used by heap_sort()
typedef int (*compare_func)(int, int);

// test arrays for predefined random number data
int random_100[100] = { 0 };
int almost_sorted_100[100] = { 0 };
int almost_reversed_100[100] = { 0 };
int sorted_100[100] = { 0 };

int random_5000[5000] = { 0 };
int almost_sorted_5000[5000] = { 0 };
int almost_reversed_5000[5000] = { 0 };
int sorted_5000[5000] = { 0 };

int random_100000[100000] = { 0 };
int almost_sorted_100000[100000] = { 0 };
int almost_reversed_100000[100000] = { 0 };
int sorted_100000[100000] = { 0 };

// variables to store elapsed time during sorting routines
double micros = 0.0;
float millis = 0.0;
clock_t start, end;


// seed test arrays with real numbers
void generate_arrays() {
  int i = 0;

  for (i = 0; i < 100; i++)
    random_100[i] = almost_sorted_100[i] = almost_reversed_100[i] = sorted_100[i] = i + 1;

  for (i = 0; i < 5000; i++)
    random_5000[i] = almost_sorted_5000[i] = almost_reversed_5000[i] = sorted_5000[i] = i + 1;

  for (i = 0; i < 100000; i++)
    random_100000[i] = almost_sorted_100000[i] = almost_reversed_100000[i] = sorted_100000[i] = i + 1;
}


// shuffle the arrays to conform to the project worksheet specifications
void shuffle_arrays() {
  int i = 0, r = 0;
  srand(time(NULL));

  for (i = 99; i > 0; i--) {
    r = rand() % i;
    swap(random_100[r], random_100[i]);
    if (i <= 10) swap(almost_sorted_100[r], almost_sorted_100[i]);
    if (i >= 90) swap(almost_reversed_100[r], almost_reversed_100[i]);
  }

  for (i = 4999; i > 0; i--) {
    r = rand() % i;
    swap(random_5000[r], random_5000[i]);
    if (i <= 500) swap(almost_sorted_5000[r], almost_sorted_5000[i]);
    if (i >= 4500) swap(almost_reversed_5000[r], almost_reversed_5000[i]);
  }

  for (i = 99999; i > 0; i--) {
    r = rand() % i;
    swap(random_100000[r], random_100000[i]);
    if (i <= 10000) swap(almost_sorted_100000[r], almost_sorted_100000[i]);
    if (i >= 90000) swap(almost_reversed_100000[r], almost_reversed_100000[i]);
  }
}


// insertion sort function
void insertion_sort(int array[], int size) {
  for (int i = 0; i < size - 1; i++)
    for (int j = i + 1; j < size; j++)
      if (array[j] < array[i]) swap(array[j], array[i]);
}


// insertion sort execution function
void insertion_sort_arrays() {
  start = clock();
  insertion_sort(random_100, 100);
  end = clock();
  printf("Insertion sort random 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_sorted_100, 100);
  end = clock();
  printf("Insertion sort almost sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_reversed_100, 100);
  end = clock();
  printf("Insertion sort almost reversed 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(sorted_100, 100);
  end = clock();
  printf("Insertion sort sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  insertion_sort(random_5000, 5000);
  end = clock();
  printf("Insertion sort random 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_sorted_5000, 5000);
  end = clock();
  printf("Insertion sort almost sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_reversed_5000, 5000);
  end = clock();
  printf("Insertion sort almost reversed 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(sorted_5000, 5000);
  end = clock();
  printf("Insertion sort sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  insertion_sort(random_100000, 100000);
  end = clock();
  printf("Insertion sort random 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_sorted_100000, 100000);
  end = clock();
  printf("Insertion sort almost sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(almost_reversed_100000, 100000);
  end = clock();
  printf("Insertion sort almost reversed 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  insertion_sort(sorted_100000, 100000);
  end = clock();
  printf("Insertion sort sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
}


// selection sort function
void selection_sort(int array[], int size) {
  int i = 0, j = 0, pos = 0;

  for (i = 0; i < size - 1; i++) {
    pos = i;

    for (j = i + 1; j < size; j++)
      if (array[pos] > array[j]) pos = j;

    if (pos != i) swap(array[i], array[pos]);
  }
}


// selection sort execution function
void selection_sort_arrays() {
  start = clock();
  selection_sort(random_100, 100);
  end = clock();
  printf("Selection sort random 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_sorted_100, 100);
  end = clock();
  printf("Selection sort almost sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_reversed_100, 100);
  end = clock();
  printf("Selection sort almost reversed 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(sorted_100, 100);
  end = clock();
  printf("Selection sort sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  selection_sort(random_5000, 5000);
  end = clock();
  printf("Selection sort random 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_sorted_5000, 5000);
  end = clock();
  printf("Selection sort almost sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_reversed_5000, 5000);
  end = clock();
  printf("Selection sort almost reversed 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(sorted_5000, 5000);
  end = clock();
  printf("Selection sort sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  selection_sort(random_100000, 100000);
  end = clock();
  printf("Selection sort random 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_sorted_100000, 100000);
  end = clock();
  printf("Selection sort almost sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(almost_reversed_100000, 100000);
  end = clock();
  printf("Selection sort almost reversed 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  selection_sort(sorted_100000, 100000);
  end = clock();
  printf("Selection sort sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
}


// quicksort sort function
void quick_sort(int array[], int low, int high) {
  if (low > high) return;

  int i, p, q, t;

  p = low + 1;
  q = high;
  i = array[low];

  while (q >= p) {
    while (array[p] < i) p++;
    while (array[q] > i) q--;
    if (q > p) swap(array[p], array[q]);
  }

  t = array[low];
  array[low] = array[q];
  array[q] = t;
  quick_sort(array, low, q - 1);
  quick_sort(array, q + 1, high);
}


// quicksort sort execution function
void quick_sort_arrays() {
  start = clock();
  quick_sort(random_100, 0, 99);
  end = clock();
  printf("Quicksort random 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_sorted_100, 0, 99);
  end = clock();
  printf("Quicksort almost sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_reversed_100, 0, 99);
  end = clock();
  printf("Quicksort almost reversed 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(sorted_100, 0, 99);
  end = clock();
  printf("Quicksort sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  quick_sort(random_5000, 0, 4999);
  end = clock();
  printf("Quicksort random 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_sorted_5000, 0, 4999);
  end = clock();
  printf("Quicksort almost sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_reversed_5000, 0, 4999);
  end = clock();
  printf("Quicksort almost reversed 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(sorted_5000, 0, 4999);
  end = clock();
  printf("Quicksort sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  quick_sort(random_100000, 0, 99999);
  end = clock();
  printf("Quicksort random 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_sorted_100000, 0, 99999);
  end = clock();
  printf("Quicksort almost sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(almost_reversed_100000, 0, 99999);
  end = clock();
  printf("Quicksort almost reversed 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  quick_sort(sorted_100000, 0, 99999);
  end = clock();
  printf("Quicksort sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
}


// merge sort sort function
void merge_sort(int array[], int temp[], int left, int right) {
  int i, mid, left_end, count, tmp_pos;

  if (right > left) {
    mid = (right + left) / 2;
    merge_sort(array, temp, left, mid);
    merge_sort(array, temp, mid + 1, right);

    mid++;
    left_end = mid - 1;
    tmp_pos = left;
    count = right - left + 1;

    while ((left <= left_end) && (mid <= right)) {
      if (array[left] <= array[mid]) {
        temp[tmp_pos] = array[left];
        tmp_pos = tmp_pos + 1;
        left = left + 1;
      } else {
        temp[tmp_pos] = array[mid];
        tmp_pos = tmp_pos + 1;
        mid = mid + 1;
      }
    }

    while (left <= left_end) {
      temp[tmp_pos] = array[left];
      left = left + 1;
      tmp_pos = tmp_pos + 1;
    }

    while (mid <= right) {
      temp[tmp_pos] = array[mid];
      mid = mid + 1;
      tmp_pos = tmp_pos + 1;
    }

    for (i = 0; i <= count; i++) {
      array[right] = temp[right];
      right = right - 1;
    }
  }
}


// merge sort sort execution function
void merge_sort_arrays() {
  int temp_100[100];
  start = clock();
  merge_sort(random_100, temp_100, 0, 99);
  end = clock();
  printf("Merge sort random 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_sorted_100, temp_100, 0, 99);
  end = clock();
  printf("Merge sort almost sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_reversed_100, temp_100, 0, 99);
  end = clock();
  printf("Merge sort almost reversed 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(sorted_100, temp_100, 0, 99);
  end = clock();
  printf("Merge sort sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  int temp_5000[5000] = { 0 };
  start = clock();
  merge_sort(random_5000, temp_5000, 0, 4999);
  end = clock();
  printf("Merge sort random 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_sorted_5000, temp_5000, 0, 4999);
  end = clock();
  printf("Merge sort almost sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_reversed_5000, temp_5000, 0, 4999);
  end = clock();
  printf("Merge sort almost reversed 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(sorted_5000, temp_5000, 0, 4999);
  end = clock();
  printf("Merge sort sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  int temp_100000[100000] = { 0 };
  start = clock();
  merge_sort(random_100000, temp_100000, 0, 99999);
  end = clock();
  printf("Merge sort random 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_sorted_100000, temp_100000, 0, 99999);
  end = clock();
  printf("Merge sort almost sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(almost_reversed_100000, temp_100000, 0, 99999);
  end = clock();
  printf("Merge sort almost reversed 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  merge_sort(sorted_100000, temp_100000, 0, 99999);
  end = clock();
  printf("Merge sort sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
}


// used by heap sort for sorting analysis
int compare(int a, int b) {
  if (a > b)
    return 1;
  else if (a < b)
    return -1;
  else
    return 0;
}


// heap sort sort function
void heap_sort(int array[], compare_func func_pointer, int size) {
  if (size <= 1) return;
  int parents, half = size >> 1;

  for (parents = half; parents >= 1; --parents) {
    int tmp, child = parents, level = 0;

    while (child <= half) {
      ++level;
      child += child;
      if ((child < size) && ((*func_pointer)(array[child], array[child - 1]) > 0)) ++child;
    }

    tmp = array[parents - 1];
    for (;;) {
      if (parents == child) break;
      if ((*func_pointer)(tmp, array[child - 1]) <= 0) break;
      child >>= 1;
      --level;
    }

    for (; level > 0; --level) {
      array[(child >> level) - 1] = array[(child >> (level - 1)) - 1];
    }

    array[child - 1] = tmp;
  }

  --size;

  do {
    int tmp, level = 0, child;

    tmp = array[size];
    array[size] = array[0];
    array[0] = tmp;

    child = parents = 1;
    half = size >> 1;

    while (child <= half) {
      ++level;
      child += child;
      if ((child < size) && ((*func_pointer)(array[child], array[child - 1]) > 0)) ++child;
    }

    for (;;) {
      if (parents == child) break;
      if ((*func_pointer)(tmp, array[child - 1]) <= 0) break;
      child >>= 1;
      --level;
    }

    for (; level > 0; --level) {
      array[(child >> level) - 1] = array[(child >> (level - 1)) - 1];
    }

    array[child - 1] = tmp;
  }

  while (--size >= 1);
}


// heap sort sort execution function
void heap_sort_arrays() {
  start = clock();
  heap_sort(random_100, compare, 100);
  end = clock();
  printf("Heap sort random 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_sorted_100, compare, 100);
  end = clock();
  printf("Heap sort almost sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_reversed_100, compare, 100);
  end = clock();
  printf("Heap sort almost reversed 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(sorted_100, compare, 100);
  end = clock();
  printf("Heap sort sorted 100 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  heap_sort(random_5000, compare, 5000);
  end = clock();
  printf("Heap sort random 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_sorted_5000, compare, 5000);
  end = clock();
  printf("Heap sort almost sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_reversed_5000, compare, 5000);
  end = clock();
  printf("Heap sort almost reversed 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(sorted_5000, compare, 5000);
  end = clock();
  printf("Heap sort sorted 5000 elapsed time: %lu milliseconds\n", (end - start) / 1000);

  start = clock();
  heap_sort(random_100000, compare, 100000);
  end = clock();
  printf("Heap sort random 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_sorted_100000, compare, 100000);
  end = clock();
  printf("Heap sort almost sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(almost_reversed_100000, compare, 100000);
  end = clock();
  printf("Heap sort almost reversed 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
  start = clock();
  heap_sort(sorted_100000, compare, 100000);
  end = clock();
  printf("Heap sort sorted 100000 elapsed time: %lu milliseconds\n", (end - start) / 1000);
}


// main program
int main(int argc, const char *argv[]) {
  printf("\nGenerating arrays...\n");
  generate_arrays();
  printf("Shuffling arrays...\n");
  shuffle_arrays();
  printf("Heap sorting arrays...\n");
  heap_sort_arrays();

  printf("\nGenerating arrays...\n");
  generate_arrays();
  printf("Shuffling arrays...\n");
  shuffle_arrays();
  printf("Insertion sorting arrays...\n");
  insertion_sort_arrays();

  printf("\nGenerating arrays...\n");
  generate_arrays();
  printf("Shuffling arrays...\n");
  shuffle_arrays();
  printf("Selection sorting arrays...\n");
  selection_sort_arrays();

  printf("\nGenerating arrays...\n");
  generate_arrays();
  printf("Shuffling arrays...\n");
  shuffle_arrays();
  printf("Quick sorting arrays...\n");
  quick_sort_arrays();

  printf("\nGenerating arrays...\n");
  generate_arrays();
  printf("Shuffling arrays...\n");
  shuffle_arrays();
  printf("Merge sorting arrays...\n");
  merge_sort_arrays();

  printf("\nDone.\n");
  return 0;
}


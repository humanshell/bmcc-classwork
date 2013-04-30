CC = gcc
DEPS = stack.h list.h
CFLAGS = -O3 -std=c99 -Wall

%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

giglio_proj3: giglio_proj3.o stack.o list.o
		gcc -o $@ $^ $(CFLAGS)

stack_test: stack_test.o stack.o
		gcc -o list_test $^ $(CFLAGS)
		@./stack_test

list_test: list_test.o list.o
		gcc -o list_test $^ $(CFLAGS)
		@./list_test

clean:
		rm -f *.o giglio_proj3

.PHONY: clean test


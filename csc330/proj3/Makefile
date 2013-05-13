CC = gcc
DEPS = stack.h
CFLAGS = -O3 -std=c99 -Wall

%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

giglio_proj3: giglio_proj3.o stack.o
		gcc -o $@ $^ $(CFLAGS)

test: stack_test.o stack.o
		gcc -o list_test $^ $(CFLAGS)
		@./stack_test

clean:
		rm -f *.o giglio_proj3 stack_test

.PHONY: clean test


CC = gcc
DEPS = gstack.h
CFLAGS = -O3 -std=c99 -Wall

%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

giglio_proj3: giglio_proj3.o gstack.o
		gcc -o $@ $^ $(CFLAGS)

test: test.o gstack.o
		gcc -o gstack_test $^ $(CFLAGS)
		@./gstack_test

clean:
		rm -f *.o giglio_proj3 gstack_test

.PHONY: clean test


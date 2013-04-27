CC = clang
DEPS = inc/giglio_proj2_1.h
CFLAGS = -lncurses -O3 -std=c99 -Wall -Iinc

%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

giglio_proj2_1: giglio_proj2_1_test.o giglio_proj2_1.o
		gcc -o $@ $^ $(CFLAGS)

test: test.o giglio_proj2_1.o
		gcc -o list_test $^ $(CFLAGS)
		@./list_test

clean:
		rm -f *.o giglio_proj2_1 list_test

.PHONY: clean test


CC = gcc
DEPS = list.h
CFLAGS = -lncurses -O3 -std=c99 -Wall

%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

list_main: main.o list.o
		gcc -o $@ $^ $(CFLAGS)

test: test.o list.o
		gcc -o list_test $^ $(CFLAGS)
		@./list_test

clean:
		rm -f *.o list_main list_test

.PHONY: clean test


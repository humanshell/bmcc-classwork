IDIR=inc
CC=gcc
CFLAGS=-I$(IDIR)

ODIR=obj
LDIR=lib

_DEPS = giglio_proj2_1.h
DEPS = $(patsubst %,$(IDIR)/%,$(_DEPS))

_OBJ = giglio_proj2_1_test.o giglio_proj2_1.o 
OBJ = $(patsubst %,$(ODIR)/%,$(_OBJ))

$(ODIR)/%.o: %.c $(DEPS)
		$(CC) -c -o $@ $< $(CFLAGS)

giglio_proj2_1: $(OBJ)
		gcc -o $@ $^ $(CFLAGS)

.PHONY: clean

clean:
		rm -f $(ODIR)/*.o *~ core $(INCDIR)/*~ 

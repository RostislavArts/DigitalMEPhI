SRC_PATH = src/*.java

LIB_PATH = lib/*.jar

OUT_PATH = out

JAVA = javac

JAVA_RUN = java

all :
	$(JAVA) -cp $(LIB_PATH) -d $(OUT_PATH) $(SRC_PATH)

clean : $(OUT_PATH)
	rm -rf $(OUT_PATH)/*.class

run : all
	$(JAVA_RUN) -cp $(OUT_PATH) Main

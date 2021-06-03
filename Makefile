timestamp := $(shell /bin/date "+%F %T")

clean:
	@mvn -f $(CURDIR)/pom.xml clean -q

version:
	@mvn -f $(CURDIR)/pom.xml versions:set
	@mvn -f $(CURDIR)/pom.xml -N versions:update-child-modules
	@mvn -f $(CURDIR)/pom.xml versions:commit

github: clean
	@git add .
	@git commit -m "$(timestamp)"

.PHONY: clean version github
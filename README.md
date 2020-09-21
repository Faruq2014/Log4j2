#    Log4j2 Rules:


	

# What is log4j: To track the application and maintain the flow of overall process we create log4j.
The latest one is log4j2. The old log4j will not work anymore. 
a.	Highly configurable, written in java, platform independence.
b.	Flexible, can set different type of levels

#What are the dependencies do we need?
#Two dependencies we will need:
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.6.1</version>
  </dependency>
#
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.6.1</version>
  </dependency>

# What is log4j properties file?
a.	Log4j properties file is key and value pair.
b.	It must be in the class path that means it has to be in the main/resources or test/resources folder.
c.	The name must be start with log4j
d.	It must be .properties extension. That means log4j.properies
# What are the levels in log4j?
a.	Trace
b.	debug
c.	info
d.	warn
e.	error
f.	fatal
    
# What are the main components in log4j?
a.	Loggers  to register the class to the Loggers
b.	AppendersTo append the logging information to the respective destination.
c.	LayoutsStyling the logging information.
What are the main features in log4j?
a.	Thread safe
b.	High speed optimization due to tracing capability.
c.	Multiple appenders support such as console and file.
d.	Customized configuring.
e.	.Xml, .properties 

#     name=PropertiesConfig
	property.filename = logs   // the folder name, if it is in the project level then just folder name is enough.
           property.filename = C:\\logs\\debug.log   // if it is in the not project level then write the path.
	appenders = console, file  // where do you want to print your log? Console or file or both
	
# console styling
	appender.console.type = Console
	appender.console.name = STDOUT
	appender.console.layout.type = PatternLayout
	#appender.console.lay
	appender.console.layout.pattern = [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1}  %msg%n  // date style
	
	# file styling
	appender.file.type = File
	appender.file.name = LOGFILE
	appender.file.fileName=${filename}/propertieslogs.log  //{ propertieslogs.log = file name of the log inside the folder if it is in the project level}  
  #if it is outside of the project then write the path. 
	appender.file.layout.type=PatternLayout
	appender.file.layout.pattern=[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
# date style
    appender.file.append=true
# if you print true it will print again and again on the same file. If you set it false then it will print the latest one.
    
	loggers=file
	logger.file.name=com.salesforce.base
#Write the package name where all the test cases are. Only package name is enough. 
	logger.file.level = trace
#there are different level such as trace, info, debug, warn, error, fatal
# trace is the lowest level. By default upper level cover the lower.
	logger.file.appenderRefs = file
	logger.file.appenderRef.file.ref = LOGFILE
	

#	rootLogger.level = trace
# there are different level such as trace, info, debug, warn, error, fatal
# trace is the lowest level. By default upper level cover the lower.

#	rootLogger.appenderRefs = stdout
#	rootLogger.appenderRef.stdout.ref = STDOUT
	
	
	

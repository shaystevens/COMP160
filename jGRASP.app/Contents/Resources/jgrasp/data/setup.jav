SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0
SJl0
SJC0
SJp0java %S -ea %S %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0java %S -ea %S %<FLAGS2> %<CLASSIC_OPT> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack
SJV0appletviewer %S -J-ea %S %<FLAGS2> %<CLASSIC_OPT> -J-Xnoagent -J-Djava.compiler=NONE -J-Xdebug -J-Xrunjdwp:transport=%TRANSPORT,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0Java_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Works with JDK 1.3 and 1.4. JDK 1.2 with JDWP might work, but probably not very well.\012\012For JDK 1.2 and earlier, use the "jdk (jdb debugger) - generic" environment.\012\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd00
BJf00
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0jikes %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D +E +T1 %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJh0jikes %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> -nowrite +E +T1 %<FLAGS> %<REL_FILE>
SJl0%<PACKAGE_PATH>
SJC0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJp0java %S -ea %S %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0java %S -ea %S %<FLAGS2> %<CLASSIC_OPT> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack
SJV0appletviewer %S -J-ea %S %<FLAGS2> %<CLASSIC_OPT> -J-Xnoagent -J-Djava.compiler=NONE -J-Xdebug -J-Xrunjdwp:transport=%TRANSPORT,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0Java_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Works with JDK 1.3 and 1.4. JDK 1.2 with JDWP might work, but probably not very well.\012\012For JDK 1.2 and earlier, use the "jdk (jdb debugger) - generic" environment.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have jikes and the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0jgrasp_environment_invalid
SJk0%PACKAGE_PATH
SJB0GNU
SJh0jgrasp_environment_invalid
SJl0%PACKAGE_PATH%\\..
SJC0GNU
SJp0jgrasp_environment_invalid
SJr0%MAIN_PACKAGE_PATH%\\..%\\bin
SJD0J2ME_Stack
SJs0jgrasp_environment_invalid
SJu0%MAIN_PACKAGE_PATH\\..
SJE0J2ME_Stack
SJw0
SJy0
SJF0
SJV0jgrasp_environment_invalid
SJY0%MAIN_PACKAGE_PATH\\..
SJZ0J2ME_Stack
SJ10jgrasp_environment_invalid
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Requires directory structure where source is in "src" directory, temporary classes are\012in "tmpclasses" directory, and preverified classes are in "classes" directory.
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012CLASSPATH+=.%;\012Run_Applet +Debug_Applet\012CLASSPATH+=classes%;res%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Due to changes in jGRASP, you will need to create a new J2ME project.\\nWe regret the inconvenience.\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
BJi01
BJi01
1
BJf01
OL_CLASSPATHS>\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012CLASSPATH+=.%;\012Run_Applet +Debug_Applet\012CLASSPATH+=classes%;res%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Due to changes in jGRASP, you will need to create a new J2ME project.\\nWe regret the inconvenience.\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
01
\\tmpclasses
BJd01
BJf01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0jgrasp_environment_invalid
SJk0%PACKAGE_PATH
SJB0GNU
SJh0jgrasp_environment_invalid
SJl0%PACKAGE_PATH%\\..
SJC0GNU
SJp0jgrasp_environment_invalid
SJr0%MAIN_PACKAGE_PATH%\\..%\\bin
SJD0J2ME_Stack
SJs0jgrasp_environment_invalid
SJu0%MAIN_PACKAGE_PATH\\..
SJE0J2ME_Stack
SJw0
SJy0
SJF0
SJV0jgrasp_environment_invalid
SJY0%MAIN_PACKAGE_PATH\\..
SJZ0J2ME_Stack
SJ10jgrasp_environment_invalid
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Requires directory structure where source is in "src" directory, temporary classes are\012in "tmpclasses" directory, and preverified classes are in "classes" directory.
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012CLASSPATH+=.%;\012Run_Applet +Debug_Applet\012CLASSPATH+=classes%;res%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Due to changes in jGRASP, you will need to create a new J2ME project.\\nWe regret the inconvenience.\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
BJi01
BJi01
1
BJf01
OL_CLASSPATHS>\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012CLASSPATH+=.%;\012Run_Applet +Debug_Applet\012CLASSPATH+=classes%;res%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from java.sun.com.\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
\\tmpclasses
BJd01
BJf01
BJd01
BJf01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0
SJl0
SJC0
SJp0java %S -ea %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0java %S -ea %S %<JFLAGS> %<FLAGS2> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack
SJV0appletviewer %S -J-ea %S %<FLAGS2> -J-Xnoagent -J-Djava.compiler=NONE -J-Xdebug -J-Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0Java_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %D -g %D %<FLAGS> %<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0f1-(\\S(?:\\s*\\S)*):(\\d+):.*
SJh0
SJl0
SJC0
SJp0java %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0cu1-\\s*at (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJs0appletviewer %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0cu1-\\s*at (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJw0java %<FLAGS2> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0cu1-\\s*(?:at|\\[\\d+\\]) (\\S+)\\.[^.]+\\(([^:]+):(\\d+)SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0
SJl0
SJC0
SJp0java %S -ea %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0jdb %S -connect "com.sun.jdi.CommandLineLaunch:options=-ea" %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack_or_jdb
SJV0
SJY0
SJZ0
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
\\]) (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJV0
SJY0
SJZ0
SJ10javadoc %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %K@%K%<REL_FILE>
SJ40%<PACKAGE_PATH>
SJ50f1-(\\S(?:\\s*\\S)*):(\\d+):.*
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012CLASSPATH+=.%;\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from java.sun.com.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012
SJ60
SJ70
SJ80
BJd01
BJf01
                                                                                     SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0jikes %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D +E +T1 %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJh0jikes %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> -nowrite +E +T1 %<JFLAGS> %<FLAGS> %<REL_FILE>
SJl0%<PACKAGE_PATH>
SJC0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJp0java %S -ea %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0java %S -ea %S %<JFLAGS> %<FLAGS2> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack
SJV0appletviewer %S -J-ea %S %<FLAGS2> -J-Xnoagent -J-Djava.compiler=NONE -J-Xdebug -J-Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0Java_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have jikes and the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
unjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0cu1-\\s*(?:at|\\[\\d+\\]) (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJ10javadoc %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %K@%K%<REL_FILE>
SJ40%<PACKAGE_PATH>
SJ50f1-(\\S(?:\\s*\\S)*):(\\d+):.*
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012CLASSPATH+=.%;\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from java.sun.com.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012
SJ60
SJ70
SJ80
BJd01
BJf01
                                                                                                                                                        SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0jikes %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D +E +T1 %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJh0jikes %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> -nowrite +E +T1 %<JFLAGS> %<FLAGS> %<REL_FILE>
SJl0%<PACKAGE_PATH>
SJC0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJp0java %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0jdb %S -connect "com.sun.jdi.CommandLineLaunch:options=-ea" %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack_or_jdb
SJV0
SJY0
SJZ0
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have jikes and the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %D -g %D %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0
SJl0
SJC0
SJp0java %S -ea %S %<JFLAGS> %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0Java_Stack
SJs0appletviewer %S -J-ea %S %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0Java_Stack
SJw0java %S -ea %S %<JFLAGS> %<FLAGS2> -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0Java_Stack
SJV0appletviewer %S -J-ea %S %<FLAGS2> -J-Xnoagent -J-Djava.compiler=NONE -J-Xdebug -J-Xrunjdwp:transport=%<TRANSPORT>,suspend=y,server=y %<html_file>
SJY0%<MAIN_PACKAGE_CLASSPATH>
SJZ0Java_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> %<IF> %<JAVADOC_ROOT> -link %<JAVADOC_ROOT> %<ENDIF> -docencoding UTF-8 -charset UTF-8 %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<JFLAGS> %<FLAGS> %<K>@%<K>%<REL_FILE>
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Environment for compiling jGRASP viewers.\012\012If the JDK was found when starting jGRASP, the JDK "javac"\012compiler will be used as the compiler. Otherwise, the first "javac"\012on the PATH (if any) will be used.\012
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012CLASSPATH+=%<VIEWER_CLASSPATHS>%;\012File\012CLASSPATH+=.%;\012CLASSPATH+=%<SRC_CLASSPATHS>%;\012ProjectOrFile\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Debug +Debug_Applet\012CLASSPATH=+%;%<INJECTION_CLASSPATHS>\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60
SJ70
SJ80
BJd01
BJf01
BJi01
BJi01
-d %<REL_DOC_DEST> %<FLAGS> %K@%K%<REL_FILE>
SJ40%<PACKAGE_PATH>
SJ50f1-(\\S(?:\\s*\\S)*):(\\d+):.*
SJI0
SJJ0
SJS0Environment for JUnit test files.\012
SJU0CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012CLASSPATH+=.%;\012PATH+=%<JAVA_BIN_DIR>%;\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from java.sun.com.\012Run_Applet +Debug_Applet\012ADD_APPLETVIEWER_CLASSPATH==Y\012
SJ60
SJ70
SJ80
BJd01
BJf01
 +E +T1 %<FLAGS> %<REL_FILE>
SJk0%<PACKAGE_PATH>
SJB0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJh0jikes -nowrite +E +T1 %<FLAGS> %<REL_FILE>
SJl0%<PACKAGE_PATH>
SJC0f1234-(\\S(?:\\s*\\S)*):(\\d+):(\\d+):(\\d+):(\\d+):.*
SJp0java %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJr0%<MAIN_PACKAGE_CLASSPATH>
SJD0cu1-\\s*at (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJs0appletviewer %<FLAGS2> %<html_file>
SJu0%<MAIN_PACKAGE_CLASSPATH>
SJE0cu1-\\s*at (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJw0jdb %<FLAGS2> %<MAIN_CLASS> %<ARGS>
SJy0%<MAIN_PACKAGE_CLASSPATH>
SJF0cu1-\\s*(?:at|\\[\\d+\\]) (\\S+)\\.[^.]+\\(([^:]+):(\\d+)\\)
SJV0
SJY0
SJZ0
SJ10javadoc %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGSSJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> %D -g %D %<FLAGS> %<RESJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac -source 1.4 %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> -bootclasspath %<J2ME_WTK_CLASSPATH> %D -g %D %<FLAGS> %<K>@%<K>%<REL_FILE> 
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0%<J2ME_WTK_HOME>%\\bin%\\preverify -d %<REL_TMP_DIR> -classpath %<REL_CLASSES_DIR>%;%<REL_TMP_DIR>%;%<J2ME_WTK_CLASSPATH> %<FLAGS> %<REL_CLASSES_DIR>
SJl0%<PACKAGE_PATH>%\\..
SJC0GNU
SJp0%<J2ME_WTK_HOME>%\\bin%\\emulator %<FLAGS2> %<J2ME_WTK_DEVICE> -Xdescriptor:%<PROJECT_BASE>.jad
SJr0%<BIN_DIR>
SJD0J2ME_Stack
SJs0%<J2ME_WTK_HOME>%\\bin%\\emulator %<FLAGS2> %<J2ME_WTK_DEVICE> %<MAIN_CLASS> %<ARGS>
SJu0%<CLASSES_DIR>\\..
SJE0J2ME_Stack
SJw0
SJy0
SJF0
SJV0%<J2ME_WTK_HOME>%\\bin%\\emulator.exe %<FLAGS2> %<J2ME_WTK_DEVICE> -Xdebug -Xrunjdwp:transport=dt_socket,suspend=y,server=y,address=%<J2ME_DEBUG_ADDRESS> %<MAIN_CLASS> %<ARGS>
SJY0%<CLASSES_DIR>\\..
SJZ0J2ME_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> -docencoding UTF-8 -charset UTF-8 -bootclasspath %<J2ME_WTK_CLASSPATH> %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %<K>@%<K>%<REL_FILE> 
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Source, classes, temp, and bin directories in the project\012should be non-empty.
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012File\012CLASSPATH+=.%;\012ProjectOrFile\012Run_Applet +Debug_Applet\012CLASSPATH+=%<TMP_DIR>%;%<RES_DIR>%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     SJe0
SJi0
SJz0
SJf0
SJj0
SJA0
SJg0javac -source 1.4 %<IF> %<CLASSES_DIR> -d %<REL_CLASSES_DIR> %<ENDIF> -bootclasspath %<J2ME_WTK_HOME>\\lib\\midpapi.zip %D -g %D %<FLAGS> %<K>@%<K>%<REL_FILE> 
SJk0%<PACKAGE_PATH>
SJB0GNU
SJh0%<J2ME_WTK_HOME>%\\bin%\\preverify -d %<REL_TMP_DIR> -classpath %<REL_CLASSES_DIR>%;%<REL_TMP_DIR>%;%<J2ME_WTK_HOME>\\lib\\midpapi.zip %<FLAGS> %<REL_CLASSES_DIR>
SJl0%<PACKAGE_PATH>%\\..
SJC0GNU
SJp0%<J2ME_WTK_HOME>%\\bin%\\emulator %S -ea %S %<FLAGS2> %<J2ME_WTK_DEVICE> -Xdescriptor:%<PROJECT_BASE>.jad
SJr0%<BIN_DIR>
SJD0J2ME_Stack
SJs0%<J2ME_WTK_HOME>%\\bin%\\emulator %<FLAGS2> %<J2ME_WTK_DEVICE> %<MAIN_CLASS> %<ARGS>
SJu0%<CLASSES_DIR>\\..
SJE0J2ME_Stack
SJw0
SJy0
SJF0
SJV0%<J2ME_WTK_HOME>%\\bin%\\emulator.exe %<FLAGS2> %<J2ME_WTK_DEVICE> -Xdebug -Xrunjdwp:transport=dt_socket,suspend=y,server=y,address=%<J2ME_DEBUG_ADDRESS> %<MAIN_CLASS> %<ARGS>
SJY0%<CLASSES_DIR>\\..
SJZ0J2ME_Stack
SJ10javadoc %<IF> %<CHARSET> -encoding %<CHARSET> %<ENDIF> -docencoding UTF-8 -charset UTF-8 -bootclasspath %<J2ME_WTK_HOME>\\lib\\midpapi.zip %I -nonavbar -notree -noindex -nohelp -nodeprecatedlist %I -d %<REL_DOC_DEST> %<FLAGS> %<K>@%<K>%<REL_FILE> 
SJ40%<DEF_SRC_DIR>
SJ50GNU
SJI0
SJJ0
SJS0Source, classes, temp, and bin directories in the project\012should be non-empty.
SJU0JGRASP_MAIN_BOUNDS=%<CONTROL_SHELL_BOUNDS>\012CLASSPATH=+%;%<EXTENSION_CLASSPATHS>\012CLASSPATH+=%<JGRASP_CLASSPATHS>%;\012Compile\012File\012CLASSPATH+=.%;\012ProjectOrFile\012Run_Applet +Debug_Applet\012CLASSPATH+=%<TMP_DIR>%;%<RES_DIR>%;.%;\012ADD_EMULATOR_CLASSPATH==Y\012Run\012CLASSPATH+=%<PROJECT_BASE>.jar%;\012ADD_EMULATOR_CLASSPATH==Y\012All\012PATH=+%;%<JAVA_BIN_DIR>\012PATH+=%<JGRASP_PATHS>%;\012Compile\012NOT_FOUND_MESSAGE==Make sure you have the full JDK, not just the JRE, installed.\\nThe JDK is available from https://www.oracle.com/technetwork/java/index.html.\012Document\012CLASSPATH=+%;%<TOOL_CLASSPATHS>\012CLASSPATH+=%<CLASSES_DIR>%;\012
SJ60..%\\src
SJ70..%\\classes
SJ80..%\\tmpclasses
BJd01
BJf01
BJi01
BJi01
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
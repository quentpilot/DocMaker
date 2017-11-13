# @Description:         This script would to launch doc maker java program
# @Author:              Quentin Le Bian <quentpilot>
# @Email:               quentin.lebian@pilotaweb.fr
# @Project:             LiveCurrencyConverter
# @About:               You're welcome to hack and code as your are each of theses sources files <3:p|--<;
# @Filename:            make.sh
# @Date:                2017-11-04T17:10:39+01:00
# @Last modified by:    quentin
# @Last modified time:  2017-11-13T17:40:41+01:00
# @License:             MIT
# @See:                 projects.quentinlebian.fr/LiveCurrencyConverter


javac -cp '.:resources/lib/jar/json/gson-2.8.0.jar' src/core/Index.java src/core/engine/runner/*.java src/tools/ObjectFactory/sort/*.java src/builder/core/engine/sorter/*.java
java -cp '.:resources/lib/jar/json/gson-2.8.0.jar' src.core.Index

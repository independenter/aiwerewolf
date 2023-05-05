## 升级版本
```shell
# 修改版本
mvn versions:set -DnewVersion=1.0.0-SNAPSHOT
# 确认修改
mvn versions:commit
# 回退修改
mvn versions:revert
```
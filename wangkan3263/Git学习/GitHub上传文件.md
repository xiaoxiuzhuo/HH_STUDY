## GitHub上传文件步骤

1. 克隆GitHub上的仓库：git clone https://github.com/KanWang123/wangkan3262.git

2. 创建新分支：git branch FirstBranch(分支名)

3. 切换到新分支：git checkout FirstBranch

4. 创建和切换到新分支：git checkout -b FirstBranch

5. 将所有文件修改提交到本地暂存区：git add \. 

6. 代码提交： git commit -m "提交说明"

7. 上传到远程主机：git push origin FirstBranch



## 其他常用Git指令
* 创建新仓库：
```
mkdir wangkan3263
cd wangkan3263
git init
```

***

* 将单个文件修改提交到本地暂存区：git add Note.txt

***

* 删除本地分支：git branch -d FirstBranch

***

* 删除远程分支：git push origin :FirstBranch

***

* 将远程主机的分支内容拉下来与当前本地分支合并：git pull origin FirstBranch


## Git配置指令
* git config --global user.email "you@example.com"
* git config --global user.name "Your Name"
* git config --global push.default matching

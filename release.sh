#git clone -o 1_array_operation https://github.com/Kovalsky95/1_array_operation.git
#git config --global credential.helper cache
git config --global credential.helper "cache --timeout=3600"
#git config credential.helper store
#git config --unset credential.helper
git pull --all
git add .
git commit -m PenguinL
git push --set-upstream 1_array_operation master
#in venv
#pip install -r req.txt
#pip freeze > req.txt
#git clone -o 1_array_operation https://github.com/PenguinLW/1_array_operation.git
#git config --global credential.helper cache
git config --global credential.helper "cache --timeout=25200"
#git config credential.helper store
#git config --unset credential.helper
git pull --all
git add .
git commit -m PenguinL
git push --set-upstream 1_array_operation master

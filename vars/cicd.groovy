def newGit(repo)
{
    git "https://github.com/intelliqittrainings/${repo}"
}

def newMaven()
{
    sh 'maven package'
}


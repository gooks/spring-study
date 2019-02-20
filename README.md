# spring-study
스프링 학습용

# [gitflow 설명]
 - develop branch
 - feature branch
 - release branch
 - master branch
 - hotfix branch

# develop branch
 - develop branch는 하나만 존재하고 여기에서 모든 개발이 시작됨. 하지만 절대로 develop branch에 곧바로 commit하지 않음. 
 	이 브랜치에 merge되는 것은 feature branch와 release나 hotfix의 버그 수정뿐. 이 branch는 오직 merge commit만 할 수 있음.

# feature branch
 - feature branch는 여러 개 존재할 수 있음. 여기에 속하는 branch는 develop branch를 기반에 두고 새롭게 branch되어 새로운 기능 개발이나 버그 수정을 담당. 
 	그리고 각각의 branch는 하나의 기능(의도)만을 맡음. 따라서 branch의 이름을 제대로 짓는 것이 중요.
	feature branch들은 오직 develop branch에 merge될 때만 관계성이 생기며 갈라져 나오는 것도 다시 merge하는 것도 오직 develop branch와 함

# release branch
 - release branch는 develop branch에서 갈라져 나와서 배포 준비를 하는 branch. 
 	이 branch는 새로운 기능 추가는 더 하지 않고 오로지 버그 수정만 한며 배포본의 완성도를 높이는 branch
 	당연히 수정된 버그는 develop branch로 merge되어야함

# master branch
 - master branch는 실제 배포되는 버전이 있는 branch. 이 branch는 오직 release와 hotfix branch하고만 관계를 맺음. 

# hotfix branch
 - hotfix branch는 master branch, 즉 현재 배포 중인 코드에 버그가 있어 급히 수정할 때만 사용하는 branch. hotfix branch로 수정한 내용은 master와 develop branch에만 반영. 
 	(master에서 버그가 일어났을때만 사용)


# [git flow 운영 배포 프로세스]
# 새기능 혹은 기능개선
	1. 새로운 기능 / 기능 개선 / 버그수정 git flow의 새 기능 시작으로 feature branch를 생성하여 작업진행
	2. local에서 finish branch

# 버그 수정
	1. develop branch / release branch에서 버그 발생시 feature branch 생성하여 버그 수정
	2. master branch에서 버그 발생시 - 긴급상황
		- git flow의 hotfix branch를 생성하여 버그수정

# 배포 테스트
	1. 개발서버는 develop branch기반, 스테이지 서버는 release branch 기반 배포
	2. develop branch 에서 문제가 없으면 git flow를 통해 release branch 생성
	3. release branch 에서 문제가 없으면 git flow를 통해 finish release하여 master branch에 merge

# etc
    commit message prefix
    - add :  신규파일, 신규코드등 추가
    - modify : 파일명수정, 버그가 아닌 코드수정(개선, 기능변경등..)
    - fix : 버그 수정
    - clean : 코드 리팩토링
    - remove : 파일삭제, 코드삭제
        
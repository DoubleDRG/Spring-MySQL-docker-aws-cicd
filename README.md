# [Study] Spring + MySQL 도커로 AWS에 CI/CD 배포하기 
## 1. 전체 구조 + 흐름
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/88f79308-883a-4656-a434-b79188f4df23)
- 내가 독학하며 이해한 것을 바탕으로 그린거라 틀릴수도 있음..

## 2. 결과물
### 2-1. /home
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/10e69b0c-e808-461d-9292-040eb1d2cee0)

### 2-2. /save/{이름}
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/aa00a7f2-be68-43c6-b5fa-be05c4300d51)

### 2-3. /members
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/1c609b9a-6d73-43bb-9124-88e3c84dac78)

### 2-4. EC2에 접속해서 `sudo docker ps`를 실행시키면, 다음과 같이 컨테이너가 잘 작동하는 것을 확인할 수 있다.
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/43984f6b-084f-42d5-9781-6ad9609b4cec)


### 2-5. 실제 DB에도 값이 잘 저장된다!
![image](https://github.com/DoubleDRG/Spring-MySQL-docker-aws-cicd/assets/147648419/b9cf6122-f93d-4dce-b3b5-7c1cca3de815)






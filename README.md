# Eco-And-Rich
에코앤리치 과제

#### Back-end
### 코딩과제 목표
- 개발 아이디어 및 지원자의 보유 기술의 활용도를 보기 위함입니다.
- 기본적인 주제(과제)를 어떻게 풀어나가는지 보는것이 주 목적입니다.

### 구현 스팩
- 임의의 더미데이터가 삽입되어있는 DB 스키마 구성
  - Oracle의 HR 스키마의 더미데이터 사용
  - https://github.com/nomemory/hr-schema-mysql/blob/master/hr- schema-mysql.sql
- API에서 제공하는 기능은 GET/POST 등의 HTTP Method를 활용하여 구축할것
- 응답의 Response 규격은 json 방식으로 구성
- 각 API는 REST API로 작성

### 구현 기능
구현해야하는 각 API의 request 및 parameter 값에 대한 양식은 자유
예) 특정 사원의 현재 정보 조회 시 ID 값으로 조회 or 이름으로 조회

- 특정 사원의 현재 정보 조회 가능한 API 구현
- 특정 사원의 이력 정보 조회 가능한 API 구현
  - 특정 사원의 현재 정보과 이력 정보 조회 시 같은 사원의 ID값을 입력하였을 경우 특정 데이터와 맞지 않는 경우가 있을 수 있습니다. 무시하고 진행하시면 됩니다.
- 사원 정보를 업데이트 할 수 있는 API 구현
- 부서 및 위치 정보 조회 가능한 API 구현
- 특정 부서의 급여를 특정 비율로 인상 할 수 있는 API 구현
- RDBMS 스키마와 별개로 공공 데이터 포털(www.data.go.kr) 등에서 임의의 API 선택 후 조회 가능하도록 커스터마이징 된 API 구현

### 권장 활용 기술
- JAVA, Kotlin(Spring)
- Mysql(MariaDB) / PostgreSQL 중 택 1
- AWS에 서버 구축 (Stand-Alone 방식)
- Github를 통해 열람 가능하도록 설정 (필수)

### 주의사항
- 기본 구현 기능 외에 정답은 없으니 권장 활용기술 외의 기술이어도 편한대로 자유롭게 개발 진행해주세요.
- Github, 호스팅 URL은 볼 수 있도록 public 상태인지 체크 부탁드립니다.
- 과제를 받고 기한은 일주일입니다. 시간이 더 필요하다면 언제든지 말씀해주세요.
- 확인 가능한 API 명세서 제공이 필요합니다.
- AWS 미사용 시에도 상시 확인 가능한 URL을 공유해주시면 됩니다.

기타 문의 사항은 nohmw@econrich.com 으로 회신 부탁드립니다.
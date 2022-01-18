# 📌쇼미더 코드(SMTC)
코드리뷰 커뮤니티 사이트 
<br><br>
## 1. 제작 기간 & 참여인원
- 2021년 09월 23일 ~ 2021년 12월 09일
- 백엔드 3명
<br><br>
## 2. 사용기술
- Java
- Spring Boot
- Spring Data JPA
- QueryDSL
- H2
- MySQL
- Spring Secruity
- SSE 
<br><br>
## 3. ERD 설계
![142572467-cb29adbf-e20a-40e0-ba52-38e7c2ea78e1](https://user-images.githubusercontent.com/77442567/149893000-c77c03ec-9bfa-4b30-8fbd-fde0c6c0d8a6.png)
<br><br>
## 4. 핵심 기능
1. (사용자) 리뷰어를 직접 지정하여 코드리뷰 받기
   (리뷰어) 요청에 답변하거나 거절
2. 답변 받은 코드리뷰를 사용자가 평가 - 리뷰어 랭킹에 영향
3. 실시간 알림 서비스
<br><br>
## 5. 핵심 트러블 슈팅
### 5.1 웹 페이지 이슈 발생
* 문제 : 로그인 페이지에 CSS 파일 적용되지 않았습니다.
* 해결 : 개발자 도구로 에러 내용을 확인 후 Spring Security의 URL 허용 정책에 변경이 필요하다고 판단 후 해결하였습니다.
### 5.2 CSRF 비활성화 vs 활성화
* 문제 : 개발 편의성 문제로 개발 중에는 비활성화 하였지만 보안의 중요성에 비활성화 할 것인지 활성화 할 것인지 고민하게 되었습니다.
* 해결 : 팀 회의 결과 CSRF 프로텍션은 웹 보안에 있어 필수 요구라고 생각하여 CSRF 활성화를 하기로 하였습니다.

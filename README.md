

<h1> CoffeeShop Project 🚀 </h1>
쇼핑몰시연영상 -> (https://www.youtube.com/watch?v=kewBcOk0xao)
<h1> 📖 프로젝트 기능 </h2>
  - 회원가입<br>
  - 상품 주문<br>   
  - 상품 장바구니 & 주문관리 <br>  
  - 관리자 페이지를 통한 상품 등록 & 수정 

  
  <h1> 📦 프로젝트 개발 환경 </h1>
   <h4> 운영 체제</h4>
      - MAC Big Sur
   <h4> DBMS </h4>
      - MySql<br>
      - h2
    <h4> Tool </h4>
      - intellij<br>
      - VS Code
    <h4> 라이브러리 및 사용 기술 </h4>
      - Spring Boot<br>
      - Spring Data JPA<br>
      - Maven<br>
      - Spring Security<br>
      - QueryDsl<br>
      - JavaScript(jQuery)
   

 <h1> 🖥 ER_Diagram (7개의 테이블)</h1>
  <br>
 
 <img width="717" alt="image" src="https://user-images.githubusercontent.com/85103972/136509207-a053163c-f1f9-4ead-9fb1-b526ec5a565a.png">
<br>
 <br>
 
  <h1>📸 ScreenShot 및 기능 </h1>
  <h3> 🔎 메인 페이지   </h3>
  - Spring Security 에서 비회원, 회원, 관리자에 따라 작업을 수행할수 있는 주체인지 확인을 해줍니다
  
  <h4>메인 화면</h4>
   - 최근 등록된 상품 순서로 로딩 합니다, 클릭하면 상세 페이지로 이동합니다, 6개씩 볼수있고 페이징 기능 사용 가능합니다.
  <br>
   <h4>우측 네비게이션 바</h4>
  - 어느 화면에서도 로그인, 상품 검색 가능
  <br>
  <br>
  <img width="950" alt="image" src="https://user-images.githubusercontent.com/85103972/136522929-895061b1-a257-4e9d-b423-5833df754206.png">
 
  <h3> 검색 기능 </h3>
  - 제목에 포함된 글자를 입력하면 검색 결과가 화면에 출력됩니다
  <br>
  <img width="582" alt="image" src="https://user-images.githubusercontent.com/85103972/136511329-a7d2b1e2-6cb1-4bf3-a520-a66bf264799f.png">
  
   <h4> 로그인 & 회원가입 화면 </h4>
  - 아이디와 비밀번호를 입력해 로그인 할수 있습니다
  - 회원이 아니라면 회원 가입 페이지로 이동할수 있습니다

<h4> 회원 가입 <h4>
  - 중복 확인을 하여 회원일시 script를 이용하여 알림창을 띄워줍니다
  - 가입시 안 적힌 부분은 정규 표현식을 이용하여 이름, 이메일, 비밀번호, 주소를 제한합니다
  - 가입시 비밀번호를 암호화해 줍니다 (BCryptPasswordEncoder 사용)
  - 가입이 완료되면 메인 페이지로 이동합니다
  <br>
  <img width="492" alt="image" src="https://user-images.githubusercontent.com/85103972/136526687-ea3c4c05-4f8a-4681-9fcc-788a02fa3226.png">

   
    
 <img width="701" alt="image" src="https://user-images.githubusercontent.com/85103972/136523160-b782aba4-b493-43cc-95fb-24723ce20aab.png">

<h4> 로그인 하기 </h4>
- Spring Security를 이용하여 인증과 권한을 체크합니다
    - 암호화 된 비밀번호를 복호화 시켜 사용자가 입력한 비밀번호과 비교하여 로그인 성공 여부를 체크합니다
    - 로그인 실패시 error 메시지를 출력합니다
    - 로그인 성공시 session에 회원정보를 저장하여 로그인 상태를 유지해 줍니다
    - 로그인 성공시 메인 페이지로 이동합니다
    <br>
    <img width="450" alt="image" src="https://user-images.githubusercontent.com/85103972/136526499-71f3f0c7-82f0-4140-9cc5-72b5c0c13f7a.png">



  

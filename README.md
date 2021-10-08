

<h1> CoffeeShop Project ☕️ </h1>
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
 <h4> 상세 페이지 </h4>
    - 상품이 품절인지, 판매중 인지 확인이 가능합니다<br>
    - 상품이 판매중일 경우 수량을 정해 장바구니담기, 주문하기 기능을 사용할수 있습니다
    <br>
    <br>
    <span><img width="294" alt="image" src="https://user-images.githubusercontent.com/85103972/136527650-29ebec24-3d00-4ec2-80b9-9178c85635b2.png">
  <img width="243" alt="image" src="https://user-images.githubusercontent.com/85103972/136527668-7409a938-1eb2-4809-8280-37a8d3f45e51.png">

</span>
    
   
 
 
  <h3> 🕵️‍♀️ 검색 기능 </h3>
  - 제목에 포함된 글자를 입력하면 검색 결과가 화면에 출력됩니다
  <br>
  <img width="582" alt="image" src="https://user-images.githubusercontent.com/85103972/136511329-a7d2b1e2-6cb1-4bf3-a520-a66bf264799f.png">
  
   <h4> 👨‍💻 로그인 & 회원가입 페이지 </h4>
  - Spring Security를 이용하여 인증과 권한을 체크합니다<br>
  - 암호화 된 비밀번호를 복호화 시켜 사용자가 입력한 비밀번호과 비교하여 로그인 성공 여부를 체크합니다<br>
  - 로그인 실패시 error 메시지를 출력합니다<br>
  - 로그인 성공시 session에 회원정보를 저장하여 로그인 상태를 유지해 줍니다<br>
  - 로그인 성공시 메인 페이지로 이동합니다
  <br>
 <span><img width="701" alt="image" src="https://user-images.githubusercontent.com/85103972/136523160-b782aba4-b493-43cc-95fb-24723ce20aab.png">
     <img width="450" alt="image" src="https://user-images.githubusercontent.com/85103972/136526499-71f3f0c7-82f0-4140-9cc5-72b5c0c13f7a.png">

</span>

<h4> 👼 회원 가입 페이지 </h4>
  - 중복 확인을 하여 회원일시 script를 이용하여 알림창을 띄워줍니다<br>
  - 가입시 안 적힌 부분은 정규 표현식을 이용하여 이름, 이메일, 비밀번호, 주소를 제한합니다<br>
  - 가입시 비밀번호를 암호화해 줍니다 (BCryptPasswordEncoder 사용)<br>
  - 가입이 완료되면 메인 페이지로 이동합니다
  <br>
  <br>
  <img width="492" alt="image" src="https://user-images.githubusercontent.com/85103972/136526687-ea3c4c05-4f8a-4681-9fcc-788a02fa3226.png">

<h2> ☺️ 일반 회원 </h2>
<h3> 🎒 장바구니 페이지 </h3>
   - 장바구니 수량을 배열로 받아서 수량을 수정해줍니다<br>
   - 상품 선택 후 수량을 수정하면 총 주문 금액 가격이 바뀝니다<br>
   - x 버튼을 클릭하면 상품이 삭제굅니다<br>
   - 주문하기 버튼을 누르면 주문 완료 알람후 구매 이력 페이지로 이동합니다
<br>
<br>
<img width="448" alt="image" src="https://user-images.githubusercontent.com/85103972/136528793-a5717088-6b11-4d58-8db6-438bd762b333.png">

  <h3> 👍 상품 구매 이력 페이지 </h3>
  - 주문 내역 리스트들과 주문날짜, 시간이 출력됩니다<br>
  - 주문 취소 버튼을 누르면 취소완료 알람후 취소가 완료됩니다
  <br>
  <br>
  <span>
<img width="439" alt="image" src="https://user-images.githubusercontent.com/85103972/136529165-e5f1fd1b-450a-47c1-81ec-5d0968390fe2.png">
</span>
  
  
<h2> 🥰 관리자 </h2>

<h3> 관리자 상품 등록 페이지 </h3>
- 관리자 만이 상품 등록 가능합니다 ( 등록된 상품은 삭제할수 없습니다)<br>
- 빈칸일 경우 경고를 보여줍니다<br>
- 첫번째 상품 이미지는 메인 페이지의 썸네일로 보여집니다<br>
- 최대 5장까지 등록 가능합니다<br>
- 저장버튼을 클릭하면 메인화면으로 이동합니다
<br>
<br>
<span>
  <img width="448" alt="image" src="https://user-images.githubusercontent.com/85103972/136529804-51505b96-96e3-4b7f-8b2e-e396555f8d8d.png">
<img width="389" alt="image" src="https://user-images.githubusercontent.com/85103972/136529816-71f897ac-05ab-4b29-8183-d1f2c6ed81db.png">

</span>

<h3> 관리자 상품 수정 </h3>
- 관리자만 상품 수정이 가능합니다<br>
- 1일, 1주, 1개원, 6개월 별로 검색이 가능합니다<br>
- 판매 상태에 따라 검색이 가능합니다<br>
- 원하는 상품명, 등록자를 검색할 수 있습니다.<br>
- 상품명을 클릭하면 수정 페이지로 이동합니다
<br>
<br>

<span>
  <img width="430" alt="image" src="https://user-images.githubusercontent.com/85103972/136529593-4e82bfef-cf51-4774-8f0d-c0d61fac25fd.png">

  <img width="355" alt="image" src="https://user-images.githubusercontent.com/85103972/136529627-cf215af4-f4e2-49ea-a66e-e89f46bf5dd0.png">

  <img width="484" alt="image" src="https://user-images.githubusercontent.com/85103972/136529740-cce3370a-94aa-4104-a238-766f9e3464b4.png">

  </span>
  
  

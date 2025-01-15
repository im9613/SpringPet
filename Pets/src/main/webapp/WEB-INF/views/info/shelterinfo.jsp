<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="en">
<style>
	#title {
		text-align: center;
		margin-top: 50px;
		margin-bottom: 50px;
	}
	#map {
	 	display: flex;
 		justify-content: center; /* 가로 중앙 정렬 */
 		margin: 80px;
		width:80%;
		height:600px;
		 
	}
</style>

    <head>
      <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    
        <meta charset="utf-8">
        <title>Happynimal</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">
        <link rel="icon" href="/pet/resources/img/favicon.png">
        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wdth,wght@0,75..100,300..800;1,75..100,300..800&family=Playfair+Display:ital,wght@0,400..900;1,400..900&display=swap" rel="stylesheet"> 

        <!-- Icon Font Stylesheet -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="/pet/resources/lib/animate/animate.min.css" rel="stylesheet">
        <link href="/pet/resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


        <!-- Customized Bootstrap Stylesheet -->
        <link href="/pet/resources/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="/pet/resources/css/style.css" rel="stylesheet">
    </head>

    <body>

       <!-- Spinner Start -->
       <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
            <span class="sr-only">Loading...</span>
        </div>
    </div>
    <!-- Spinner End -->

    <!-- Navbar & Hero Start -->
    <div class="container-fluid position-relative p-0">
        <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
            <a href="/pet/index.do" class="navbar-brand p-0">
                <h1 class="text-primary"><img src="/pet/resources/img/logo2.png"></img>Happynimal</h1>
                <!-- <img src="img/logo.png" alt="Logo"> -->
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="fa fa-bars"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto py-0">
                    <a href="/pet/index.do" class="nav-item nav-link">Home</a>
                        <a href="/pet/about.do" class="nav-item nav-link">소개</a>
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">입양</a>
                            <div class="dropdown-menu m-0">
                                <a href="/pet/adoptioninfo.do" class="dropdown-item">입양안내</a>
                                <a href="/pet/petboard.do" class="dropdown-item">기다리는 친구들</a>
                                <a href="/pet/applicationadoption.do" class="dropdown-item">입양신청</a>
                                <a href="/pet/review.do" class="dropdown-item">입양후기</a>
                            </div>
                        </div>
                        
        
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">활동</a>
                            <div class="dropdown-menu m-0">
                                <a href="/pet/volunteerinfo.do" class="dropdown-item">봉사활동 안내</a>
                                <a href="/pet/volunteerboard.do" class="dropdown-item">봉사활동 모집</a>
                                <a href="/pet/missingboard.do" class="dropdown-item">실종 게시판</a>
                            </div>
                        </div>
                        <a href="/pet/shelter.do" class="nav-item nav-link active">보호소 및 병원</a>
                        <a href="/pet/donation.do" class="nav-item nav-link">후원</a>
                </div>
                <div class="d-none d-xl-flex me-3">
                    <div class="d-flex flex-column pe-3 border-end border-primary">
                       
                    </div>
                </div>
                
                <a href="" class="btn btn-primary rounded-pill d-inline-flex flex-shrink-0 py-2 px-4">로그인</a>
            </div>
        </nav>

            <!-- Header Start -->
            <div class="container-fluid bg-breadcrumb">
                <div class="container text-center py-5" style="max-width: 900px;">
                    <h4 class="text-white display-4 mb-4 wow fadeInDown" data-wow-delay="0.1s">보호소 및 병원</h4>
                    <ol class="breadcrumb d-flex justify-content-center mb-0 wow fadeInDown" data-wow-delay="0.3s">
                        <li class="breadcrumb-item"><a href="/pet/index.do">Home</a></li>
                        <li class="breadcrumb-item"><a href="#">Pages</a></li>
                        <li class="breadcrumb-item active text-primary">Shelter and Hospital</li>
                    </ol>    
                </div>
            </div>
            <!-- Header End -->
        </div>
        <!-- Navbar & Hero End -->

        <!-- Modal Search Start -->
        <div class="modal fade" id="searchModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-fullscreen">
                <div class="modal-content rounded-0">
                    <div class="modal-header">
                        <h4 class="modal-title mb-0" id="exampleModalLabel">Search by keyword</h4>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex align-items-center">
                        <div class="input-group w-75 mx-auto d-flex">
                            <input type="search" class="form-control p-3" placeholder="keywords" aria-describedby="search-icon-1">
                            <span id="search-icon-1" class="input-group-text btn border p-3"><i class="fa fa-search text-white"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal Search End -->

        <!-- 지도 -->
        <!-- style="text-align: center -->
        <h1 id=title style="text-align: center;">보호소 병원 안내</h1>
        <div id="map" ></div>
        
   
  <!-- board list area -->

<section class="notice">
  <div id="shelter-list" class="list-section" style="display: flex;">
	<div class="container">
        	<h3>보호소 리스트</h3>
        	<img src="/pet/resources/img/shelterIcon.png" />
        	
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">이름</th>
                    <th scope="col" class="th-date">전화번호</th>
                </tr>
                </thead>
                <c:forEach items="${shelterMapList}" var="ShelterMap">
                <tbody>
	                <tr>
	                    <td>${ShelterMap.shelter.seq}</td>
	                    <th>${ShelterMap.shelter.name}</th>
	                    <td>${ShelterMap.shelter.telephone}</td>
	                </tr>
            	 </c:forEach>
                </tbody>
            </table>
		</div>
	
  <div id="hospital-list" class="list-section" style="display: flex;">
       	<h3>병원 리스트</h3>
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">이름</th>
                    <th scope="col" class="th-date">전화번호</th>
                </tr>
                </thead>
                <c:forEach items="${hospitals}" var="hospital">
                
                <tbody>
	                <tr>
	                    <td>${hospital.seq}</td>
	                    <th>${hospital.name}</th>
	                    <td>${hospital.telephone}</td>
	                </tr>
	             </c:forEach>
               </tbody>
            </table>
        </div>
	</div>
</section>

        <!-- 지도End -->
        
        

        

        
        <!-- Copyright Start -->
        <div class="container-fluid copyright py-4">
            <div class="container">
                <div class="row g-4 align-items-center">
                    <div class="col-md-6 text-center text-md-start mb-md-0">
                        <span class="text-body"><a href="#" class="border-bottom text-white"><i class="fas fa-copyright text-light me-2"></i>Your Site Name</a>, All right reserved.</span>
                    </div>
                    <div class="col-md-6 text-center text-md-end text-body">
                        <!--/*** This template is free as long as you keep the below author’s credit link/attribution link/backlink. ***/-->
                        <!--/*** If you'd like to use the template without the below author’s credit link/attribution link/backlink, ***/-->
                        <!--/*** you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". ***/-->
                        Designed By <a class="border-bottom text-white" href="https://htmlcodex.com">HTML Codex</a> Distributed By <a class="border-bottom text-white" href="https://themewagon.com">ThemeWagon</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Copyright End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-secondary btn-lg-square rounded-circle back-to-top"><i class="fa fa-arrow-up"></i></a>   

        
    <!-- JavaScript Libraries -->
    <script type="text/javascript" src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=b59a3e33989133235f6e5dd1256b5469&libraries=clusterer"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="/pet/resources/lib/wow/wow.min.js"></script>
    <script src="/pet/resources/lib/easing/easing.min.js"></script>
    <script src="/pet/resources/lib/waypoints/waypoints.min.js"></script>
    <script src="/pet/resources/lib/counterup/counterup.min.js"></script>
    <script src="/pet/resources/lib/owlcarousel/owl.carousel.min.js"></script>
    
    
    

    <!-- Template Javascript -->
    <script src="/pet/resources/js/main.js"></script>
		<script>
    var container = document.getElementById('map'); // 지도를 담을 영역의 DOM 레퍼런스
    
    var options = { // 지도를 생성할 때 필요한 기본 옵션
        center: new kakao.maps.LatLng(37.5665, 126.9780), // 지도의 중심 좌표
        level: 14 // 지도의 레벨(확대, 축소 정도)
    };
    var map = new kakao.maps.Map(container, options); // 지도 생성
    
    
// 마커 클러스터    
    var clusterer = new kakao.maps.MarkerClusterer({
        map: map, // 마커들을 클러스터로 관리하고 표시할 지도 객체 
        averageCenter: true, // 클러스터에 포함된 마커들의 평균 위치를 클러스터 마커 위치로 설정 
        minLevel: 8 // 클러스터 할 최소 지도 레벨 
    });
    
// 데이터 가져오기
    $.get("/pet/resources/js/list.json", function(data) {
        // 데이터에서 좌표 값을 가지고 마커를 표시합니다
        // 마커 클러스터러로 관리할 마커 객체는 생성할 때 지도 객체를 설정하지 않습니다
        var markers = $(data.positions).map(function(i, position) {
            return new kakao.maps.Marker({
                position : new kakao.maps.LatLng(position.lat, position.lng)
            });
        });

        // 클러스터러에 마커들을 추가합니다
        clusterer.addMarkers(markers);
    });
    

 // 커스텀 마커 이미지 설정
	var imageSrc = '/pet/resources/img/shelterIcon.png', // 마커이미지의 주소입니다    
    imageSize = new kakao.maps.Size(64, 69), // 마커이미지의 크기입니다
    imageOption = {offset: new kakao.maps.Point(27, 69)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
// 이미지 객체 생성     
    var customMarkerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption);
    
    
     for (var i = 0; i < positions.length; i++) {
    	    var markerImage = positions[i].type === 'shelter' ? customMarkerImage : null;

    	    var marker = new kakao.maps.Marker({
    	        position: new kakao.mpas.LatLng(position[i]).lat)
    	        title: positions[i].title,
    	        image: markerImage
    	    });
    	    

    	    // 인포윈도우 내용 설정
    	    var iwContent = `
    	        <div style="padding:5px; min-width: 200px;">
    	            <h3>${positions.title}</h3>
    	        </div>
    	    `;
    	    var iwPosition = positions[i].latlng;
    	    var iwRemovable = true; 

    	    var infowindow = new kakao.maps.InfoWindow({
    	        content: iwContent,
    	        removable: iwRemovable 
    	    });
    	    

    	    // 마커 클릭 시 인포윈도우 표시
    	    kakao.maps.event.addListener(marker, 'click', function() {
    	            infowindow.open(map, marker);
    	        });
    	    return marker;
    	});
    	
    	clusterer.addMarkers(marker);
   	});
     
        


</script>

    </body>

</html>











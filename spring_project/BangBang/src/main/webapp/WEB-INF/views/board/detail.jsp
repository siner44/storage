<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>



<div class="reviewModal">

 <div class="reviewContent">
  
  <div>
   <textarea class="modal_reCon" name="modal_reCon"></textarea>
  </div>
  
  <div>
   <button type="button" class="modal_modify_btn">수정</button>
   <button type="button" class="modal_cancel">취소</button>
  </div>
  
 </div>

 <div class="modalBackground"></div>
 
</div>
<%@include file="../includes/bangbang-header.jsp"%>
	
<%@include file="../includes/bangbang-nav.jsp"%>
<main>
	<script>
	function reviewList() {
		var iidx = ${item.iidx};
		$.getJSON("${pageContext.request.contextPath}/board/detail/review-list"+ "?iidx=" + iidx, function(data) {
			var str = "";
			$(data).each(function() {
				
				console.log(data);
				
				var date = new Date(this.date);
				date = date.toLocaleDateString("ko-US")
				
				str += "<li data-iidx='" + this.iidx + "'>"
				+ "<div class='userInfo'>"
				+ "<span class='userName'>"+ this.userName + "</span>"
				+ "<span class='rating'>"+ this.rating + "</span>"
				+ "<span class='date'>"+ date + "</span>"
				+ "</div>"
				+ "<div class='content'>"+ this.content + "</div>"
				
				+ "<div class='reviewFooter'>"
				+ "<button type='button' class='update' data-iidx='" + this.iidx + "'>수정</button>"
				+ "<button type='button' class='delete' data-iidx='" + this.iidx + "'>삭제</button>"
				+ "</div>"
				+ "</li>";
			});
			$("section.reviewList ol").html(str);
		});
	}
		
	</script>
	<section class="py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="row gx-4 gx-lg-5 align-items-center">
				<div class="col-md-6">
					<img class="card-img-top mb-5 mb-md-0"
						src="${pageContext.request.contextPath}/uploadfile/${board.thumb}" alt="..." />
				</div>
				<div class="col-md-6">
					<div class="small mb-1">${board.date}</div>
					<h1 class="display-5 fw-bolder">${board.title}</h1>
					<div class="fs-5 mb-5">
						<span class="text-decoration-line-through">${item.sprice}</span> <span>${item.price}</span>
					</div>
					<p class="lead">상품 정보</p>
					<div class="d-flex">
						<input class="form-control text-center me-3" id="inputQuantity"
							type="num" value="1" style="max-width: 3rem" />
						<button class="btn btn-outline-dark flex-shrink-0" type="button">
							<i class="bi-cart-fill me-1"></i> Add to cart
						</button>
					</div>
					<div>
			<div class="w3-border w3-center w3-padding">
				<c:if test="${user.uidx == null}">
					추천 기능은 <button type="button" id="newLogin"><b class="w3-text-blue">로그인</b></button> 후 사용 가능합니다.<br />
					<i class="fa fa-heart" style="font-size:16px;color:red"></i>
					<span class="rec_count"></span>					
				</c:if>
				<c:if test="${user.uidx != null}">
					<button class="w3-button w3-black w3-round" id="rec_update">
						<i class="fa fa-heart" style="font-size:16px;color:red"></i>
						&nbsp;<span class="rec_count"></span>
					</button> 
				</c:if>
			</div>
		</div>
				</div>
			</div>
		</div>
	</section>
	<div>${board.content}</div>

	<div id="review">
		<section class="reviewForm">
			<form role="form" method="post">
				<input type="hidden" name="iidx" id="iidx" value="${item.iidx}">
				<input type="hidden" name="uidx" value="1">
				<input type="range" min="1" max="5" step="1" value="5" id="rating" name="rating">
				<div class="input_area">
					<textarea name="content" id="content"></textarea>
				</div>
				<div class="input_area">
					<button type="button" id="review_btn">리뷰 등록</button>
					<script>
 					$("#review_btn").click(function(){
  
 						var formObj = $(".reviewForm form[role='form']");
  						var iidx = $("#iidx").val();
  						var content = $("#content").val();
  						var rating = $("#rating").val();
  
 						var data = {
  							iidx : iidx,
   							content : content,
   							rating : rating
  						};
  
 						$.ajax({
  					 		url : "${pageContext.request.contextPath}/board/detail/review-reg",
  							type : "post",
   							data : data,
  						 	success : function(){
  						 		reviewList();
  						 		$("#content").val("");
 						 	}
 						 });
					});
					</script>
				</div>
			</form>
		</section>

		<section class="reviewList">
			<ol>
			</ol>
			<script>
				reviewList();
			</script>
			<script>
			 	$(document).on("click", ".delete", function(){
				  
				  var data = {iidx : $(this).attr("data-iidx")};
				   
				  $.ajax({
				   url : "${pageContext.request.contextPath}/board/detail/review-del",
				   type : "post",
				   data : data,
				   success : function(){
				     replyList();
				   }
				  });
				 });
			</script>
		</section>
		</div>


	<div class="margin-top text-align-center">
		<a class="btn btn-list" href="${pageContext.request.contextPath}/board/list">목록</a>
		<a class="btn btn-list" href="${pageContext.request.contextPath}/board/delete?iidx=${board.iidx}">삭제</a>
	</div>


</main>
<%@include file="../includes/bangbang-footer.jsp"%>

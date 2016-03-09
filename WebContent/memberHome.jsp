<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" %>
<%@ page language="java" import="desserthouse.VO.*" %>
<%@ page language="java" import="desserthouse.configure.Configure" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<link href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-1.11.3.min.js"></script>
<!-- Custom Theme files -->
<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/flexslider.css" type="text/css" media="screen" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/member.js"></script>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
</script>
<!-- 包括所有已编译的插件 -->
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/move-top.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
</head>
<body>
<!--banner info start here-->
<div class="banner" id="home">
	<div class="container">
		<div class="header">
			<div class="logo">
				<a href="index.html"><img src="<%=request.getContextPath()%>/images/logo.png" alt="" ></a>
			</div>
			<div class="header-right">
			<div class="top-nav">
				<span class="menu"> <img src="<%=request.getContextPath()%>/images/icon.png" alt=""> </span>
				<ul class="res">
					<li><a class="active  scroll" href="#home">首页</a></li>
					<li><a class="scroll" href="#product">产品</a></li>
					<li><a class="scroll" href="#reserve">预定</a></li>
					<li><a class="scroll" href="#member_info">会员信息</a></li>
					<li><a class="scroll" href="#record">我的记录</a></li>
					<li><a class="scroll" href="../login/logout"><span class="glyphicon glyphicon-log-out"></span>退出</a></li>
				</ul>
				<!-- script-for-menu -->
				 <script>
				   $( "span.menu" ).click(function() {
					 $( "ul.res" ).slideToggle( 300, function() {
					 // Animation complete.
					  });
					 });
				</script>
			<!-- /script-for-menu -->
			</div>
			<div class="search-box">
				<div id="sb-search" class="sb-search">
					<form>
						<input class="sb-search-input" placeholder="Search" type="search" name="search" id="search">
						<input class="sb-search-submit" type="submit" value="">
						<span class="sb-icon-search"> </span>
					</form>
			   </div>
			</div>
			<div class="clearfix"> </div>
			  <!-- search-scripts -->
					<script src="<%=request.getContextPath()%>/js/classie.js"></script>
					<script src="<%=request.getContextPath()%>/js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->
		  </div>
		   <div class="clearfix"> </div>
		</div>
<div class="banner-bottom">
   <section class="slider">
		<div class="flexslider">
			<ul class="slides">
					<li>
						<h2>Nam libero tempore cum soluta nobis</h2>
						<p>At vero eos et accusamus et iusto odio dignissimos</p>
						<div class="bann-btn">
							<a href="#">Read More</a>
						</div>
					</li>
					<li>
						<h2>Libero tempore cum soluta nobis cum</h2>
						<p>At vero eos et accusamus et iusto odio dignissimos</p>
						<div class="bann-btn">
							<a href="#">Read More</a>
						</div>
					</li>
					<li>
						<h2>Tempore cum soluta nobis namlibero</h2>
						<p>At vero eos et accusamus et iusto odio dignissimos</p>
						<div class="bann-btn">
							<a href="#">Read More</a>
						</div>
					</li>
						  <div class="clearfix"> </div>
					</ul>
				</div>
			</section>
		</div>
	</div>
</div>
<!-- FlexSlider -->
				  <script defer src="<%=request.getContextPath()%>/js/jquery.flexslider.js"></script>
				  <script type="text/javascript">
					$(function(){
					  SyntaxHighlighter.all();
					});
					$(window).load(function(){
					  $('.flexslider').flexslider({
						animation: "slide",
						start: function(slider){
						  $('body').removeClass('loading');
						}
					  });
					});
				  </script>
			<!-- FlexSlider -->
<!--product start here-->
<div class="product" id="product">
	<div class="container">
		<div class="product-main">
			<div class="product-top">
			    <h3>product</h3>
			    <p>我们为你准备好每一份甜蜜与温暖，在这里，遇见，就不再分离。</p>
			</div>
			<div class="product-bottom">
				<div class="product-1">
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/雪媚娘.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/雪媚娘.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/布丁.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/布丁.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/黑森林蛋糕.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/黑森林蛋糕.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/酸奶水果捞.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/酸奶水果捞.jpg" alt="">
						</a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="product-1">
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/提拉米苏.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/提拉米苏.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/苹果派.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/苹果派.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/马卡龙.jpg"rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/马卡龙.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/抹茶卷.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/抹茶卷.jpg" alt="">
						</a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="product-1">
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/抹茶慕斯.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/抹茶慕斯.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/牛奶冻.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/牛奶冻.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/草莓大福.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/草莓大福.jpg" alt="">
						</a>
					</div>
					<div class="col-md-3 product-left">
						<a href="<%=request.getContextPath()%>/images/大理石蛋糕.jpg" rel="title">
							<img class="img-responsive" src="<%=request.getContextPath()%>/images/大理石蛋糕.jpg" alt="">
						</a>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>

		 </div>
	</div>
</div>
<!--product  end here-->
<!--reserve start here-->
<div class="reserve" id="reserve">
	<div class="container">
		<div class="reserve-main">
			<div class="reserve-top">
				<h3>reserve</h3>
				<p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete</p>
			</div>
			<div class="reserve-bottom">
			<% 
			ArrayList<ShopVO> shopList = (ArrayList<ShopVO>)session.getAttribute("shopList");
				for(int i=0;i<shopList.size();i++){
					ShopVO vo = shopList.get(i);
					if(i%2==0){
						%>
						<div class="reserve-grid">
							<div class="col-md-6 reserve-semi-grid">
								    <h5><%=vo.getName() %></h5>
									<h4>联系电话： <%=vo.getPhone() %></h4>
									<p>地址： <%=vo.getAddress() %>&nbsp;&nbsp;&nbsp;开业时间： <%=vo.getOpening_time() %>&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/direct/member?type=reserve&shop_id=<%=vo.getShop_id() %>">点击进入</a></p>
							</div>
						<%
					}else{
						%>
							<div class="col-md-6 reserve-semi-grid">
						    	<h5><%=vo.getName() %></h5>
								<h4>联系电话： <%=vo.getPhone() %></h4>
								<p>地址： <%=vo.getAddress() %>&nbsp;&nbsp;&nbsp;开业时间： <%=vo.getOpening_time() %>&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/direct/member?type=reserve&shop_id=<%=vo.getShop_id() %>">点击进入</a></p>
							</div>
				     		<div class="clearfix"> </div>
				  		</div>
						<% 
					}
				}
			%> 
			</div>     <!-- reserve bottom -->
		</div>			<!-- reserve main -->
	  <div class="clearfix"> </div>
	</div>				<!-- container -->
</div>	<!-- reserve -->
<!--reserve end here-->
<!--member_info start here-->

<div class="member_info" id="member_info">
	<% MemberVO vo = (MemberVO)session.getAttribute("member"); %>
	<div class="container">
		<div class="member_info-main">
			<div class="member_info-top">
				<h3>亲爱的会员，<span id="currentName"><%=vo.getName() %></span></h3>
				<p>会员ID:<%=vo.getStringId() %> <button id="status_change" class="btn-default">
				<% if(vo.getStatus()==Configure.ACTIVE)
					out.print("停用账户");
					else
					out.print("激活账户");%></button></p>
			</div>
			<!-- first column -->
			<div class="member_info-bottom">
			   <div class="member_info-grid">
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/name.png" alt=""> </span>
					<div class="fea-text">
						<h4>会员昵称</h4>
						<p>会员昵称将会出现在你的预定订单中。</p>
						<span id="span_username"><%=vo.getName() %></span>
						<button class="btn btn-default" id="btn_username">修改</button>
				    </div>
				 <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/phone.png" alt=""> </span>
					<div class="fea-text">
						<h4>手机号码</h4>
						<p>请填写真实的联系方式，我们将会发送您的预定信息到您的手机上。</p>
						<span id="span_phone"><%=vo.getPhone() %></span>
						<button class="btn btn-default" id="btn_phone">修改</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/rank.png" alt=""> </span>
					<div class="fea-text">
						<h4>我的等级</h4>
						<p>当前可享用9折优惠，还差300积分升为金卡会员</p>
						<span id="span_rank">
						<%
							if(vo.getRank()==Configure.BRONZE)
								out.print("铜卡会员");
							else if(vo.getRank()==Configure.SILVER)
								out.print("银卡会员");
							else if(vo.getRank()==Configure.GOLDEN)
								out.print("金卡会员");
							else if(vo.getRank()==Configure.ORDINARY)
								out.print("普通会员");
						%>
						</span>
				    </div>
				   <div class="clearfix"> </div>
				</div>
			     <div class="clearfix"> </div>
			  </div>
			  <!-- second column -->
			  <div class="member_info-grid">
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/password.png" alt=""> </span>
					<div class="fea-text">
						<h4>密码</h4>
						<p>密码应大于6位小于15位，支持英文字母、数字。为了账户安全，建议使用较复杂的密码。</p>
						<span id="span_password" >********</span>
						<button class="btn btn-default" id="btn_password">修改</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/card.png" alt=""> </span>
					<div class="fea-text">
						<h4>银行账号</h4>
						<p>您将使用绑定的银行卡进行会员账户充值。</p>
						<span id="span_card">
						<%
							String card = vo.getCard();
							if(card==null)
								out.print("未设置");
							else
								out.print(card);
						%>
						</span>
						<button class="btn btn-default" id="btn_card">
						<%
						if(card==null)
							out.print("点击进行设置");
						else
							out.print("修改");
						%>
						</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/points.png" alt=""> </span>
					<div class="fea-text">
						<h4>我的积分</h4>
						<p>积分可用于兑换账户余额，每50积分可兑换1元。</p>
						<span id="span_points"><%=vo.getPoints() %>分</span>
						<span id="hidden_points" class="hidden"><%=vo.getPoints() %>分</span>
						<button class="btn btn-default" id="btn_points">兑换积分</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			  </div>
			  <!-- third column -->
			  <div class="member_info-grid">
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/birthday.png" alt=""> </span>
					<div class="fea-text">
						<h4>出生日期</h4>
						<p>请填写真实的出生日期，帮助我们更好地根据您的年龄推荐产品。</p>
						<span id="span_birthday">
						<%
						String birthday = vo.getBirthday();
						if(birthday==null)
							out.print("未设置");
						else{
							out.print(birthday);
						}
						%>
						</span>
						<button class="btn btn-default" id="btn_birthday">
						<%
						if(card==null)
							out.print("点击进行设置");
						else
							out.print("修改");
						%>
						</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/address.png" alt=""> </span>
					<div class="fea-text">
						<h4>居住地</h4>
						<p>请填写目前的居住地，方便我们根据您的地址推荐就近分店的产品</p>
						<span id="span_address"><%=vo.getAddress() %></span>
						<button class="btn btn-default" id="btn_address">修改</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="col-md-4 member_info-semi-grid">
					<span class="f1"><img src="<%=request.getContextPath()%>/images/balance.png" alt=""> </span>
					<div class="fea-text">
						<h4>我的余额</h4>
						<p>会员卡余额可直接用于店内消费。可前往“我的记录”查看您的消费记录和充值记录。</p>
						<span id="span_balance"><%=vo.getBalance() %>元</span>
						<button class="btn btn-default" id="btn_balance" data-toggle="modal" 
   				data-target="#rechargeModal">充值</button>
				    </div>
				   <div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			  </div>
			</div>
		  <div class="clearfix"> </div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="rechargeModal" tabindex="-1" role="dialog" 
	   aria-labelledby="myModalLabel" aria-hidden="true">
	   <div class="modal-dialog">
	      <div class="modal-content">
	         <div class="modal-header">
	            <button type="button" class="close" 
	               data-dismiss="modal" aria-hidden="true">
	                  &times;
	            </button>
	            <h4 class="modal-title" id="myModalLabel">
	               账户充值
	            </h4>
	         </div>
	         <div class="modal-body">
	         	<div>您的银行账号为：<span id="modal_card"><%=vo.getCard() %></span>,
	         	当前余额为<span id="modal_balance"><%=vo.getBalance() %></span></div>
	         	<div>
	         		<label for="recharge-money">充值金额</label>
	         		<input type="text" class="fomr-control" id="recharge-money" name="" value="" placeholder="请输入充值的金额..."/>
	         	</div>
	         </div>
	         <div class="modal-footer">
	            <button type="button" class="btn btn-default" 
	               data-dismiss="modal">关闭
	            </button>
	            <button type="button" class="btn btn-primary" id="confirm-recharge">
	               确认
	            </button>
	         </div>
	      </div><!-- /.modal-content -->
	   </div>
	</div><!-- /.modal -->
</div>
<!--member_info end here-->
<!--record start here-->
<div class="record" id="record">
	<div class="container">
		<div class="record-main">
			<div class="record-top">
			  	<h3>我的记录</h3>
			  	<p>查看我的消费和充值记录，若有疑问可至店里咨询店员.</p>
		  	</div>
		  	<div class="record-bottom">
		  		<div class="col-md-6 record-left">
		  			<table class="table table-bordered">
					   <caption>消费记录</caption>
					   <thead>
					      <tr>
					         <th>消费金额</th>
					         <th>消费时间</th>
					         <th>消费地点</th>
					      </tr>
					   </thead>
					   <tbody>
					   		
					      <%
					      ArrayList<RecordVO> expand = (ArrayList<RecordVO>)session.getAttribute("expand_record");
					      	for(RecordVO e:expand){
					      		%>
					      		<tr>
						      		<td><%=e.getMoney() %></td>
						      		<td><%=e.getOperation_time() %></td>
						      		<td><%=e.getWay() %></td>
					      		</tr>
					      		<%
					      	}
					      %>
					   </tbody>
					</table>
		        </div>
		        <div class="col-md-6 record-right">
		        	<table class="table table-bordered">
					   <caption>充值记录</caption>
					   <thead>
					      <tr>
					         <th>充值金额</th>
					         <th>充值时间</th>
					         <th>充值地点</th>
					      </tr>
					   </thead>
					   <tbody>
					      
					      <%
					      ArrayList<RecordVO> recharge = (ArrayList<RecordVO>)session.getAttribute("recharge_record");
					      	for(RecordVO r:recharge){
					      		%>
					      		<tr>
						      		<td><%=r.getMoney() %></td>
						      		<td><%=r.getOperation_time() %></td>
						      		<td><%=r.getWay() %></td>
					      		</tr>
					      		<%
					      	}
					      %>
					   </tbody>
					</table>
		        </div>
		    </div>
		</div>
   </div>
</div>
<!--record end here-->

<!--footer start here-->
<div class="footer">
	<div class="container">
		  <div class="copyright">
	            <p>Copyright &copy; 2016.NJU All rights reserved.</p>
			</div>
	</div>
	<script type="text/javascript">
										$(document).ready(function() {
											/*
											var defaults = {
									  			containerID: 'toTop', // fading element id
												containerHoverID: 'toTopHover', // fading element hover id
												scrollSpeed: 1200,
												easingType: 'linear'
									 		};
											*/

											$().UItoTop({ easingType: 'easeOutQuart' });

										});
									</script>
						<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
</div>
<!--footer end here-->
</body>
</html>
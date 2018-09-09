
var myrizhiID;
function tiaoZhuang(myrizhiID)
{
	//alert(myrizhiID);
	 window.location.href="rizhiInfo.html?"+myrizhiID;
}

//var jsonObj = JSON.parse( JSON.stringify(data) );
//var data=eval("("+data+")");
//data=JSON.parse(data);
// alert(data);


//alert(data.retcode);
//alert(data.retmsg);
//alert(data.rizhilist);

//alert(data[0].rizhitext);


function initRiZhiList()
{
	//查询日志列表json
    $.ajax(
	 {
		 type: "post",
         dataType: "text", //返回数据格式为text
		 url:"http://localhost:8080/selectRizhiList",
	     success:function(data)	
	     {
             data = eval("("+data+")");//解析json

	    	 $.each(data.rizhilist,function(i,d){
	    		//alert(d.rizhitext);

                 var mydatetime = new Date(d.rizhitime);//转换时间
                 mydatetime=mydatetime.Format("yyyy-MM-dd");

                 //date.Format("yyyy-MM-dd hh:mm:ss");
                 //alert(mydatetime.Format("yyyy-MM-dd"));

	    		  if(i<5)
	    		  {
	    		  	$('#myrizhilistDiv1').append(	
					  "<a href=\"#\" class=\"list-group-item\" onclick=\"tiaoZhuang("
					  +d.rizhiid
		    		  +")\">"
					  +"<font style=\"font-size: 18px;\">"
					  +d.rizhitexthead
					  +"</font>"
					  +"<div class=\"mylitext\">"
					  +"<span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\" style=\"color: #C4E3F3;\">"
					  +"<font> "
					  +d.rizhiauthor
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-thumbs-up\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +d.rizhizang
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +mydatetime
					  +"</font>"
					  +"</span>"
					  +"</div>"
					  +"</a>"
		    		);
	    		  }
	    		  else
	    		  {
	    		  	$('#myrizhilistDiv2').append(	
					  "<a href=\"#\" class=\"list-group-item\" onclick=\"tiaoZhuang("
					  +d.rizhiid
		    		  +")\">"
					  +"<font style=\"font-size: 18px;\">"
					  +d.rizhitexthead
					  +"</font>"
					  +"<div class=\"mylitext\">"
					  +"<span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\" style=\"color: #C4E3F3;\">"
					  +"<font> "
					  +d.rizhiauthor
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-thumbs-up\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +d.rizhizang
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +mydatetime
					  +"</font>"
					  +"</span>"
					  +"</div>"
					  +"</a>"
	    		  	 );
	    		  }
	    					
	    	 });
         
	     },
		 error:function()
		 {
			alert("日志列表查询失败！"); 
		 }
	 }
	 );
	 
}


function searchRiZhi()
{

	//查询日志列表json
    $.ajax(
	 {
         type: "post",
         dataType: "text", //返回数据格式为text
         url:"http://localhost:8080/selectRizhiList",
         success:function(data)
         {
         	data = eval("("+data+")");//解析json
	     	var falg=0;
	     	$.each(data.rizhilist,function(i,d){
	     	 	var mysearchInput=$("#searchInput").val();

                var mydatetime = new Date(d.rizhitime);//转换时间
                mydatetime=mydatetime.Format("yyyy-MM-dd");

	     	 	if(d.rizhitexthead==mysearchInput||d.rizhiauthor==mysearchInput||d.rizhitime==mysearchInput)
	     	 	{
	     	 		$('#mySearchDivResult').append(	
					  "<a href=\"#\" class=\"list-group-item\" onclick=\"tiaoZhuang("
					  +d.rizhiid
		    		  +")\">"
					  +"<font style=\"font-size: 18px;\">"
					  +d.rizhitexthead
					  +"</font>"
					  +"<div class=\"mylitext\">"
					  +"<span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\" style=\"color: #C4E3F3;\">"
					  +"<font> "
					  +d.rizhiauthor
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-thumbs-up\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +d.rizhizang
					  +"</font>"
					  +"</span>"
					  +"<span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\" style=\"color: #C4E3F3;margin-left: 10px;\">"
					  +"<font> "
					  +mydatetime
					  +"</font>"
					  +"</span>"
					  +"</div>"
					  +"</a>"
	    		  	);
	     	 		//alert("标题："+d.rizhiTextHead+"作者："+d.rizhiAuthor+"时间："+d.rizhiTime);
	     	 		falg=1;

	     	 	}

	     	});
	     
	       //没收到东西
	        if(falg==0)
	        {
	        	$('#mytishiModal').modal();
	        }
	        else//搜索到东西打开界面
	        {
	        	$('#myzhezhao').fadeIn(200);
	     	 	$('#mySearchDiv').fadeIn(500).css( {"height":"75%"});	
	        }
	     

	     },
		 error:function()
		 {
			alert("日志列表查询失败！"); 
		 }
	 }
	 );
}


function closeSearchDiv()
{
	$('#myzhezhao').fadeOut(200);
	$('#mySearchDiv').fadeOut(500).css( {"height":"0px"});
}


function tiaobaidu()
{
	 var mysearchInput=$("#searchInput").val();
	 window.location.href="https://www.baidu.com/s?word="+mysearchInput;
}


Date.prototype.Format = function(fmt) {
    var o = {
        "M+": this.getMonth() + 1,                 //月份
        "d+": this.getDate(),                    //日
        "h+": this.getHours(),                   //小时
        "m+": this.getMinutes(),                 //分
        "s+": this.getSeconds(),                 //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}
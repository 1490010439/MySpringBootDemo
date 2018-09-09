

function initRiZhi()
{
	
//	var mytexthead=$("#mytexthead").text();
//	var myrizhiauthor=$("#myrizhiauthor").text();
//	var myrizhitext=$("#myrizhitext").text();
//	var myrizhizang=$("#myrizhizang").text();
//	var myrizhitime=$("#myrizhitime").text();
//	alert(mytexthead);	
//	alert(myrizhiauthor);
//	alert(myrizhitext);
//	alert(myrizhizang);
//	alert(myrizhitime);
	

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
	    		//alert(d.rizhiTextHead);
	    		
	    		 var myURL=window.location.href;
				 var myrizhiid=myURL.split("?")[1];
				    //alert(myrizhiid);

				    if(myrizhiid==d.rizhiid)
				    {
                        var mydatetime = new Date(d.rizhitime);//转换时间
                        mydatetime=mydatetime.Format("yyyy-MM-dd");

							$("#mytexthead").text(d.rizhitexthead);
							$("#myrizhiauthor").text(d.rizhiauthor);
							$("#myrizhitext").text(d.rizhitext);
							$("#myrizhizang").text(d.rizhizang);
							$("#myrizhitime").text(mydatetime);
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
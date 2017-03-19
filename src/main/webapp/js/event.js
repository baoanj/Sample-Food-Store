window.onload = function() {
    var y = document.getElementsByTagName("input");
    for (var i = 0; i < y.length; i++) {
    	clickfun(y[i]);
    }
}

function clickfun(y) {
	y.onclick = function() {
		displayCity(y.value);
	}
}

function displayCity(operator) {
	if (operator == "广州") {
	    document.getElementById("display").innerHTML = "以下是为您推荐的广州美食";
	    document.getElementById("foodImage").src = "images/guangzhou.jpg";
	}
	if (operator == "北京") {
	    document.getElementById("display").innerHTML = "以下是为您推荐的北京美食";
	    document.getElementById("foodImage").src = "images/beijing.jpg";
	}
	if (operator == "上海") {
	    document.getElementById("display").innerHTML = "以下是为您推荐的上海美食";
	    document.getElementById("foodImage").src = "images/shanghai.jpg";
	}
}
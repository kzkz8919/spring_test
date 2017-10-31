function showtime(id) {
	var time = new Date();
	var m = time.getMonth() + 1;
	var t = time.getFullYear() + "-" + m + "-" 
			+ time.getDate() + " "+ time.getHours() + ":" 
			+ time.getMinutes() + ":"+ time.getSeconds();
	document.getElementById("showtime").innerHTML = t;
}
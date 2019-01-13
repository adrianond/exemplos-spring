var disableButtons = function() {
	$("button[type=button]").attr("disabled", "disabled");
}

var enableButtons = function() {
	$("button[type=button]").removeAttr("disabled");
}
var errors = 0;

function onReset() {
	errors = 0;
	doReset();
}

function onSubmit() {
	errors = 0;
	doRevalidate();
	if (errors == 0)
		return true;
	else
		return false;
}

function setError(id, message) {

	var msg = "<ul> <li><span>" + message + "</span></li> </ul>";
	document.getElementById(id).innerHTML = msg;
}

/** Validation Functions BEGIN* */
function isEmpty(str) {
	return (str == null) || (str.length == 0);
}

function isEmail(str) {
	var re = /^([a-zA-Z0-9_\.\-\!\@\#\$\%\^\&\*\(\)\+\=\{\[\}\]\;\:\?\/\,\<\>\~\*])+\@(([a-zA-Z0-9_\.\-\!\@\#\$\%\^\&\*\(\)\+\=\{\[\}\]\;\:\?\/\,\<\>\~\*])+\.)+([a-zA-Z0-9_\.\-\!\@\#\$\%\^\&\*\(\)\+\=\{\[\}\]\;\:\?\/\,\<\>\~\*]{2,4})+$/;
	return re.test(str);
}
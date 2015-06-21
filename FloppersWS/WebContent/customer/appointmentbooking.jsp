<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<tags:dependencies></tags:dependencies>



<tags:script src="customer/appointmentbooking.js" />
<style>
#calendar_input {
	border: 1px solid #909090;
	font-family: Tahoma;
	font-size: 12px;
}

#calendar_icon {
	vertical-align: middle;
	cursor: pointer;
}
</style>
</head>
<body onload="doOnLoad();">

	<tags:header />
	<s:form action="appointmentbooking">
		<s:actionerror />
		<tr>
			<tags:rowOdd>

				<td><label>Appointment Date</label></td>
				<td><input type="text" name="appointmentDate"
					id="appointmentDate"> <span><img
						id="appointmentDate_icon" src="../codebase/imgs/calendar.gif"
						border="0"></span></td>
				<td><div id="appointmentDate_error" class="level4_error">
						<s:fielderror fieldName="appointmentDate">
						</s:fielderror>
					</div></td>
			</tags:rowOdd>
		</tr>

		<tags:rowEven>
			<td><label>Time</label></td>
			<td><select id="hour" name="hour">
					<option value="">--- Please Select --</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
			</select></td>
			<td><select id="minute" name="minute">
					<option value="">--- Please Select --</option>
					<option value="09">09</option>
					<option value="30">30</option>
			</select></td>

			<td><div id="hour_error" class="level4_error">
					<s:fielderror fieldName="hour">
					</s:fielderror>
				</div></td>
			<td><div id="minute_error" class="level4_error">
					<s:fielderror fieldName="minute">
					</s:fielderror>
				</div></td>
		</tags:rowEven>
		<tags:rowOdd>
			<td>Email address</td>
			<td><input type="text" id="emailID" name="emailID"></td>
			<td><div id="emailID_error" class="level4_error">
					<s:fielderror fieldName="emailID">
					</s:fielderror>
				</div></td>
		</tags:rowOdd>
		<tags:rowEven>
			<tags:submitreset />
		</tags:rowEven>
	</s:form>
	<tags:footer />
</body>
</html>
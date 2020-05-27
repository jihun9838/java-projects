<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>

<head>
	<title>Calendar</title>
	<meta charset="EUC-KR" />
	<link rel="stylesheet" href="./style.css">

	<script type="text/javascript">
		function main() {
			let curDate = new Date();
			setTimeView();
			setTimeDateView(curDate);


			setYearMonth(curDate);
			setCalendarDate(curDate);


			document.getElementById('calendarBeforeBtn').addEventListener('click', PrevMonth);
			document.getElementById('calendarAfterBtn').addEventListener('click', NextMonth)
		}





		function setTimeView() {
			let timeView = document.getElementById('timeView');
			timeView.innerHTML = getCurrentTime();

			setInterval(() => {
				timeView.innerHTML = getCurrentTime();
			}, 1000);
		}

		function getCurrentTime() {
			let curDate = new Date()
			return NightAndDay(curDate.getHours()) + ':' +
				AddZero(curDate.getMinutes()) + ':' +
				AddZero(curDate.getSeconds());
		}



		function setTimeDateView(curDate) {
			let s = curDate.getFullYear() + "�� " +
				(curDate.getMonth() + 1) + "�� " +
				curDate.getDate() + "�� " +
				getDay(curDate.getDay());

			document.getElementById('timeDateView').innerHTML = s;
		}

		function setYearMonth(curDate) {
			let s = curDate.getFullYear() + "�� " + (curDate.getMonth() + 1) + "�� ";
			return document.getElementById('calendarYearMonth').innerHTML = s;
		}

		function setCalendarDate(curDate) {
			let calendarDate = document.getElementById('calendarDate');
			calendarDate.innerHTML = '';


			let dayNEndDate = getCurrentCalender(curDate.getFullYear(), curDate.getMonth());
			calendarDate.appendChild(
				createTable(
					dayNEndDate.day,
					dayNEndDate.endDate,
					curDate
				)
			);
		}

		function getCurrentCalender(year, month) {
			return {
				day: new Date(year, month, 1).getDay(),
				endDate: new Date(year, month + 1, 0).getDate()
			}
		}


		function createTable(day, endDate, curDate) {
			let dayArr = ['��', '��', 'ȭ', '��', '��', '��', '��'];
			let dateCnt = 1;

			let table = document.createElement("table");
			for (let i = 0; i < (endDate + day) / 7 + 1; ++i) {
				let tr = document.createElement('tr');
				for (let j = 0; j < 7; ++j) {
					let td = document.createElement('td');

					if (dateCnt == curDate.getDate() &&
					 curDate.getMonth() + 1 == document.getElementById('calendarYearMonth').innerHTML.split('��')[1].split('��')[0]
					 )
					  td.setAttribute('class', 'active');
					if (i == 0) td.innerHTML = dayArr[j];
					else if (i == 1 && j < day) td.innerHTML = "";
					else td.innerHTML = dateCnt++;

					tr.appendChild(td);

					if (dateCnt > endDate) break;
				}
				table.appendChild(tr);
			}
			return table;
		}





		function NightAndDay(time) {
			let s = "���� ";
			if (time >= 12) {
				if (time != 12) time -= 12;
				s = "���� ";
			}
			return s + AddZero(time);
		}

		function AddZero(time) {
			if (time < 10) return "0" + time;
			return time;
		}

		function getDay(day) {
			let dayArr = ['��', '��', 'ȭ', '��', '��', '��', '��'];
			return dayArr[day] + "����";
		}

		function getCalender(m) {
			let cnt = 0;
			let s = "<table border='2'><tr>"
			s += "<td>" + (m + 1) + "��</td></tr><br><br>";
			s += "<tr><td>��</td><td>��</td><td>ȭ</td><td>��</td><td>��</td><td>��</td><td>��</td></tr>";

			s += "<tr>";
			for (let i = 0; i < new Date(2020, m, 1).getDay(); ++i, ++cnt) s += "<td></td>";

			for (let d = 1; d < 33; ++d, ++cnt) {
				if (new Date(2020, m, d).getMonth() != m) break;

				s += "<td>" + new Date(2020, m, d).getDate() + "</td>";

				if (cnt % 7 == 6) s += "</tr><tr>";

			}
			s += "<br><br><br></tr></table>";
			return s;
		}

		function PrevMonth() {
			let calYearMonth = document.getElementById('calendarYearMonth');
			let yearMonth = calYearMonth.innerHTML;
			let y = parseInt(yearMonth.split('��')[0]);
			let m = parseInt(yearMonth.split('��')[1].split('��')[0]);
			
			if(m == 1) {
				y -= 1;
				m = 12;
			}
			else m -= 1;
			calYearMonth.innerHTML = y + "��  " + m + "��";
			setCalendarDate(new Date(y, m));
		}
		
		function NextMonth() {
			let calYearMonth = document.getElementById('calendarYearMonth');
			let yearMonth = calYearMonth.innerHTML;
			let y = parseInt(yearMonth.split('��')[0]);
			let m = parseInt(yearMonth.split('��')[1].split('��')[0]);
			
			if(m == 12) {
				y += 1;
				m = 1;
			}
			else m += 1;
			calYearMonth.innerHTML = y + "��  " + m + "��";
			setCalendarDate(new Date(y, m));
		}
		</script>

</head>

<body onload="javascript:main()">
	<div id="timeMain">
		<div id="timeView">�ð�</div>
		<div id="timeWindowCtrlBtn">��</div>
		<div id="timeDateView">��¥</div>
	</div>
	<div id="calendarMain">
		<div id="calendarYearMonth">�� ��</div>
		<div id="calendarWindowCtrlBtn">��</div>
		<div id="calendarDate">��¥</div>
		<div id="calendarBeforeBtn">&lt;</div>
		<div id="calendarAfterBtn">&gt;</div>
	</div>
</body>

</html>
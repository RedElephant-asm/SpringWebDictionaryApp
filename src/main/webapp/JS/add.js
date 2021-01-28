var keyTextInput = document.getElementById("keyTextInput");
var wordTextInput = document.getElementById("wordTextInput");
var mainTable = document.getElementById("mainTable");

function addRecord(){
	addRecordToTable();
	sendRecord();
}

function sendRecord(){
}

function addRecordToTable(){
	var tbodyRef = mainTable.getElementsByTagName("tbody")[0];
	var newRow = mainTable.insertRow(2);
	var keyCell = newRow.insertCell(0), wordCell = newRow.insertCell(1);
	keyCell.appendChild(document.createTextNode(keyTextInput.value));
	wordCell.appendChild(document.createTextNode(wordTextInput.value));
}
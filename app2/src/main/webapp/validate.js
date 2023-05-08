

function validateMyForm()
{
	var myForm = document.forms[0];
	var firstName = myForm.firstName;
	if(firstName.value.length == 0)
	{
		alert("please enter firstName");
		firstName.focus();
		return false;
	}

	var lastName = myForm.lastName;
	if(lastName.value.length == 0)
	{
		alert("please enter lastName");
		lastName.focus();
		return false;
	}
	return true;
}

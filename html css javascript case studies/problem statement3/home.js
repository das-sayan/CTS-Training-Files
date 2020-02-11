function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value; 
var mobile=document.myform.mobile.value;   
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<7){  
  alert("Password must be at least 7 characters long.");  
  return false;  
  } else if (mobile==null || mobile==""){  
  alert("Please Enter Primary Mobile No.");  
  return false;  
}
}  

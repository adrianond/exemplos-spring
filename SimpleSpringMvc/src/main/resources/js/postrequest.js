$(document).ready(function() {
	
	var url = window.location;
	
	// SUBMIT FORM
    $("#customerForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
    	// isso vai cancelar qualquer ação padrão do elemento escolhido
		//event.preventDefault();
		//ajaxPost();
		
		
		        alert("button");
		 
	});
    
   
    
    function ajaxPost(){
    	alert("alert");
    	
    	// PREPARE FORM DATA
    	var formData = {
    		firstname : $("#firstname").val(),
    		lastname :  $("#lastname").val()
    	}
    	
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : url + "/postcustomer",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done"){
					$("#postResultDivSucess").html("<strong>" + "Post Successfully! Customer's Info: FirstName = " 
							+ result.data.firstname + " ,LastName = " + result.data.lastname + "</strong>");
				}else{
					$("#postResultDivError").html("<strong>" + "Post Error" + "</strong>");
					console.log("ERROR: ", e);
				}
				console.log(result);
			},
			error : function(e) {
				$("#postResultDivError").style.display = 'none';
				$('#postResultDivError').hide();
				$("#postResultDivError").html("<strong>" + "Post Error = " + e + "</strong>");
				console.log("ERROR: ", e);
			}
		});
    	
    	// Reset FormData after Posting
    	resetData();
 
    }
    
    function resetData(){
    	$("#firstname").val("");
    	$("#lastname").val("");
    }
})
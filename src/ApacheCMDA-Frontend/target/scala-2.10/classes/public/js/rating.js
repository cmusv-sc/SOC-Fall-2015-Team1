$('.rating_star').change(function(){ 
	var tmp1 = document.getElementById("rating_hidden");
    tmp1.value = this.value;   
	$('.choice').text( this.value + ' stars' );  
} )

$('.radio_owner').change(function(){ 
	var tmp2 = document.getElementById("input_hidden2");
    tmp2.value = this.value;   
	$('.choice').text( this.value + ' stars' );  
} )


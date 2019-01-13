$(document).ready(function() {
	
	
	$('.datemask').mask('00/00/0000');
	$('.timemask').mask('00:00:00');
	$('.datetimemask').mask('00/00/0000 00:00:00');
	$('.cepmask').mask('00000-000');
	$('.phonemask').mask('0000-0000');
	$('.phone_with_dddmask').mask('(00) 0000-0000');
	$('.phone_usmask').mask('(000) 000-0000');
	$('.mixedmask').mask('AAA 000-S0S');
	$('.cpfmask').mask('000.000.000-00', {reverse: true});
	$('.cnpjmask').mask('00.000.000/0000-00', {reverse: true});
	$('.moneymask').mask('000.000.000.000.000,00', {reverse: true});
	$('.money2').mask("#.##0,00", {reverse: true});
	$('.ip_addressmask').mask('0ZZ.0ZZ.0ZZ.0ZZ', {
	    translation: {
	      'Z': {
	        pattern: /[0-9]/, optional: true
	      }
	    }
	  });
	  $('.ip_addressmask').mask('099.099.099.099');
	  $('.percentmask').mask('##0,00%', {reverse: true});
	  $('.clear-if-not-matchmask').mask("00/00/0000", {clearIfNotMatch: true});
	  $('.placeholdermask').mask("00/00/0000", {placeholder: "__/__/____"});
	  $('.fallbackmask').mask("00r00r0000", {
	      translation: {
	        'r': {
	          pattern: /[\/]/,
	          fallback: '/'
	        },
	        placeholder: "__/__/____"
	      }
	    });
	  $('.selectonfocusmask').mask("00/00/0000", {selectOnFocus: true});
	});
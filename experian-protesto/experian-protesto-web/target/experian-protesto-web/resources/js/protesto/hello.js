$(document).ready(function(){

	//enviar para o contoller
	$('#teste').click(function() {
		alert("oi");
			submitconsultaHistoricoSolicitacoesLote();
	});

});

function submitconsultaHistoricoSolicitacoesLote() {
		$.ajax({
			type : 'POST',
			url : 'hello',
			datatype : 'json',
			error : onErroConsultaHistoricoSolicitacoes,
			success : onSucessoConsultaHistoricoSolicitacoes,
			complete : function(jqXHR, textStatus) {
				$('#vidroCarregando').hide();
			}
		});
}


//sucesso
function onSucessoConsultaHistoricoSolicitacoes(obj) {
	alert(" ola " + obj);
}

//erro: 
function onErroConsultaHistoricoSolicitacoes(){
	var mensagemErro = 'Erro na chamada';
	
	$("#consultaHistoricoSolicitacaoErro").show();
	$('#consultaHistoricoSolicitacaoErro #response #lista').append('Consulta Hist\u00f3rico Solicita\u00e7\u00f5es');
	$('#consultaHistoricoSolicitacaoErro #response #span').append('Erro na Consulta Hist\u00f3rico Solicita\u00e7\u00f5es ');
	$('#consultaHistoricoSolicitacaoErro #response #p_trace').append(mensagemErro);
	$('#consultaHistoricoSolicitacaoErro #response').parent().parent().show();

	$(".erro-slide").click(function() {
		var elem = $(this);
		$('.detalhes').slideToggle('slow', function() {
			if ($(this).is(":visible")) {
				elem.text('Ocultar detalhes do erro ');
			} else {
				elem.text('Exibir detalhes do erro ');
			}
		});
	});

	if ($('pre')[0]) {
		console.log('Erro com detalhes');
	} else {
		$(".text-code").hide();
	}
}


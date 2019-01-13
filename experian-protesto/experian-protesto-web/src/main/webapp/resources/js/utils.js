/** Biblioteca JS de funções gerais
 * 
 */

/* Esse método deve ser refatorado para implementar regra gramatical, substituindo o hard-code  */
function pronomeDemonstrativo(textoSucessor) {
	var pronome;
	
	if(textoSucessor == null || textoSucessor.trim() == '') {
		pronome = '';
	} else {
        textoSucessor = textoSucessor.substring(0, textoSucessor.indexOf(" ")).toLowerCase();		
		if(textoSucessor.length >= 6 
				&& (textoSucessor.substring(0,6) == 'exclus'
					  || textoSucessor.substring(0,6) == 'reincl')) {
			pronome = 'essa';
		} else {
			pronome = 'esse';
		}
	}
	
	return pronome;
}
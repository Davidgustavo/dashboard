window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.TestePaginas = window.blockly.js.blockly.TestePaginas
		|| {};

/**
 * testePaginas
 */
window.blockly.js.blockly.TestePaginas.listas = function() {

	var item, alunado;
	alunado = this.cronapi.object.createObjectFromString('{}\n');
	this.cronapi.object.setProperty(alunado, 'viewValue', 'Alunado');
	this.cronapi.screen.notify('success', alunado);
}

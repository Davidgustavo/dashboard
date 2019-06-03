window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Avaliar = window.blockly.js.blockly.Avaliar || {};

/**
 * Avaliar
 */
window.blockly.js.blockly.Avaliar.Avaliar = function() {
	this.cronapi.util.callServerBlocklyNoReturn(
			'blockly.InsereAvalicao:insere_Avalicao', this.cronapi.screen
					.getValueOfField("vars.custo_beneficio"),
			this.cronapi.screen.getValueOfField("vars.tempo_de_entrega"),
			this.cronapi.screen.getValueOfField("vars.Embalagem"),
			this.cronapi.screen.getValueOfField("vars.qualidade"),
			this.cronapi.screen.getValueOfField("vars.comentario"),
			this.cronapi.screen.getValueOfField(this.cronapi.screen
					.getParam('pedido\n')));
	this.cronapi.screen.notify('success', 'Pedido avaliado com Sucesso\n');
	this.cronapi.screen.changeValueOfField("vars.comentario", '0');
	this.cronapi.screen.changeValueOfField("vars.custo_beneficio", '0');
	this.cronapi.screen.changeValueOfField("vars.Embalagem", '0');
	this.cronapi.screen.changeValueOfField("vars.qualidade", '0');
	this.cronapi.screen.changeValueOfField("vars.tempo_de_entrega", '0');
}

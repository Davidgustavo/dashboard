package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class InsereAvalicao {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param custo_beneficio
	 * @param tempo_de_entrega
	 * @param embalagem
	 * @param qualidade
	 * @param comentario
	 * @param id_pedido
	 * @return Var
	 */
	// insere_Avalicao
	public static Var insere_Avalicao(Var custo_beneficio, Var tempo_de_entrega, Var embalagem, Var qualidade,
			Var comentario, Var id_pedido) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.database.Operations.insert(Var.valueOf("app.entity.Avaliacao"),
						Var.valueOf("custo_beneficio", custo_beneficio),
						Var.valueOf("pedido",
								cronapi.database.Operations.newEntity(Var.valueOf("app.entity.Pedido"),
										Var.valueOf("id", id_pedido))),
						Var.valueOf("embalagem", embalagem), Var.valueOf("qualidade_da_comida", qualidade),
						Var.valueOf("comentario", comentario), Var.valueOf("tempo_de_entrega", tempo_de_entrega));
				cronapi.database.Operations.execute(Var.valueOf("app.entity.Pedido"),
						Var.valueOf("update Pedido set status = :status where id = :id"),
						Var.valueOf("status", Var.valueOf("true")), Var.valueOf("id", id_pedido));
				return Var.VAR_NULL;
			}
		}.call();
	}

}

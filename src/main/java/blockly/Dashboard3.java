package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Dashboard3 {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Dashboard
	public static Var Dashboard3() throws Exception {
		return new Callable<Var>() {

			private Var cont = Var.VAR_NULL;

			public Var call() throws Exception {
				cont = cronapi.database.Operations.query(Var.valueOf("app.entity.Pedido"),
						Var.valueOf("select COUNT(p), p.user.name from Pedido p  group by p.user.name"));
				cronapi.chart.Operations.createChart(Var.valueOf("dashboard3"), Var.valueOf("pie"),
						cronapi.database.Operations.getColumn(cont, Var.valueOf("this[1]")), Var.VAR_NULL,
						cronapi.database.Operations.getColumn(cont, Var.valueOf("this[0]")));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
